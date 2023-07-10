package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Other{
    @JsonProperty("dream_world") 
    public DreamWorld getDream_world() { 
		 return this.dream_world; } 
    public void setDream_world(DreamWorld dream_world) { 
		 this.dream_world = dream_world; } 
    DreamWorld dream_world;
    @JsonProperty("home") 
    public Home getHome() { 
		 return this.home; } 
    public void setHome(Home home) { 
		 this.home = home; } 
    Home home;
    @JsonProperty("official_artwork") 
    public OfficialArtwork getOfficial_artwork() { 
		 return this.official_artwork; } 
    public void setOfficial_artwork(OfficialArtwork official_artwork) { 
		 this.official_artwork = official_artwork; } 
    OfficialArtwork official_artwork;
}
