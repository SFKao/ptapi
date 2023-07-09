package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class GenerationIv{
    @JsonProperty("diamond_pearl") 
    public DiamondPearl getDiamond_pearl() { 
		 return this.diamond_pearl; } 
    public void setDiamond_pearl(DiamondPearl diamond_pearl) { 
		 this.diamond_pearl = diamond_pearl; } 
    DiamondPearl diamond_pearl;
    @JsonProperty("heartgold_soulsilver") 
    public HeartgoldSoulsilver getHeartgold_soulsilver() { 
		 return this.heartgold_soulsilver; } 
    public void setHeartgold_soulsilver(HeartgoldSoulsilver heartgold_soulsilver) { 
		 this.heartgold_soulsilver = heartgold_soulsilver; } 
    HeartgoldSoulsilver heartgold_soulsilver;
    @JsonProperty("platinum") 
    public Platinum getPlatinum() { 
		 return this.platinum; } 
    public void setPlatinum(Platinum platinum) { 
		 this.platinum = platinum; } 
    Platinum platinum;
}
