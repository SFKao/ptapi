package sfkao.ptapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sfkao.ptapi.models.Equipo;
import sfkao.ptapi.models.Pokemon;
import sfkao.ptapi.repository.EquipoRepository;

import java.util.*;

@Service
public class EquipoServiceImpl implements EquipoService{

    @Autowired
    private EquipoRepository equipoRepository;

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
    public Equipo saveEquipo(List<Pokemon> pokemons) {
        return saveEquipo(new HashSet<>(pokemons));
    }

    @Override
    public Equipo saveEquipo(Set<Pokemon> pokemons) {
        Equipo equipo = new Equipo();
        equipo.setPokemons(pokemons);
        return equipoRepository.save(equipo);
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
