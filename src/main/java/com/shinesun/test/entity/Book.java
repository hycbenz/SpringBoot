package com.shinesun.test.entity;

/**
 * 这里是类说明.
 *
 * @className: Book
 * @author: 胡永持
 * @date: 2020-03-22 08:20
 */
public class Book {

    private Long id;
    private String bookName;    //书名
    private double price;       //价格
    private String author;      //作者

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}