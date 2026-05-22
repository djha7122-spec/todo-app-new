package com.example.Todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Todo.entity.Todo;
import com.example.Todo.service.TodoService;

@RestController
@RequestMapping("/todos")
@CrossOrigin("*")
public class TodoController {

    @Autowired
    private TodoService service;

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return service.createTodo(todo);
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return service.getAllTodos();
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id,
                           @RequestBody Todo todo) {

        return service.updateTodo(id, todo);
    }

    @DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable Long id) {

        service.deleteTodo(id);

        return "Todo deleted successfully";
    }
}