package sfkao.ptapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import sfkao.ptapi.models.Pokemon;
import sfkao.ptapi.pojo.pokeapi.getpokemon.PokeApiPokemon;
import sfkao.ptapi.pojo.pokeapi.getspecies.PokeapiSpecies;
import sfkao.ptapi.repository.PokemonRepository;

import java.util.HashSet;

@Service
public class PokeApiServiceImpl implements PokeApiService{

    private final RestTemplate restTemplate;
    private final PokemonRepository pokemonRepository;

    public PokeApiServiceImpl(@Autowired RestTemplate restTemplate, @Autowired PokemonRepository pokemonRepository) {
        this.restTemplate = restTemplate;
        this.pokemonRepository = pokemonRepository;
    }

    @Override
    public Pokemon obtenerDePokeApi(String idONombre) {

        String url = "https://pokeapi.co/api/v2/pokemon/"+idONombre;

        try{
            PokeApiPokemon pokemon = restTemplate.getForObject(url, PokeApiPokemon.class);
            System.out.println(pokemon.getName());
            return transformarAPokemonDeBBDD(pokemon, true);
        }catch (HttpStatusCodeException e){
            System.out.println("ERROR "+e.getStatusCode().value());
            return null;
        }
    }

    private Pokemon transformarAPokemonDeBBDD(PokeApiPokemon p, boolean buscarEnForms){
        Pokemon pokemon = new Pokemon(
                p.getId(),
                p.getName(),
                p.getSprites().getFront_default(),
                p.getStats().stream().mapToInt(stat -> {
                    if (stat.getStat().getName().equals("hp"))
                        return stat.getBase_stat();
                    return 0;
                }).sum(),
                p.getStats().stream().mapToInt(stat -> {
                    if (stat.getStat().getName().equals("attack"))
                        return stat.getBase_stat();
                    return 0;
                }).sum(),
                p.getStats().stream().mapToInt(stat -> {
                    if (stat.getStat().getName().equals("defense"))
                        return stat.getBase_stat();
                    return 0;
                }).sum(),
                p.getStats().stream().mapToInt(stat -> {
                    if (stat.getStat().getName().equals("special-attack"))
                        return stat.getBase_stat();
                    return 0;
                }).sum(),
                p.getStats().stream().mapToInt(stat -> {
                    if (stat.getStat().getName().equals("special-defense"))
                        return stat.getBase_stat();
                    return 0;
                }).sum(),
                p.getStats().stream().mapToInt(stat -> {
                    if (stat.getStat().getName().equals("speed"))
                        return stat.getBase_stat();
                    return 0;
                }).sum(),
                p.getTypes().get(0).getType2().getName(),
                p.getTypes().size() != 1 ? p.getTypes().get(1).getType2().getName() : null,
                new HashSet<>()
        );

        pokemonRepository.save(pokemon);

        if(buscarEnForms){
            PokeapiSpecies pokeapiSpecies = restTemplate.getForObject(p.getSpecies().getUrl(), PokeapiSpecies.class);
            HashSet<PokeApiPokemon> pokeapiforms = new HashSet<>();
            pokeapiSpecies.getVarieties().forEach(variety -> {
                pokeapiforms.add(restTemplate.getForObject(variety.getPokemon().getUrl(), PokeApiPokemon.class));
            });

            HashSet<Pokemon> forms = new HashSet<>();
            forms.add(pokemon);
            for (PokeApiPokemon form : pokeapiforms) {
                forms.add(transformarAPokemonDeBBDD(form,false));
            }

            forms.forEach(form -> {
                form.setFormas(forms);
                pokemonRepository.save(form);
            });

        }

        return pokemon;
    }
}
