package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Ability{
    @JsonProperty("ability") 
    public Ability getAbility() { 
		 return this.ability; } 
    public void setAbility(Ability ability) { 
		 this.ability = ability; } 
    Ability ability;
    @JsonProperty("is_hidden") 
    public boolean getIs_hidden() { 
		 return this.is_hidden; } 
    public void setIs_hidden(boolean is_hidden) { 
		 this.is_hidden = is_hidden; } 
    boolean is_hidden;
    @JsonProperty("slot") 
    public int getSlot() { 
		 return this.slot; } 
    public void setSlot(int slot) { 
		 this.slot = slot; } 
    int slot;
}
