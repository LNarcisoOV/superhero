package com.superhero.service;

import com.superhero.model.SuperHero;
import com.superhero.model.dto.SuperHeroDTO;

import java.util.List;

public interface SuperHeroService {
    List<SuperHero> getAll();
    SuperHero create(SuperHeroDTO superHeroDTORequest);
    void delete(Long id);
}
