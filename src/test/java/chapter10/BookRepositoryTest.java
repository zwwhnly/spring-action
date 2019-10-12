package chapter10;

import chapter10.config.DataSourceConfig;
import chapter10.db.BookRepository;
import chapter10.domain.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataSourceConfig.class)
public class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testAddBook() {
        Book book = new Book("Spring实战（第4版）", "Craig Walls", "申城异乡人");

        bookRepository.addBook(book);

        book = new Book("Java EE开发的颠覆者：Spring Boot实战", "汪云飞", "申城异乡人");

        bookRepository.addBook(book);

        book = new Book("RabbitMQ实战指南", "朱忠华", "申城异乡人");

        bookRepository.addBook(book);
    }

    @Test
    public void testUpdateBook() {
        Book book = new Book(4L, "Spring实战（第4版）", "Craig Walls", "zwwhnly");

        bookRepository.updateBook(book);

        book = new Book(5L, "Java EE开发的颠覆者：Spring Boot实战", "汪云飞", "zwwhnly");

        bookRepository.updateBook(book);

        book = new Book(6L, "RabbitMQ实战指南", "朱忠华", "zwwhnly");

        bookRepository.updateBook(book);
    }

    @Test
    public void testFindBook() {
        Book book = bookRepository.findBook(1L);
        Assert.assertNotNull(book);
        Assert.assertEquals(book.getBookName(), "Spring实战（第4版）");
    }
}
