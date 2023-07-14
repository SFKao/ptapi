package sfkao.ptapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sfkao.ptapi.dto.PTPokemon;
import sfkao.ptapi.service.PokemonService;

@RestController
@RequestMapping("/api/v2/pokemon")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(@Autowired PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public ResponseEntity<?> getPokemon(@RequestParam(name = "pk") String idONombre){

        PTPokemon poke = pokemonService.findByIdOrName(idONombre);
        if(poke==null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(poke);

    }



}
