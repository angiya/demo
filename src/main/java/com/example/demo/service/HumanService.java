package com.example.demo.service;

import com.example.demo.entity.Human;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HumanService {

    @Autowired
    HumanRepository repository;

    @Autowired
    BusinessRepository businessRepository;

    @Autowired
    ComputerRepository computerRepository;

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    VehicleRepository vehicleRepository;


    public List<Human> getAllHumans() {
        return repository.findAll();
    }


    public Human getHumanByName(String id) {
        Optional<Human> optionalHuman = repository.findById(id);
        return optionalHuman.orElse(null);
    }


    public Human createHuman(Human human) {
        locationRepository.saveAll(human.getBusiness().getLocations());
        vehicleRepository.saveAll(human.getBusiness().getVehicles());
        computerRepository.saveAll(human.getBusiness().getComputers());
        businessRepository.save(human.getBusiness());
        return repository.save(human);
    }


    public String killHuman(String name) {
        Human human =getHumanByName(name);
        if (human == null) return null;
        repository.delete(human);
        return "Target down.";
    }
}
