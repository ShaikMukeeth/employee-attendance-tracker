package com.example.attendance.model;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int presentDays;
    private int lateDays;

    public Employee() {}

    public Employee(String name, int presentDays, int lateDays) {
        this.name = name;
        this.presentDays = presentDays;
        this.lateDays = lateDays;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public int getPresentDays() { return presentDays; }
    public int getLateDays() { return lateDays; }

    public void setName(String name) { this.name = name; }
    public void setPresentDays(int presentDays) { this.presentDays = presentDays; }
    public void setLateDays(int lateDays) { this.lateDays = lateDays; }
}
