package com.example.api;

import com.example.common.category.Category;
import com.example.common.category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryRestController {


    @Autowired
    private CategoryRepository repository;


    @ResponseBody
    @RequestMapping("/category/test/create")
    private Category testCreate() {
        Category category = new Category("sports");
        repository.save(category);
        return category;
    }


}
