package chapter03.el;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan
@PropertySource("classpath:chapter03/el/test.properties")
public class ExpressiveConfig {
    @Autowired
    private Environment environment;

    @Autowired
    private Book book;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{demoService.getAnother()?.toUpperCase()}")
    private String fromAnother;

    @Value("#{T(java.lang.Math).random()}")
    private double randomNumber;

    @Value("#{book.getBookName() + ' write by ' + book.getBookAuthor()}")
    private String bookDescr;

    @Value("#{systemProperties['os.name'] == 'Windows 7'?'Windows':'Linux'}")
    private String osType;

    public void outputResource() {
        System.out.println("book.name:" + environment.getProperty("book.name"));
        System.out.println("book.author:" + environment.getProperty("book.author"));

        /*String workCity = environment.getProperty("author.workcity");
        System.out.println("author.workcity:" + workCity);*/

        /*String workCity = environment.getRequiredProperty("author.workcity");
        System.out.println("author.workcity:" + workCity);*/

        String workCity = environment.getProperty("author.workcity", "上海");
        System.out.println("author.workcity:" + workCity);

        Integer authorAge = environment.getProperty("author.age", Integer.class);
        System.out.println("author.age:" + authorAge);

        boolean isMan = environment.getProperty("author.isMan", Boolean.class, true);
        System.out.println("author.isMan:" + isMan);

        System.out.println("book.name:" + book.getBookName());
        System.out.println("book.author:" + book.getBookAuthor());

        System.out.println("os.name:" + osName);
        System.out.println("demoService.another:" + fromAnother);

        System.out.println("randomNumber:" + randomNumber);

        System.out.println("bookDescr:" + bookDescr);

        System.out.println("osType:" + osType);
    }
}
