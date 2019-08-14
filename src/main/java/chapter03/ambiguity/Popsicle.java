package chapter03.ambiguity;

import org.springframework.stereotype.Component;

@Component
@Cold
@Fruity
public class Popsicle implements Dessert {
    @Override
    public void showName() {
        System.out.println("棒冰");
    }
}
