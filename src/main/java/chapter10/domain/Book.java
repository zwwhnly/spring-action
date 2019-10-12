package chapter10.domain;

import java.util.Date;

public class Book {
    private Long bookId;

    private String bookName;

    private String author;

    private String createBy;

    private Date createTime;

    private String modifyBy;

    private Date modifyTime;

    public Book(String bookName, String author, String createBy) {
        this.bookName = bookName;
        this.author = author;
        this.createBy = createBy;
        this.createTime = new Date();
        this.modifyBy = createBy;
        this.modifyTime = new Date();
    }

    public Book(Long bookId, String bookName, String author, String modifyBy) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.modifyBy = modifyBy;
    }

    public Book() {

    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
