package sfkao.ptapi.dto;

import java.util.List;
import java.util.UUID;

public record EquipoDTO(
        UUID id,
        List<PTPokemon> pokemons
) {
}
