package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class GenerationV{
    @JsonProperty("black_white") 
    public BlackWhite getBlack_white() { 
		 return this.black_white; } 
    public void setBlack_white(BlackWhite black_white) { 
		 this.black_white = black_white; } 
    BlackWhite black_white;
}
