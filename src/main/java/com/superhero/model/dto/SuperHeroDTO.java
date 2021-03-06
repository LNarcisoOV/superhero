package com.superhero.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SuperHeroDTO {

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("name")
    private String name;

    @JsonProperty("powers")
    private List<String> powers;

    @JsonProperty("weapons")
    private List<String> weapons;

    @JsonProperty("origin")
    private String origin;

    @JsonProperty("associations")
    private List<String> associations;
}
