package com.example.pokeapi.model;

import java.util.List;

public class Pokemon {
    private String name;
    private int id;
    private List<AbilityWrapper> abilities;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public List<AbilityWrapper> getAbilities() { return abilities; }
    public void setAbilities(List<AbilityWrapper> abilities) { this.abilities = abilities; }

    public static class AbilityWrapper {
        private Ability ability;
        public Ability getAbility() { return ability; }
        public void setAbility(Ability ability) { this.ability = ability; }
    }

    public static class Ability {
        private String name;
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }
}