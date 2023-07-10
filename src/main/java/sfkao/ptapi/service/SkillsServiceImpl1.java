package sfkao.ptapi.service;

import org.springframework.stereotype.Service;
import sfkao.ptapi.dto.PTPokemon;
import sfkao.ptapi.models.Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class SkillsServiceImpl1 implements SkillService {

    public PTPokemon transformarAPT(Pokemon pokemon){
        pokemon.getFormas().forEach(p -> p.setFormas(null));
        Set<Pokemon> formas = pokemon.getFormas();
        formas.forEach(p -> {
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
                formas,
                calcularHabilidades(pokemon),
                new Stat(true, false, 2, 1),
                new Stat(true, true,  1, 3),
                3
        );
    }

    public List<String> calcularHabilidades(Pokemon pokemon){
        //TODO: Hacer
        return new ArrayList<>();
    }

}
