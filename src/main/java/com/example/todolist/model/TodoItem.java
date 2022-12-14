package com.example.todolist.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlIDREF;

@Entity
public class TodoItem {

    private long id;
    @NotBlank
    private String title;
    private boolean done;

    public TodoItem() {
    }

    public TodoItem(long id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
