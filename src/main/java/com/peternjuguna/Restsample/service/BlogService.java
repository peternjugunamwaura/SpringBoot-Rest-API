package com.peternjuguna.Restsample.service;

import com.peternjuguna.Restsample.model.Blog;

import java.util.List;

public interface BlogService {
    public  String createBlog(Blog blog);
    public String updateBlog(Blog blog);
    public String deleteBlog(String blogid);
    public Blog getBlog(String blogid);
    public List<Blog> getAllBlog();
}
