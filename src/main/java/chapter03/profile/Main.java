package chapter03.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("prod");
        context.register(DataSourceConfig.class);
        context.refresh();

        /*DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());*/

        context.close();
    }
}
