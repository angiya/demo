package com.example.demo.service;

import com.example.demo.entity.Human;
import com.example.demo.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class HumanService {

    @Autowired
    HumanRepository repository;


    public List<Human> getAllHumans() {
        return repository.findAll();
    }


    public Human getHumanByName(String id) {
        Optional<Human> optionalHuman = repository.findById(id);
        return optionalHuman.orElse(null);
    }


    public Human createHuman(Human human) {
        return repository.save(human);
    }


    public void killHuman(String name) {
        repository.deleteById(name);
    }
}
