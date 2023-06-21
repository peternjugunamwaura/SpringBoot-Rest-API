package com.peternjuguna.Restsample.controller;

import com.peternjuguna.Restsample.model.Blog;
import com.peternjuguna.Restsample.service.BlogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {
    BlogService blogservice;
    public BlogController(BlogService blogservice) {
        this.blogservice = blogservice;
    }

    @GetMapping("{blogid}")
    public Blog getBlogs(@PathVariable("blogid") String blogid)
    {
        return blogservice.getBlog(blogid);
    }
    @PostMapping
    public  String createBlog(@RequestBody Blog blog)
    {
        blogservice.createBlog(blog);
        return "Blog was Successfully created";
    }
    @GetMapping
    public List<Blog> getBlogs()
    {
        return blogservice.getAllBlog();
    }
}
