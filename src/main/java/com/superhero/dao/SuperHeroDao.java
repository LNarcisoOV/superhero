package com.superhero.dao;

import com.superhero.model.SuperHero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperHeroDao extends JpaRepository<SuperHero, Long> {

}
