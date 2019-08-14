package chapter03.ambiguity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cookies implements Dessert {
    @Override
    public void showName() {
        System.out.println("饼干");
    }
}
