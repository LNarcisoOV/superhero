package com.superhero.model.dto;

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
public class SuperHeroDTO {

    @JsonProperty("")
    private String alias;

    @JsonProperty("")
    private String name;

    @JsonProperty("")
    private List<String> powers;

    @JsonProperty("")
    private List<String> weapons;

    @JsonProperty("")
    private String origin;

    @JsonProperty("")
    private List<String> associations;
}
