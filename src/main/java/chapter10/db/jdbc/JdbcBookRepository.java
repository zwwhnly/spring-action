package chapter10.db.jdbc;

import chapter10.db.BookRepository;
import chapter10.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Calendar;
import java.util.Date;

public class JdbcBookRepository implements BookRepository {
    private static final String SQL_INSERT_BOOK =
            "INSERT INTO book(book_name, author, create_by, create_time, modify_by, modify_time) VALUES (?,?,?,?,?,?);";
    private static final String SQL_UPDATE_BOOK =
            "UPDATE Book SET book_name = ?,author = ?,modify_by = ?,modify_time=? WHERE book_id = ?;";
    private static final String SQL_SELECT_BOOK =
            "SELECT book_id,book_name,author,create_by,create_time,modify_by,modify_time FROM book WHERE book_id = ?;";

    @Autowired
    private DataSource dataSource;

    @Override
    public void addBook(Book book) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());

            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT_BOOK);
            preparedStatement.setString(1, book.getBookName());
            preparedStatement.setString(2, book.getAuthor());
            preparedStatement.setString(3, book.getCreateBy());
            preparedStatement.setTimestamp(4, new Timestamp(calendar.getTimeInMillis()));
            preparedStatement.setString(5, book.getModifyBy());
            preparedStatement.setTimestamp(6, new Timestamp(calendar.getTimeInMillis()));

            preparedStatement.execute();
        } catch (SQLException e) {
            // 异常处理相关代码
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // 异常处理相关代码
            }
        }
    }

    @Override
    public void updateBook(Book book) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());

            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE_BOOK);
            preparedStatement.setString(1, book.getBookName());
            preparedStatement.setString(2, book.getAuthor());
            preparedStatement.setString(3, book.getModifyBy());
            preparedStatement.setTimestamp(4, new Timestamp(calendar.getTimeInMillis()));
            preparedStatement.setLong(5, book.getBookId());

            preparedStatement.execute();
        } catch (SQLException e) {
            // 异常处理相关代码
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // 异常处理相关代码
            }
        }
    }

    @Override
    public Book findBook(long bookId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ResultSet resultSet = null;
        Book book = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECT_BOOK);
            preparedStatement.setLong(1, bookId);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                book = new Book();
                book.setBookId(resultSet.getLong("book_id"));
                book.setBookName(resultSet.getString("book_name"));
                book.setAuthor(resultSet.getString("author"));
                book.setCreateBy(resultSet.getString("create_by"));
                book.setCreateTime(resultSet.getTimestamp("create_time"));
                book.setModifyBy(resultSet.getString("modify_by"));
                book.setModifyTime(resultSet.getTimestamp("modify_time"));
            }
        } catch (SQLException e) {
            // 异常处理相关代码
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // 异常处理相关代码
            }
        }

        return book;
    }
}
