package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class RedBlue{
    @JsonProperty("back_default") 
    public String getBack_default() { 
		 return this.back_default; } 
    public void setBack_default(String back_default) { 
		 this.back_default = back_default; } 
    String back_default;
    @JsonProperty("back_gray") 
    public String getBack_gray() { 
		 return this.back_gray; } 
    public void setBack_gray(String back_gray) { 
		 this.back_gray = back_gray; } 
    String back_gray;
    @JsonProperty("back_transparent") 
    public String getBack_transparent() { 
		 return this.back_transparent; } 
    public void setBack_transparent(String back_transparent) { 
		 this.back_transparent = back_transparent; } 
    String back_transparent;
    @JsonProperty("front_default") 
    public String getFront_default() { 
		 return this.front_default; } 
    public void setFront_default(String front_default) { 
		 this.front_default = front_default; } 
    String front_default;
    @JsonProperty("front_gray") 
    public String getFront_gray() { 
		 return this.front_gray; } 
    public void setFront_gray(String front_gray) { 
		 this.front_gray = front_gray; } 
    String front_gray;
    @JsonProperty("front_transparent") 
    public String getFront_transparent() { 
		 return this.front_transparent; } 
    public void setFront_transparent(String front_transparent) { 
		 this.front_transparent = front_transparent; } 
    String front_transparent;
}
