package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Stat{
    @JsonProperty("base_stat") 
    public int getBase_stat() { 
		 return this.base_stat; } 
    public void setBase_stat(int base_stat) { 
		 this.base_stat = base_stat; } 
    int base_stat;
    @JsonProperty("effort") 
    public int getEffort() { 
		 return this.effort; } 
    public void setEffort(int effort) { 
		 this.effort = effort; } 
    int effort;
    @JsonProperty("stat") 
    public Stat2 getStat() {
		 return this.stat; }
    public void setStat2(Stat2 stat) {
		 this.stat = stat; }
    Stat2 stat;
}
