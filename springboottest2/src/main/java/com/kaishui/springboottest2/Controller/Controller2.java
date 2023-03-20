package com.kaishui.springboottest2.Controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.google.gson.Gson;
import com.kaishui.springboottest2.domain.Book;
import com.kaishui.springboottest2.mapper.BookMapper;
import com.kaishui.springboottest2.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@SuppressWarnings("all")
@RequestMapping("/books")//设定公共的请求路径
public class Controller2 {
    @Autowired
    BookMapper bookMapper;
    @Autowired
    IBookService bookService;//注入业务层接口
    private Gson gson = new Gson();

    //增删改查操作
    @GetMapping//查全部
    public List<Book> getAll(){
        return bookService.list();
    }

    @PostMapping//增加
    public Boolean save(@RequestBody Book book){
        return bookService.save(book);
    }
    @PutMapping//修改
    public Boolean update(@RequestBody Book book){
        return bookService.modify(book);
    }
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id){
        return bookService.delete(id);
    }
    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id){
        return bookService.getById(id);
    }
    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return bookService.getPage(currentPage,pageSize);
    }
}
