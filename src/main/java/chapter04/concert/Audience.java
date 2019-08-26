package chapter04.concert;

import org.aspectj.lang.annotation.*;

/**
 * 观众
 * 使用@Aspect注解定义为切面
 */
@Aspect
public class Audience {
    /**
     * 可复用的切点
     */
    @Pointcut("execution(* chapter04.concert.Performance.perform(..))")
    public void perform() {
    }

    /**
     * 表演之前,观众就座
     */
    @Before("perform()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    /**
     * 表演之前,将手机调至静音
     */
    @Before("perform()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    /**
     * 表演结束,不管表演成功或者失败
     */
    @After("perform()")
    public void finish() {
        System.out.println("perform finish");
    }

    /**
     * 表演之后,鼓掌
     */
    @AfterReturning("perform()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    /**
     * 表演失败之后,观众要求退款
     */
    @AfterThrowing("perform()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
