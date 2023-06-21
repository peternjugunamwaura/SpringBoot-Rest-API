package com.peternjuguna.Restsample.service.implementation;

import com.peternjuguna.Restsample.model.Blog;
import com.peternjuguna.Restsample.repository.BlogRepository;
import com.peternjuguna.Restsample.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceimplementation implements BlogService {

    BlogRepository blogRepository;
    public BlogServiceimplementation(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }


    @Override
    public String createBlog(Blog blog) {
        blogRepository.save(blog);
        return "Blog created Successfuly";
    }

    @Override
    public String updateBlog(Blog blog) {
        blogRepository.save(blog);
        return "Blog updated Sucessfully";
    }

    @Override
    public String deleteBlog(String blogid) {
        return null;
    }

    @Override
    public Blog getBlog(String blogid) {
        return null;
    }

    @Override
    public List<Blog> getAllBlog() {
        return blogRepository.findAll();

    }
}
