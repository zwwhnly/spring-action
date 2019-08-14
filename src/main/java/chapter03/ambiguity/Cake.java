package chapter03.ambiguity;

import org.springframework.stereotype.Component;

@Component
public class Cake implements Dessert {
    @Override
    public void showName() {
        System.out.println("蛋糕");
    }
}
