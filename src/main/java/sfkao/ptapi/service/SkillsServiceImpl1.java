package sfkao.ptapi.service;

import org.springframework.stereotype.Service;
import sfkao.ptapi.dto.PTPokemon;
import sfkao.ptapi.dto.Skill;
import sfkao.ptapi.dto.Stat;
import sfkao.ptapi.models.Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class SkillsServiceImpl1 implements SkillService {

    public PTPokemon transformarAPT(Pokemon pokemon){
        Set<Pokemon> formas = pokemon.getFormas();
        formas.forEach(p -> p.setFormas(null));

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
                new Stat(  2, 1),
                new Stat(   0, 3),
                3
        );
    }

    public List<Skill> calcularHabilidades(Pokemon pokemon){
        //TODO: Hacer
        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("Vuelo","Puede volar","https://static.wikia.nocookie.net/leagueoflegendsoficial/images/8/8c/LOL_Logo.png/revision/latest?cb=20180119195439&path-prefix=es"));
        skills.add(new Skill("Inmune veneno", "Es inmune al veneno","https://static.wikia.nocookie.net/leagueoflegendsoficial/images/8/8c/LOL_Logo.png/revision/latest?cb=20180119195439&path-prefix=es"));
        return skills;
    }

}
