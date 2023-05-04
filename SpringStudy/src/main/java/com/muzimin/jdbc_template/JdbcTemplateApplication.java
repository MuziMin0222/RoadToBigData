package com.muzimin.jdbc_template;

import com.muzimin.jdbc_template.entity.Book;
import com.muzimin.jdbc_template.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: 李煌民
 * @date: 2023-04-11 14:46
 **/
public class JdbcTemplateApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("jdbc_template01.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("1");
        book.setUserName("2");
        book.setUserStatus("3");
        bookService.addBook(book);
    }
}