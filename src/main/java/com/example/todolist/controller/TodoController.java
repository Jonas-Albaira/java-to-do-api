package com.example.todolist.controller;

import com.example.todolist.model.TodoItem;
import com.example.todolist.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import java.util.List;

@RestController
@RequestMapping(value="/todo")
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

    private final TodoRepo todoRepo;

    public TodoController(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItem save(@Valid @NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }

    @PutMapping
    public TodoItem update(@Valid @NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        todoRepo.deleteById(id);
    }


}
