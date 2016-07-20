package com.example.api;

import com.example.common.category.Category;
import com.example.common.post.Post;
import com.example.common.post.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostRestController extends BaseRestController {

    @Autowired
    private PostRepository repository;


    @ResponseBody
    @RequestMapping("post/create")
    public Post testCreate() {
        Post post = new Post();
        post.setTitle("My Title");
        post.setDescription("My Description");
        post.getCategories().add(new Category("Tech"));

        repository.save(post);

        return post;
    }

}
