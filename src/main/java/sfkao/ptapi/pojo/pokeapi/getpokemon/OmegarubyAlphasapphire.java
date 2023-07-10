package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class OmegarubyAlphasapphire{
    @JsonProperty("front_default") 
    public String getFront_default() { 
		 return this.front_default; } 
    public void setFront_default(String front_default) { 
		 this.front_default = front_default; } 
    String front_default;
    @JsonProperty("front_female") 
    public Object getFront_female() { 
		 return this.front_female; } 
    public void setFront_female(Object front_female) { 
		 this.front_female = front_female; } 
    Object front_female;
    @JsonProperty("front_shiny") 
    public String getFront_shiny() { 
		 return this.front_shiny; } 
    public void setFront_shiny(String front_shiny) { 
		 this.front_shiny = front_shiny; } 
    String front_shiny;
    @JsonProperty("front_shiny_female") 
    public Object getFront_shiny_female() { 
		 return this.front_shiny_female; } 
    public void setFront_shiny_female(Object front_shiny_female) { 
		 this.front_shiny_female = front_shiny_female; } 
    Object front_shiny_female;
}
