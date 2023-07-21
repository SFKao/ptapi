package sfkao.ptapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sfkao.ptapi.models.Equipo;

import java.util.UUID;

public interface EquipoRepository extends JpaRepository<Equipo, UUID> {



}