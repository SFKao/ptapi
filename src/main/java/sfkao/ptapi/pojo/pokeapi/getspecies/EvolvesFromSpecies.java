package sfkao.ptapi.pojo.pokeapi.getspecies; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class EvolvesFromSpecies{
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("url") 
    public String getUrl() { 
		 return this.url; } 
    public void setUrl(String url) { 
		 this.url = url; } 
    String url;
}
