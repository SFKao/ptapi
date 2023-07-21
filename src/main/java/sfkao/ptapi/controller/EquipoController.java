package sfkao.ptapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sfkao.ptapi.models.Equipo;
import sfkao.ptapi.models.Pokemon;
import sfkao.ptapi.service.EquipoService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v2/equipo")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @GetMapping("/{uuid}")
    public ResponseEntity<?> getEquipo(@PathVariable("uuid") String uuid){

        Optional<Equipo> byId = equipoService.findById(UUID.fromString(uuid));
        if(byId.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(byId.get());
    }

    @PostMapping
    public ResponseEntity<?> guardarEquipo(@RequestBody List<Pokemon> pokemons){
        return ResponseEntity.ok(equipoService.saveEquipo(pokemons));
    }

}
