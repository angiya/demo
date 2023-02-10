package com.example.demo.controller;

import com.example.demo.entity.Human;
import com.example.demo.service.HumanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("human")
@Slf4j
public class HumanController {

    @Autowired
    HumanService humanService;

    @GetMapping()
    public ResponseEntity<List<Human>> getAllHumans() {
        log.info("GETTING ALL HUMANS");
        List<Human> list = humanService.getAllHumans();
        if (list == null || list.isEmpty()) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Human> findHuman(@PathVariable(value = "id") String name) {
        log.info("GETTING A HUMAN");
        Human human = humanService.getHumanByName(name);
        if (human == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(human, HttpStatus.OK);
    }


    @PostMapping()
    public ResponseEntity<Human> creatingHuman(Human human) {
        log.info("CREATING A HUMAN");
        Human createdHuman = humanService.createHuman(human);
        if (createdHuman == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(createdHuman, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> killHuman(@PathVariable(value = "id") String name) {
        log.info("KILLING A HUMAN");
        String response = humanService.killHuman(name);
        if (response == null) return new ResponseEntity<>("Unable to find target", HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
