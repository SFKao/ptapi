package sfkao.ptapi.pojo.pokeapi.getspecies; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Name{
    @JsonProperty("language") 
    public Language getLanguage() { 
		 return this.language; } 
    public void setLanguage(Language language) { 
		 this.language = language; } 
    Language language;
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
}
