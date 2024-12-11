package ru.fotova.springswarm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fotova.springswarm.model.Fruit;
import ru.fotova.springswarm.repository.FruitRepository;

import java.util.List;

@RestController
public class FruitController
{
    @Autowired
    private FruitRepository fruitRepository;

    @GetMapping
    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }
}
