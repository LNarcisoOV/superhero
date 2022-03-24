package com.superhero.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SuperHero {

    private long id;

    private String alias;

    private String name;

    private List<String> powers;

    private List<String> weapons;

    private String origin;

    private List<String> associations;
}
