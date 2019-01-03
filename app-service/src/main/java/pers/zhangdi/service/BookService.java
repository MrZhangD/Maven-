package pers.zhangdi.service;

import pers.zhangdi.vo.Book;

import java.util.List;

public interface BookService {
    public List<Book> doSelectLikeName(String keyname);
    public List<Book> doSelectAll();
}
