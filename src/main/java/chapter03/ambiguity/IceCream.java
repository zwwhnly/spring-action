package chapter03.ambiguity;

import org.springframework.stereotype.Component;

@Component
@Cold
@Creamy
public class IceCream implements Dessert {
    @Override
    public void showName() {
        System.out.println("冰激凌");
    }
}
