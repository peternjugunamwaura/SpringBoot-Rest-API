package com.peternjuguna.Restsample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blogs")
public class Blog {

    @Id
    private Integer id;
    private String title;
    private Type contentType;

    public Blog() {
        // Default constructor required by Hibernate
    }

    public Blog(Integer id, String title, Type contentType) {
        this.id = id;
        this.title = title;
        this.contentType = contentType;
    }

    // Getters and setters (or use Lombok or any other library for generating them)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getContentType() {
        return contentType;
    }

    public void setContentType(Type contentType) {
        this.contentType = contentType;
    }
}
