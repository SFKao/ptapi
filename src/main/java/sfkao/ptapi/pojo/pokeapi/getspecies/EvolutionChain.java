package sfkao.ptapi.pojo.pokeapi.getspecies; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class EvolutionChain{
    @JsonProperty("url") 
    public String getUrl() { 
		 return this.url; } 
    public void setUrl(String url) { 
		 this.url = url; } 
    String url;
}
