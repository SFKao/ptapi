package sfkao.ptapi.service;

import org.springframework.stereotype.Service;
import sfkao.ptapi.models.Pokemon;

@Service
public interface PokeApiService {
    Pokemon obtenerDePokeApi(String idONombre);
}
