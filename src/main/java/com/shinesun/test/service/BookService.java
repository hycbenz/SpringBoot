package com.shinesun.test.service;

import com.shinesun.common.entity.ReturnResult;
import com.shinesun.test.entity.Book;

import java.util.List;

/**
 * 这里是类说明.
 *
 * @className: BookService
 * @author: 胡永持
 * @date: 2020-03-22 08:23
 */
public interface BookService {

    /**
     * 查询所有图书列表
     * @title getBookList
     * @author 胡永持
     * @date 2020/3/22 8:24
     * @param
     * @return java.util.List<com.shinesun.test.entity.Book>
     */
    List<Book> getBookList();

    /**
     * 新增图书
     * @title addBook
     * @author 胡永持
     * @date 2020/3/22 9:09
     * @param book
     * @return com.shinesun.common.entity.ReturnResult
     */
    ReturnResult addBook(Book book) throws Exception;
}