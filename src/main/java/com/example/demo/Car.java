package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Car {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO )
        private long id;

    @NotNull
    @Size(min=4)
    private String make;

    @NotNull
    @Size(min=3)
    private String model;

    @NotNull
    @Size(min=10)
    private String description;

    @NotNull
    @Min(2)
    private int year;

    public Car(@NotNull @Size(min = 4) String make, @NotNull @Size(min = 3) String model, @NotNull @Size(min = 10) String description, @NotNull @Min(2) int year) {
        this.make = make;
        this.model = model;
        this.description = description;
        this.year = year;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
