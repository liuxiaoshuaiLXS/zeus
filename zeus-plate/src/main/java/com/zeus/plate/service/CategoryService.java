package com.zeus.plate.service;

import com.zeus.plate.dao.CategoryDao;
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
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public List<Category> list() {
        return categoryDao.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public Category get(int id) {
        Category c = categoryDao.findById(id).orElse(null);
        return c;
    }

}
