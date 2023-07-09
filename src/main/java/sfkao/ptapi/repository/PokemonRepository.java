package sfkao.ptapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sfkao.ptapi.models.Pokemon;

import java.util.List;
import java.util.Optional;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

    List<Pokemon> findBySpeGreaterThanEqualOrderByIdAsc(int spe);

    Optional<Pokemon> findFirstByIdOrNombreLikeIgnoreCaseOrderByIdAsc(Integer id, String nombre);

}