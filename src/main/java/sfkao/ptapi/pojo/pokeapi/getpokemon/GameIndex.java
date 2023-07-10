package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class GameIndex{
    @JsonProperty("game_index") 
    public int getGame_index() { 
		 return this.game_index; } 
    public void setGame_index(int game_index) { 
		 this.game_index = game_index; } 
    int game_index;
    @JsonProperty("version") 
    public Version getVersion() { 
		 return this.version; } 
    public void setVersion(Version version) { 
		 this.version = version; } 
    Version version;
}
