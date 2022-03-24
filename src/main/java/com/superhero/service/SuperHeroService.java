package com.superhero.service;

import com.superhero.model.SuperHero;
import com.superhero.model.dto.SuperHeroDTO;

public interface SuperHeroService {
    SuperHero create(SuperHeroDTO superHeroDTORequest);
}
