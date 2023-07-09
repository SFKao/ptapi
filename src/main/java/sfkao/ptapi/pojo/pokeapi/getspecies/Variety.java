package sfkao.ptapi.pojo.pokeapi.getspecies; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Variety{
    @JsonProperty("is_default") 
    public boolean getIs_default() { 
		 return this.is_default; } 
    public void setIs_default(boolean is_default) { 
		 this.is_default = is_default; } 
    boolean is_default;
    @JsonProperty("pokemon") 
    public Pokemon getPokemon() { 
		 return this.pokemon; } 
    public void setPokemon(Pokemon pokemon) { 
		 this.pokemon = pokemon; } 
    Pokemon pokemon;
}
