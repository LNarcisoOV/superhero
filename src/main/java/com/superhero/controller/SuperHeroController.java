package com.superhero.controller;

import com.superhero.model.SuperHero;
import com.superhero.model.dto.SuperHeroDTO;
import com.superhero.service.SuperHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/super-hero")
public class SuperHeroController {

    @Autowired
    private SuperHeroService superHeroService;

    @PostMapping
    public ResponseEntity<SuperHero> create(@RequestBody SuperHeroDTO superHeroDTO){
        SuperHero superHero = superHeroService.create(superHeroDTO);
        return new ResponseEntity<>(superHero, HttpStatus.OK);
    }

}
