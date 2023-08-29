package com.astralist.rest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

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
    @Column(name = "day", nullable = false)
    private String day;

    public Task() {
    }

    public Task(String event, String day) {
        this.event = event;
        this.day = day;
    }
}
