package com.example.common.category;

import com.google.common.collect.ForwardingList;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Embeddable
public class CategoryList extends ForwardingList<Category> {

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "parent_id")
    )
    private List<Category> categories = new ArrayList<>();

    @Override
    protected List<Category> delegate() {
        return categories;
    }

}
