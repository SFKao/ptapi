package sfkao.ptapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sfkao.ptapi.dto.EquipoDTO;
import sfkao.ptapi.dto.PTPokemon;
import sfkao.ptapi.models.Equipo;
import sfkao.ptapi.models.Pokemon;
import sfkao.ptapi.repository.EquipoRepository;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EquipoServiceImpl implements EquipoService{

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private PokemonService pokemonService;

    @Autowired
    private SkillService skillService;

    @Override
    public Optional<Equipo> findById(UUID uuid) {
        Optional<Equipo> byId = equipoRepository.findById(uuid);
        if(byId.isPresent()){
            byId.get().getPokemons().forEach(pokemon -> {
                pokemon.setFormas(null);
            });
        }
        return byId;
    }

    @Override
    public EquipoDTO saveEquipo(List<Pokemon> pokemons) {
        return saveEquipo(new HashSet<>(pokemons));
    }

    @Override
    public EquipoDTO saveEquipo(Set<Pokemon> pokemons) {
        Equipo equipo = new Equipo();
        equipo.setPokemons(pokemons);
        Equipo save = equipoRepository.save(equipo);
        return new EquipoDTO(save.getId(), equipo.getPokemons().stream().map(p -> skillService.transformarAPT(p)).toList());
    }

    @Override
    public EquipoDTO saveEquipoPT(List<PTPokemon> pokemons) {
        Equipo equipo = new Equipo();
        equipo.setPokemons(
            pokemons.stream().map(ptPokemon ->
                pokemonService.findByIdPokemon(ptPokemon.id())
            ).collect(Collectors.toSet()));
        Equipo save = equipoRepository.save(equipo);

        return new EquipoDTO(save.getId(), equipo.getPokemons().stream().map(p -> skillService.transformarAPT(p)).toList());
    }

    @Override
    public Equipo updateEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @Override
    public void borrarEquipo(UUID idEquipo) {
        equipoRepository.deleteById(idEquipo);
    }

    @Override
    public Optional<String> obtenerBase64DeEquipo(Equipo equipo) {
        return Optional.empty();
    }

    @Override
    public Optional<String> obtenerBase64DeEquipo(UUID uuid) {
        return Optional.empty();
    }
}
