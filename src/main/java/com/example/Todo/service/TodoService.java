package com.example.Todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Todo.entity.Todo;
import com.example.Todo.repository.TodoRepository;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Todo createTodo(Todo todo) {
        return repository.save(todo);
    }

    public List<Todo> getAllTodos() {
        return repository.findAll();
    }

    public Todo updateTodo(Long id, Todo updatedTodo) {

        Todo todo = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));

        todo.setTitle(updatedTodo.getTitle());
        todo.setCompleted(updatedTodo.isCompleted());

        return repository.save(todo);
    }

    public void deleteTodo(Long id) {
        repository.deleteById(id);
    }
}