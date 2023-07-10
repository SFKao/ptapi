package sfkao.ptapi.pojo.pokeapi.getspecies; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Genera{
    @JsonProperty("genus") 
    public String getGenus() { 
		 return this.genus; } 
    public void setGenus(String genus) { 
		 this.genus = genus; } 
    String genus;
    @JsonProperty("language") 
    public Language getLanguage() { 
		 return this.language; } 
    public void setLanguage(Language language) { 
		 this.language = language; } 
    Language language;
}
