package sfkao.ptapi.service;

import org.springframework.stereotype.Service;
import sfkao.ptapi.dto.PTPokemon;

import java.util.List;

@Service
public interface PokemonService {

    List<PTPokemon> findAllById(int[] ids);
    List<PTPokemon> findBySpeGreaterThanEqualOrderByIdAsc(int spe);
    PTPokemon findByIdOrName(String idOrName);




}
