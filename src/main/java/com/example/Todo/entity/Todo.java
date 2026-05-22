package com.example.Todo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private boolean completed;
    
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for completed
    public boolean isCompleted() {
        return completed;
    }

    // Setter for completed
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}