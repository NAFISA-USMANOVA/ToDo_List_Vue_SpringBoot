package com.astralist.rest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tasks")
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "event", nullable = false)
    private String event;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "day", nullable = false)
    private String date;


    public Task() {
    }

    public Task(String event, String day, String description) {
        this.event = event;
        this.description = description;
        this.date = date;

    }
}