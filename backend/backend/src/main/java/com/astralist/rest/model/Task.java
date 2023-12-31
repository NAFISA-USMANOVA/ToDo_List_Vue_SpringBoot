package com.astralist.rest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@CrossOrigin(origins = "*")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "event", nullable = false)
    private String event;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "date", nullable = false)
    private String date;


    public Task() {
    }

    public Task(String event,String description,String date) {
        this.event = event;
        this.description = description;
        this.date = date;

    }
}