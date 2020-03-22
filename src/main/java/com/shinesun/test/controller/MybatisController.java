package com.shinesun.test.controller;

import com.shinesun.common.entity.ReturnResult;
import com.shinesun.test.entity.Book;
import com.shinesun.test.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 这里是类说明.
 *
 * @className: MybatisController
 * @author: 胡永持
 * @date: 2020-03-22 08:13
 */
@RestController
@RequestMapping("/book")
public class MybatisController {

    private Logger logger = LoggerFactory.getLogger(MybatisController.class);

    @Resource
    private BookService bookService;

    /**
     * 查询图书列表
     * @title getBookList
     * @author 胡永持
     * @date 2020/3/22 9:13
     * @param
     * @return java.util.List<com.shinesun.test.entity.Book>
     */
    @GetMapping("/getBookList")
    public List<Book> getBookList() {
        return bookService.getBookList();
    }

    /**
     * 新增图书
     * 此处只是简单的新增，没有做数据校验，
     * @title addBook
     * @author 胡永持
     * @date 2020/3/22 9:05
     * @param book
     * @return com.shinesun.common.entity.ReturnResult
     */
    @GetMapping("/addBook")
    public ReturnResult addBook(Book book) {
        ReturnResult returnResult = new ReturnResult();
        try {
            returnResult = bookService.addBook(book);
        } catch (Exception e) {
            logger.error("新增图书异常: error book: {}", book, e);
            returnResult.setMessage("服务器异常,请稍后重试");
        }
        return returnResult;
    }
}