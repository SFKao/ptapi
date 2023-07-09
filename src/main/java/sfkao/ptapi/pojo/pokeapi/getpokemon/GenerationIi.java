package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class GenerationIi{
    @JsonProperty("crystal") 
    public Crystal getCrystal() { 
		 return this.crystal; } 
    public void setCrystal(Crystal crystal) { 
		 this.crystal = crystal; } 
    Crystal crystal;
    @JsonProperty("gold") 
    public Gold getGold() { 
		 return this.gold; } 
    public void setGold(Gold gold) { 
		 this.gold = gold; } 
    Gold gold;
    @JsonProperty("silver") 
    public Silver getSilver() { 
		 return this.silver; } 
    public void setSilver(Silver silver) { 
		 this.silver = silver; } 
    Silver silver;
}
