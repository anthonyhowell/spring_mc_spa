package com.example.common.post;

import com.example.common.category.CategoryList;
import com.example.common.core.BaseEntity;
import org.hibernate.annotations.Type;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post extends BaseEntity {

    @Column
    private String title;

    @Column
    @Type(type = "text")
    private String description;

    @Embedded
    @AssociationOverrides({
            @AssociationOverride(
                    name = "categories",
                    joinTable = @JoinTable(
                            joinColumns = @JoinColumn(name = "post_id"),
                            inverseJoinColumns = @JoinColumn(name = "category_id")
                    )
            )
    })
    private CategoryList categories = new CategoryList();


    public Post() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryList getCategories() {
        return categories;
    }

}
