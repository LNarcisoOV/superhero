package com.superhero.service;

import com.superhero.dao.SuperHeroDao;
import com.superhero.model.SuperHero;
import com.superhero.model.dto.SuperHeroDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperHeroServiceImpl implements SuperHeroService {

    @Autowired
    private SuperHeroDao superHeroDao;

    public SuperHero create(SuperHeroDTO superHeroDTO){
        SuperHero superHero = SuperHero.builder()
                .alias(superHeroDTO.getAlias())
                .name(superHeroDTO.getName())
                .powers(superHeroDTO.getPowers())
                .weapons(superHeroDTO.getWeapons())
                .origin(superHeroDTO.getOrigin())
                .associations(superHeroDTO.getAssociations())
                .build();

        SuperHero superHeroDB = superHeroDao.save(superHero);

        return superHeroDB;
    }
}
