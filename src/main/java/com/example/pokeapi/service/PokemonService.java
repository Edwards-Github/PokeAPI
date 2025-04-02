package com.example.pokeapi.service;

import com.example.pokeapi.model.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {
    private final String API_URL = "https://pokeapi.co/api/v2/pokemon/";

    private final RestTemplate restTemplate = new RestTemplate();

    public Pokemon getPokemon(String name) {
        String url = API_URL + name.toLowerCase();
        return restTemplate.getForObject(url, Pokemon.class);
    }
}