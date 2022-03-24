package com.superhero.service;

import com.superhero.dao.SuperHeroDao;
import com.superhero.model.SuperHero;
import com.superhero.model.dto.SuperHeroDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperHeroServiceImpl implements SuperHeroService {

    @Autowired
    private SuperHeroDao superHeroDao;

    public List<SuperHero> getAll(){
        return superHeroDao.findAll();
    }

    public SuperHero create(SuperHeroDTO superHeroDTO){
        try {
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
        } catch (RuntimeException r) {
            throw new RuntimeException(r);
        }
    }

    public void delete(Long id){
        try {
            superHeroDao.deleteById(id);
        } catch (RuntimeException r) {
            throw new RuntimeException(r);
        }
    }
}
