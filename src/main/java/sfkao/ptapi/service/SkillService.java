package sfkao.ptapi.service;

import sfkao.ptapi.dto.PTPokemon;
import sfkao.ptapi.models.Pokemon;

public interface SkillService {

    PTPokemon transformarAPT(Pokemon pokemon);

}
