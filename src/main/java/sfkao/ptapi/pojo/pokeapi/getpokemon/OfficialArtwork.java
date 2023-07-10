package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class OfficialArtwork{
    @JsonProperty("front_default") 
    public String getFront_default() { 
		 return this.front_default; } 
    public void setFront_default(String front_default) { 
		 this.front_default = front_default; } 
    String front_default;
    @JsonProperty("front_shiny") 
    public String getFront_shiny() { 
		 return this.front_shiny; } 
    public void setFront_shiny(String front_shiny) { 
		 this.front_shiny = front_shiny; } 
    String front_shiny;
}
