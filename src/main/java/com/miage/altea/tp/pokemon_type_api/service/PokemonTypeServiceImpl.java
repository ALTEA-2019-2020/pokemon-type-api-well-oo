package com.miage.altea.tp.pokemon_type_api.service;

import com.miage.altea.tp.pokemon_type_api.bo.PokemonType;
import com.miage.altea.tp.pokemon_type_api.repository.PokemonTypeRepository;
import com.miage.altea.tp.pokemon_type_api.repository.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonTypeServiceImpl implements PokemonTypeService {

    public PokemonTypeRepository pokemonTypeRepository;

    public TranslationRepository translationRepository;

    public PokemonTypeServiceImpl(){

    }

    @Autowired
    public PokemonTypeServiceImpl(PokemonTypeRepository pokemonTypeRepository){
        this.pokemonTypeRepository = pokemonTypeRepository;
    }

    @Override
    public PokemonType getPokemonType(int id)
    {
        PokemonType pokemonType = this.pokemonTypeRepository.findPokemonTypeById(id);
        pokemonType.setName(this.translationRepository.getPokemonName(id,LocaleContextHolder.getLocale()));
        return pokemonType;
    }

    @Override
    public PokemonType getPokemonType(String name) {
        return this.pokemonTypeRepository.findPokemonTypeByName(name);
    }

    @Override
    public List<PokemonType> getPokemonType(List<String> types) {
        return this.pokemonTypeRepository.findPokemonTypeByTypes(types);
    }

    @Override
    public List<PokemonType> getAllPokemonTypes(){
        return this.pokemonTypeRepository.findAllPokemonType().stream().map(pokemonType -> {
            pokemonType.setName(this.translationRepository.getPokemonName(pokemonType.getId(),LocaleContextHolder.getLocale()));
            return pokemonType;
        }).sorted(Comparator.comparingInt(PokemonType::getId)).collect(Collectors.toList());
    }

    @Autowired
    public void setPokemonTypeRepository(PokemonTypeRepository pokemonTypeRepository) {
        this.pokemonTypeRepository = pokemonTypeRepository;
    }

    @Autowired
    public void setTranslationRepository(TranslationRepository translationRepository) {
        this.translationRepository = translationRepository;
    }
}
