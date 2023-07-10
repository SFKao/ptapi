package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class GenerationVi{
    @JsonProperty("omegaruby_alphasapphire") 
    public OmegarubyAlphasapphire getOmegaruby_alphasapphire() { 
		 return this.omegaruby_alphasapphire; } 
    public void setOmegaruby_alphasapphire(OmegarubyAlphasapphire omegaruby_alphasapphire) { 
		 this.omegaruby_alphasapphire = omegaruby_alphasapphire; } 
    OmegarubyAlphasapphire omegaruby_alphasapphire;
    @JsonProperty("x_y") 
    public XY getX_y() { 
		 return this.x_y; } 
    public void setX_y(XY x_y) { 
		 this.x_y = x_y; } 
    XY x_y;
}
