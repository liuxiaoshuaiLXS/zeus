package com.zeus.plate.service;

import com.zeus.plate.dao.BookDao;
import com.zeus.plate.pojo.Book;
import com.zeus.plate.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author smile
 * @date 2020/4/4 0004 下午 9:13
 */
@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    @Autowired
    CategoryService categoryService;


    public List<Book> list() {
        return bookDao.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public void addOrUpdate(Book book) {
        bookDao.save(book);
    }

    public void deleteById(int id) {
        bookDao.deleteById(id);
    }

    public List<Book> listByCategory(int cid) {
        Category category = categoryService.get(cid);
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        return bookDao.findAllByCategory(category);
    }

    public List<Book> search(String keywords) {
        return bookDao.findAllByTitleLikeOrAuthorLike('%' + keywords + '%', '%' + keywords + '%');
    }

}
