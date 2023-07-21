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
                calcularStat(pokemon.getAtk(),pokemon.getSpa(),pokemon.getSpe()),
                calcularStat(pokemon.getDef(), pokemon.getSpd(), pokemon.getHp()),
                calcularMovimiento(pokemon.getSpe())
        );
    }

    public static int calcularMovimiento(int spe){
        if(spe >= 140)
            return 5;
        if(spe >= 110)
            return 4;
        if(spe >= 80)
            return 3;
        if(spe >= 50)
            return 2;
        return 1;
    }

    public static Stat calcularStat(int fis, int esp, int hpOSpe){
        return new Stat(calcularTier(fis, hpOSpe), calcularTier(esp,hpOSpe));
    }

    public static int calcularTier(int stat, int aditivo){
        if(stat >=170 || (stat >=140 && aditivo>= 85))
            return 3;
        if(stat >=140 || (stat >=110 && aditivo>= 85))
            return 2;
        if(stat >=110 || (stat >=95 && aditivo>= 85))
            return 1;
        return 0;
    }

    public List<Skill> calcularHabilidades(Pokemon pokemon){
        ArrayList<Skill> skills = new ArrayList<>();

        if(esTipo(pokemon,"flying"))
            skills.add(new Skill("Vuelo","Permite moverse por cualquier terreno","https://static.thenounproject.com/png/1211525-200.png"));
        if(esTipo(pokemon,"water"))
            skills.add(new Skill("Surf","Permite moverse por el agua","https://www.freeiconspng.com/thumbs/swimming-icon-png/sports-swimming-icon-png-1.png"));
        if(esTipo(pokemon,"poison")||esTipo(pokemon,"steel"))
            skills.add(new Skill("Inmunidad a veneno","Permite moverse por charcos de veneno sin envenenarse","https://static.wikia.nocookie.net/monster-legends-competitive/images/c/c0/Poison_Immunity.png/revision/latest/thumbnail/width/360/height/360?cb=20220306043936&path-prefix=fr"));
        if(esTipo(pokemon,"rock"))
            skills.add(new Skill("Atravesar montañas","Permite moverse por montañas y romper rocas","https://static.thenounproject.com/png/711504-200.png"));
        if(esTipo(pokemon,"ice"))
            skills.add(new Skill("Velocidad en la nieve","La reducción de movimiento en la nieve no le afecta","https://cdn-icons-png.flaticon.com/512/6661/6661508.png"));
        if(esTipo(pokemon,"electric")||esTipo(pokemon,"ground"))
            skills.add(new Skill("Inmunidad a campos electricos","Permite moverse por campos electricos sin paralizarse","https://cdn-icons-png.flaticon.com/512/6328/6328824.png"));
        if(esTipo(pokemon,"fire"))
            skills.add(new Skill("Caminar sobre lava","Permite caminar sobre la lava","https://cdn-icons-png.flaticon.com/512/1899/1899113.png"));

        return skills;
    }

    private static boolean esTipo(Pokemon pokemon, String tipo){
        if(pokemon.getTipo1().equals(tipo))
            return true;
        if(pokemon.getTipo2()==null)
            return false;
        return pokemon.getTipo2().equals(tipo);
    }
}
