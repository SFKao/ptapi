package sfkao.ptapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sfkao.ptapi.service.PokemonService;

@RestController
@RequestMapping("/api/v2/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(@Autowired PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public ResponseEntity<?> getPokemon(@RequestParam(name = "pk") String idONombre){

        return ResponseEntity.ok(pokemonService.findByIdOrName(idONombre));

    }


}
