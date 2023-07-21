package sfkao.ptapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sfkao.ptapi.dto.PTPokemon;
import sfkao.ptapi.models.Pokemon;
import sfkao.ptapi.pojo.pokeapi.getpokemon.PokeApiPokemon;
import sfkao.ptapi.repository.PokemonRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public List<PTPokemon> findAllById(int[] ids) {

        ArrayList<Pokemon> pokemons = new ArrayList<>();
        for (int id : ids) {
            Optional<Pokemon> byId = pokemonRepository.findById(id);
            byId.ifPresent(pokemons::add);
        }


        return null;//pokemons;
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
}
