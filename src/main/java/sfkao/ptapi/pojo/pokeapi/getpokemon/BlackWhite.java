package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class BlackWhite{
    @JsonProperty("animated") 
    public Animated getAnimated() { 
		 return this.animated; } 
    public void setAnimated(Animated animated) { 
		 this.animated = animated; } 
    Animated animated;
    @JsonProperty("back_default") 
    public String getBack_default() { 
		 return this.back_default; } 
    public void setBack_default(String back_default) { 
		 this.back_default = back_default; } 
    String back_default;
    @JsonProperty("back_female") 
    public Object getBack_female() { 
		 return this.back_female; } 
    public void setBack_female(Object back_female) { 
		 this.back_female = back_female; } 
    Object back_female;
    @JsonProperty("back_shiny") 
    public String getBack_shiny() { 
		 return this.back_shiny; } 
    public void setBack_shiny(String back_shiny) { 
		 this.back_shiny = back_shiny; } 
    String back_shiny;
    @JsonProperty("back_shiny_female") 
    public Object getBack_shiny_female() { 
		 return this.back_shiny_female; } 
    public void setBack_shiny_female(Object back_shiny_female) { 
		 this.back_shiny_female = back_shiny_female; } 
    Object back_shiny_female;
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
