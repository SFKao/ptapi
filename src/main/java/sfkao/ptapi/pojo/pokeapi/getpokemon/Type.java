package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Type{
    @JsonProperty("slot") 
    public int getSlot() { 
		 return this.slot; } 
    public void setSlot(int slot) { 
		 this.slot = slot; } 
    int slot;
    @JsonProperty("type") 
    public Type2 getType2() {
		 return this.type2; }
    public void setType2(Type2 type2) {
		 this.type2 = type2; }
    Type2 type2;
}
