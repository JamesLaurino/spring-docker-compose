package ru.fotova.springswarm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fotova.springswarm.model.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Integer> {
}
