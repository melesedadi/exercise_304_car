package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... String) throws Exception{
        Car car;

        car = new Car("Toyota", "Camre", "Just a camre car",2010);
        repository.save(car);

        car = new Car("Toota", "Sedan", "This another Toyota car",2018);
        repository.save(car);

        car = new Car("Hayunda", "New model", "A new Hayunda car",2019);
        repository.save(car);
    }
}
