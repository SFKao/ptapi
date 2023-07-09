package sfkao.ptapi.service;

import org.springframework.stereotype.Service;
import sfkao.ptapi.dto.PTPokemon;
import sfkao.ptapi.models.Pokemon;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillsServiceImpl1 implements SkillService {

    public PTPokemon transformarAPT(Pokemon pokemon){
        pokemon.getFormas().forEach(p -> {
            p.setFormas(null);
        });

        return new PTPokemon(
                pokemon.getId(),
                pokemon.getNombre(),
                pokemon.getUrlSprite(),
                pokemon.getHp(),
                pokemon.getAtk(),
                pokemon.getDef(),
                pokemon.getSpa(),
                pokemon.getSpd(),
                pokemon.getSpe(),
                pokemon.getTipo1(),
                pokemon.getTipo2(),
                pokemon.getFormas(),
                calcularHabilidades(pokemon),
                "Bloqueo",
                "Ataca",
                3
        );
    }

    public List<String> calcularHabilidades(Pokemon pokemon){
        //TODO: Hacer
        return new ArrayList<>();
    }

}
