package chapter03.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExpressiveConfig.class);

        ExpressiveConfig expressiveConfig = context.getBean(ExpressiveConfig.class);

        expressiveConfig.outputResource();

        context.close();
    }
}
