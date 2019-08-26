package chapter04.concert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);

        /*Performance performance = context.getBean(Performance.class);
        performance.perform();*/

        SleepNoMore sleepNoMore = context.getBean("sleepNoMore", SleepNoMore.class);
        sleepNoMore.perform();

        context.close();
    }
}
