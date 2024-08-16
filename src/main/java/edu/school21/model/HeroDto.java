package edu.school21.model;

import lombok.Data;

@Data
public class HeroDto {
    private long id;
    private String name;
    private String heroClass;
    private int level;
    private int experience;
    private int attack;
    private int defense;
    private int hp;
}
