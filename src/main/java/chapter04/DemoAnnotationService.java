package chapter04;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {
        System.out.println("DemoAnnotationService.add()");
    }

    @Action(name = "注解式拦截的plus操作")
    public void plus() {
        System.out.println("DemoAnnotationService.plus()");
    }
}
