package pers.zhangdi.dao;

import org.springframework.stereotype.Repository;
import pers.zhangdi.vo.Book;

import java.util.List;

@Repository
public interface BookMapper {
    public List<Book> findLikeName(String keyname);
    public List<Book> findAll();
}
