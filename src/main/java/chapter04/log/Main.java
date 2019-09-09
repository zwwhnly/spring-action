package chapter04.log;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LogConfig.class);

        MockService mockService = context.getBean(MockService.class);

        mockService.mockMethodOne(1);
        mockService.mockMethodTwo(2);

        context.close();
    }
}
