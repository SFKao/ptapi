package sfkao.ptapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sfkao.ptapi.dto.PTPokemon;
import sfkao.ptapi.models.Pokemon;
import sfkao.ptapi.repository.PokemonRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PokemonServiceImpl implements  PokemonService{

    private final PokemonRepository pokemonRepository;
    private final SkillService skillService;
    private final PokeApiService pokeApiService;

    public PokemonServiceImpl(@Autowired PokemonRepository pokemonRepository,
                              @Autowired SkillService skillsService,
                              @Autowired PokeApiService pokeApiService) {
        this.pokemonRepository = pokemonRepository;
        this.skillService = skillsService;
        this.pokeApiService = pokeApiService;
    }

    @Override
    public List<PTPokemon> findAllById(List<Integer> ids) {
        ArrayList<PTPokemon> pokemons = new ArrayList<>();
        ids.forEach(id -> {
            Optional<PTPokemon> byId = Optional.ofNullable(findByIdOrName(String.valueOf(id)));
            if(byId.isPresent()){
                PTPokemon p = byId.get();
                Set<Pokemon> formas = p.formas();
                formas.forEach(p2 -> p2.setFormas(null));
                pokemons.add(p);
            }
        });
        return pokemons;
    }

    @Override
    public List<PTPokemon> findBySpeGreaterThanEqualOrderByIdAsc(int spe) {
        return null;//pokemonRepository.findBySpeGreaterThanEqualOrderByIdAsc(spe);
    }

    @Override
    public PTPokemon findByIdOrName(String idOrName) {
        int id = 0;
        Pokemon pokemon;
        try{
            id = Integer.parseInt(idOrName);
        }catch (NumberFormatException ignored){}
        Optional<Pokemon> pOptional = pokemonRepository.findFirstByIdOrNombreLikeIgnoreCaseOrderByIdAsc(id, idOrName);

        if(pOptional.isEmpty()) {
            pokemon = pokeApiService.obtenerDePokeApi(idOrName);
            if(pokemon==null)
                return null;
        }else
            pokemon = pOptional.get();
        return skillService.transformarAPT(pokemon);
    }

    @Override
    public Pokemon findByIdPokemon(int id) {
        Pokemon pokemon;
        Optional<Pokemon> pOptional = pokemonRepository.findById(id);
        if(pOptional.isEmpty()) {
            pokemon = pokeApiService.obtenerDePokeApi(String.valueOf(id));
        }else
            pokemon = pOptional.get();
        return pokemon;
    }
}
