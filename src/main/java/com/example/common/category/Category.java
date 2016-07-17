package com.example.common.category;

import com.example.common.core.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category extends BaseEntity {

    @Column
    private String name;

    @Embedded
    private CategoryList children = new CategoryList();


    public Category() {}

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryList getChildren() {
        return children;
    }

    public void setChildren(CategoryList children) {
        this.children = children;
    }

}
