package com.miage.altea.tp.pokemon_type_api.repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PokemonRepositoryImplTest {
    private PokemonTypeRepositoryImpl repository = new PokemonTypeRepositoryImpl();

    @Test
    void findPokemonTypeById_with25_shouldReturnPikachu(){
        var pikachu = repository.findPokemonTypeById(25);
        assertNotNull(pikachu);
        assertEquals("pikachu", pikachu.getName());
        assertEquals(25, pikachu.getId());
    }

    @Test
    void findPokemonTypeById_with145_shouldReturnZapdos(){
        var zapdos = repository.findPokemonTypeById(145);
        assertNotNull(zapdos);
        assertEquals("zapdos", zapdos.getName());
        assertEquals(145, zapdos.getId());
    }

    @Test
    void findPokemonTypeByName_withEevee_shouldReturnEevee(){
        var eevee = repository.findPokemonTypeByName("eevee");
        assertNotNull(eevee);
        assertEquals("eevee", eevee.getName());
        assertEquals(133, eevee.getId());
    }

    @Test
    void findPokemonTypeByName_withMewTwo_shouldReturnMewTwo(){
        var mewtwo = repository.findPokemonTypeByName("mewtwo");
        assertNotNull(mewtwo);
        assertEquals("mewtwo", mewtwo.getName());
        assertEquals(150, mewtwo.getId());
    }

    @Test
    void findAllPokemonType_shouldReturn151Pokemons(){
        var pokemons = repository.findAllPokemonType();
        assertNotNull(pokemons);
        assertEquals(151, pokemons.size());
    }
}
