package com.shinesun.test.dao;

import com.shinesun.common.entity.ReturnResult;
import com.shinesun.test.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 此时使用的是：mapper文件夹放在dao文件夹下，此时会出现mapper文件不被
 *  编译到classes路径下需要在pom文件中进行配置进行解决
 *
 * @className: BookDao
 * @author: 胡永持
 * @date: 2020-03-22 08:23
 */
//@Mapper 此处的mapper注解和启动类的@MapperScan注解二选一
public interface BookDao {

    /**
     * 查询所有图书列表
     * @title selectBookList
     * @author 胡永持
     * @date 2020/3/22 8:25
     * @param
     * @return java.util.List<com.shinesun.test.entity.Book>
     */
    List<Book> selectBookList();

    /**
     * 新增图书
     * @title insertBook
     * @author 胡永持
     * @date 2020/3/22 9:10
     * @param book
     * @return int
     */
    int insertBook(Book book) throws Exception;
}