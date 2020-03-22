package com.shinesun.test.service.impl;

import com.shinesun.common.entity.ReturnResult;
import com.shinesun.test.dao.BookDao;
import com.shinesun.test.entity.Book;
import com.shinesun.test.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 这里是类说明.
 *
 * @className: BookServiceImpl
 * @author: 胡永持
 * @date: 2020-03-22 08:23
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao;

    @Override
    public List<Book> getBookList() {
        return bookDao.selectBookList();
    }

    @Override
    public ReturnResult addBook(Book book) throws Exception {
        if (bookDao.insertBook(book) > 0) {
            return new ReturnResult(true, "新增图书成功!");
        }
        return new ReturnResult("新增图书失败!");
    }
}