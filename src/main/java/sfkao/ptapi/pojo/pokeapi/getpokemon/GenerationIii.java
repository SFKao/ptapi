package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class GenerationIii{
    @JsonProperty("emerald") 
    public Emerald getEmerald() { 
		 return this.emerald; } 
    public void setEmerald(Emerald emerald) { 
		 this.emerald = emerald; } 
    Emerald emerald;
    @JsonProperty("firered_leafgreen") 
    public FireredLeafgreen getFirered_leafgreen() { 
		 return this.firered_leafgreen; } 
    public void setFirered_leafgreen(FireredLeafgreen firered_leafgreen) { 
		 this.firered_leafgreen = firered_leafgreen; } 
    FireredLeafgreen firered_leafgreen;
    @JsonProperty("ruby_sapphire") 
    public RubySapphire getRuby_sapphire() { 
		 return this.ruby_sapphire; } 
    public void setRuby_sapphire(RubySapphire ruby_sapphire) { 
		 this.ruby_sapphire = ruby_sapphire; } 
    RubySapphire ruby_sapphire;
}
