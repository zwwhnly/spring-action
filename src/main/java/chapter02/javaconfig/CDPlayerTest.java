package chapter02.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CDPlayerTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CDPlayerConfig.class);

        CompactDisc compactDisc = (SgtPeppers) applicationContext.getBean("sgtPeppers");
        compactDisc.play();

        CDPlayer cdPlayer = applicationContext.getBean(CDPlayer.class);
        cdPlayer.play();
    }
}
