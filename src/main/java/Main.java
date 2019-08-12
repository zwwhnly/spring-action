import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        Book book = applicationContext.getBean("book", Book.class);
        book.printBookInfo();

        Author author = applicationContext.getBean("author", Author.class);
        author.printAuthorInfo();
    }
}
