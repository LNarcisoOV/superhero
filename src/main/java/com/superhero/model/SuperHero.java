package com.superhero.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SUPER_HERO")
public class SuperHero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "alias")
    private String alias;

    @Column(name = "name")
    private String name;

    @ElementCollection
    @CollectionTable(name="POWER", joinColumns=@JoinColumn(name="POWER_ID"))
    private List<String> powers;

    @ElementCollection
    @CollectionTable(name="WEAPON", joinColumns=@JoinColumn(name="WEAPON_ID"))
    private List<String> weapons;

    @Column(name = "origin")
    private String origin;

    @ElementCollection
    @CollectionTable(name="ASSOCIATION", joinColumns=@JoinColumn(name="ASSOCIATION_ID"))
    private List<String> associations;
}
