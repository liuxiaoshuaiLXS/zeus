package com.zeus.plate.dao;

import com.zeus.plate.pojo.Book;
import com.zeus.plate.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author smile
 * @date 2020/4/4 0004 下午 9:10
 */
public interface BookDao extends JpaRepository<Book, Integer> {
    List<Book> findAllByCategory(Category category);

    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}
