package sfkao.ptapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sfkao.ptapi.dto.PTPokemon;
import sfkao.ptapi.models.Pokemon;
import sfkao.ptapi.repository.PokemonRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PokemonServiceImpl implements  PokemonService{

    private final PokemonRepository pokemonRepository;
    private final SkillService skillService;

    public PokemonServiceImpl(@Autowired PokemonRepository pokemonRepository,
                              @Autowired SkillService skillsService) {
        this.pokemonRepository = pokemonRepository;
        this.skillService = skillsService;
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
        try{
            id = Integer.parseInt(idOrName);
        }catch (NumberFormatException ignored){}
        Optional<Pokemon> pOptional = pokemonRepository.findFirstByIdOrNombreLikeIgnoreCaseOrderByIdAsc(id, idOrName);
        if(pOptional.isEmpty())
            return null;
        return skillService.transformarAPT(pOptional.get());
    }
}
