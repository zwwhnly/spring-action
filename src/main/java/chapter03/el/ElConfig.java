package chapter03.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

@Configuration
@ComponentScan
@PropertySource("classpath:chapter03/el/test.properties")
public class ElConfig {
    @Value("I Love You!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("classpath:chapter03/el/test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    public void outputResource() {
        try {
            System.out.println("注入普通字符串：" + normal);
            System.out.println("注入操作系统属性：" + osName);
            System.out.println("注入表达式结果：" + randomNumber);
            System.out.println("注入其他Bean属性：" + fromAnother);

            System.out.println("注入文件资源：" + IOUtils.toString(testFile.getInputStream()));
            System.out.println("注入网址资源：" + IOUtils.toString(testUrl.getInputStream()));
            System.out.println("注入配置文件：" + bookName);
            System.out.println("注入配置文件：" + environment.getProperty("book.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
