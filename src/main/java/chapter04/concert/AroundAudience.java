package chapter04.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AroundAudience {
    /**
     * 可重用的切点
     */
    @Pointcut("execution(* chapter04.concert.Performance.perform(..))")
    public void perform() {
    }

    @Around("perform()")
    public void watchPerform(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Taking seats");
            System.out.println("Silencing cell phones");

            joinPoint.proceed();

            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        } finally {
            System.out.println("perform finish");
        }
    }
}
