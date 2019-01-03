package pers.zhangdi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.zhangdi.dao.BookMapper;
import pers.zhangdi.service.BookService;
import pers.zhangdi.vo.Book;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookmapper;

    public List<Book> doSelectLikeName(String keyname) {
        List<Book> list = bookmapper.findLikeName(keyname);
        return list;
    }

    public List<Book> doSelectAll() {
        List<Book> list = bookmapper.findAll();
        return list;
    }
}
