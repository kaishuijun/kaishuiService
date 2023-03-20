package com.kaishui.springboottest2.Controller;

import com.google.gson.Gson;
import com.kaishui.springboottest2.Controller.utils.R;
import com.kaishui.springboottest2.mapper.BookMapper;
import com.kaishui.springboottest2.domain.Book;
import com.kaishui.springboottest2.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@SuppressWarnings("all")
@RequestMapping("/books")//设定公共的请求路径
public class Controller {
    @Autowired
    BookMapper bookMapper;
    @Autowired
    IBookService bookService;//注入业务层接口
    private Gson gson = new Gson();

    //增删改查操作
    @GetMapping//查1
    public R getAll(){
//        return new R(true,bookService.list());

        System.out.println(bookMapper.selectlist(3));
        return new R(true,bookMapper.selectlist(3));

    }


    @PostMapping//增加
    public void save(@RequestBody Book book){
//        R r = new R();
//        boolean flag = bookService.save(book);
//        r.setFlag(flag);
        bookMapper.insert(35,"开水","这是书名");
    }
    @PutMapping//修改
    public void update(@RequestBody Book book){

        bookMapper.update(17,"xxxx","xxxxx");
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        bookMapper.delete(id);
    }
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){

        return new R(true,bookService.getById(id));
    }
    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return new R(true,bookService.getPage(currentPage,pageSize));
    }
}
