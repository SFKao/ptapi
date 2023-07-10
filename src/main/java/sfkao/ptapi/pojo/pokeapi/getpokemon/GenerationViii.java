package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class GenerationViii{
    @JsonProperty("icons") 
    public Icons getIcons() { 
		 return this.icons; } 
    public void setIcons(Icons icons) { 
		 this.icons = icons; } 
    Icons icons;
}
