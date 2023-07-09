package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class GenerationI{
    @JsonProperty("red_blue") 
    public RedBlue getRed_blue() { 
		 return this.red_blue; } 
    public void setRed_blue(RedBlue red_blue) { 
		 this.red_blue = red_blue; } 
    RedBlue red_blue;
    @JsonProperty("yellow") 
    public Yellow getYellow() { 
		 return this.yellow; } 
    public void setYellow(Yellow yellow) { 
		 this.yellow = yellow; } 
    Yellow yellow;
}
