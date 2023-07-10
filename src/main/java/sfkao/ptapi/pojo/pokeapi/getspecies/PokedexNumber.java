package sfkao.ptapi.pojo.pokeapi.getspecies; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class PokedexNumber{
    @JsonProperty("entry_number") 
    public int getEntry_number() { 
		 return this.entry_number; } 
    public void setEntry_number(int entry_number) { 
		 this.entry_number = entry_number; } 
    int entry_number;
    @JsonProperty("pokedex") 
    public Pokedex getPokedex() { 
		 return this.pokedex; } 
    public void setPokedex(Pokedex pokedex) { 
		 this.pokedex = pokedex; } 
    Pokedex pokedex;
}
