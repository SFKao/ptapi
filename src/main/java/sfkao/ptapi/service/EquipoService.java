package sfkao.ptapi.service;

import org.springframework.stereotype.Service;
import sfkao.ptapi.models.Equipo;
import sfkao.ptapi.models.Pokemon;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Service
public interface EquipoService {

    Optional<Equipo> findById(UUID uuid);
    Equipo saveEquipo(List<Pokemon> pokemons);
    Equipo saveEquipo(Set<Pokemon> pokemons);

    Equipo updateEquipo(Equipo equipo);

    void borrarEquipo(UUID idEquipo);

    Optional<String> obtenerBase64DeEquipo(Equipo equipo);
    Optional<String> obtenerBase64DeEquipo(UUID uuid);

}
