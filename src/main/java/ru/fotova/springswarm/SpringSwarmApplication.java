package ru.fotova.springswarm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.fotova.springswarm.model.Fruit;
import ru.fotova.springswarm.repository.FruitRepository;

@SpringBootApplication
public class SpringSwarmApplication implements CommandLineRunner {

    @Autowired
    private FruitRepository fruitRepository;

    public static void main(String[] args)
    {
        SpringApplication.run(SpringSwarmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Fruit fruit1 = new Fruit();

        fruit1.setName("Apple");

        Fruit fruit2 = new Fruit();
        fruit2.setName("Banana");

        fruitRepository.save(fruit1);
        fruitRepository.save(fruit2);

    }
}
