package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class GenerationVii{
    @JsonProperty("icons") 
    public Icons getIcons() { 
		 return this.icons; } 
    public void setIcons(Icons icons) { 
		 this.icons = icons; } 
    Icons icons;
    @JsonProperty("ultra_sun_ultra_moon") 
    public UltraSunUltraMoon getUltra_sun_ultra_moon() { 
		 return this.ultra_sun_ultra_moon; } 
    public void setUltra_sun_ultra_moon(UltraSunUltraMoon ultra_sun_ultra_moon) { 
		 this.ultra_sun_ultra_moon = ultra_sun_ultra_moon; } 
    UltraSunUltraMoon ultra_sun_ultra_moon;
}
