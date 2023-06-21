package com.peternjuguna.Restsample.repository;

import com.peternjuguna.Restsample.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
