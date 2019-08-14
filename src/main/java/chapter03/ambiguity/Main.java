package chapter03.ambiguity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AmbiguityConfig.class);

        DessertShop dessertShop = context.getBean(DessertShop.class);
        dessertShop.showDessertName();

        context.close();
    }
}
