package pers.zhangdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.zhangdi.service.impl.BookServiceImpl;
import pers.zhangdi.vo.Book;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookServiceImpl bsl;

    @RequestMapping("/index.do")
    public String toIndex(Model model){
        List<Book> list = bsl.doSelectLikeName("中国");
        model.addAttribute("list",list);
        model.addAttribute("test","后台controller传递过来的信息");
        return "index";
    }
}
