package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class DreamWorld{
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
}
