package com.kaishui.springboottest2.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.kaishui.springboottest2.domain.Book;

public interface IBookService extends IService<Book> {

    Boolean delete(Integer id);
    Boolean modify(Book book);
    Boolean insert(Book book);
    Book get(Integer id);
    IPage<Book> getPage(int currentPage, int pageSize);
}
