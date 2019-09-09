package chapter04.log;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccessLogAspectJ {
    @Pointcut("@annotation(AccessLog)")
    public void accessLog() {

    }

    @Around("accessLog()")
    public void recordLog(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            Object object = proceedingJoinPoint.proceed();

            AccessLog accessLog = ((MethodSignature) proceedingJoinPoint.getSignature()).getMethod().getAnnotation(AccessLog.class);

            if (accessLog != null && accessLog.recordLog() && object != null) {
                // 这里只是打印出来,一般实际使用时都是记录到公司的日志中心
                System.out.println("方法名称:" + proceedingJoinPoint.getSignature().getName());
                System.out.println("入参:" + JSON.toJSONString(proceedingJoinPoint.getArgs()));
                System.out.println("出参:" + JSON.toJSONString(object));
            }
        } catch (Throwable throwable) {
            // 这里可以记录异常日志到公司的日志中心
            throwable.printStackTrace();
        }
    }
}
