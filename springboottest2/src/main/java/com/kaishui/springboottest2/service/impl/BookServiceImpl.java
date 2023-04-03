package com.kaishui.springboottest2.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaishui.springboottest2.domain.Book;
import com.kaishui.springboottest2.mapper.BookMapper;
import com.kaishui.springboottest2.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {
    @Override
    public Boolean delete(Integer id) {
        return null;
    }

    @Override
    public Boolean modify(Book book) {
        return null;
    }

    @Override
    public Boolean insert(Book book) {
        return null;
    }

    @Override
    public Book get(Integer id) {
        return null;
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        return null;
    }
}
