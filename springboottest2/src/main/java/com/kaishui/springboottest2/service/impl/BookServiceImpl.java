package com.kaishui.springboottest2.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaishui.springboottest2.domain.Book;
import com.kaishui.springboottest2.mapper.BookMapper;
import com.kaishui.springboottest2.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {
    @Autowired
    BookMapper bookMapper;
    @Override
    public Boolean delete(Integer id) {
        return bookMapper.deleteById(id) > 0;
    }

    @Override
    public Boolean modify(Book book) {
        return bookMapper.updateById(book) > 0;
    }

    @Override
    public Boolean insert(Book book) {
        return bookMapper.insert(book) > 0;
    }

    @Override
    public Book get(Integer id) {
        return bookMapper.selectById(id);
    }
    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage,pageSize);
        bookMapper.selectPage(page,null);
        return page;
    }
}
