package sfkao.ptapi.pojo.pokeapi.getspecies; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class FlavorTextEntry{
    @JsonProperty("flavor_text") 
    public String getFlavor_text() { 
		 return this.flavor_text; } 
    public void setFlavor_text(String flavor_text) { 
		 this.flavor_text = flavor_text; } 
    String flavor_text;
    @JsonProperty("language") 
    public Language getLanguage() { 
		 return this.language; } 
    public void setLanguage(Language language) { 
		 this.language = language; } 
    Language language;
    @JsonProperty("version") 
    public Version getVersion() { 
		 return this.version; } 
    public void setVersion(Version version) { 
		 this.version = version; } 
    Version version;
}
