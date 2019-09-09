package chapter04;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
    public void add() {
        System.out.println("DemoMethodService.add()");
    }

    public void subtract() {
        System.out.println("DemoMethodService.subtract()");
    }
}
