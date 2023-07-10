package sfkao.ptapi.dto;

import sfkao.ptapi.models.Pokemon;

import java.util.List;
import java.util.Set;

public record PTPokemon(
        int id,
        String nombre,
        String urlSprite,
        int hp, int atk, int def, int spa, int spd, int spe,
        String tipo1, String tipo2,
        Set<Pokemon> formas,
        List<String> habilidades,
        Stat bloqueo,
        Stat ataque,
        int movimiento
) {
}


