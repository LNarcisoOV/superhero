package com.superhero.controller;

import com.superhero.model.SuperHero;
import com.superhero.model.dto.SuperHeroDTO;
import com.superhero.service.SuperHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/superhero")
public class SuperHeroController {

    @Autowired
    private SuperHeroService superHeroService;

    @GetMapping("/")
    public ResponseEntity<List<SuperHero>> getAll(){
        List<SuperHero> superHeroList = superHeroService.getAll();
        return new ResponseEntity<>(superHeroList, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<SuperHero> create(@RequestBody SuperHeroDTO superHeroDTO){
        SuperHero superHero = superHeroService.create(superHeroDTO);
        return new ResponseEntity<>(superHero, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        superHeroService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
