package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Gold{
    @JsonProperty("back_default") 
    public String getBack_default() { 
		 return this.back_default; } 
    public void setBack_default(String back_default) { 
		 this.back_default = back_default; } 
    String back_default;
    @JsonProperty("back_shiny") 
    public String getBack_shiny() { 
		 return this.back_shiny; } 
    public void setBack_shiny(String back_shiny) { 
		 this.back_shiny = back_shiny; } 
    String back_shiny;
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
    @JsonProperty("front_transparent") 
    public String getFront_transparent() { 
		 return this.front_transparent; } 
    public void setFront_transparent(String front_transparent) { 
		 this.front_transparent = front_transparent; } 
    String front_transparent;
}
