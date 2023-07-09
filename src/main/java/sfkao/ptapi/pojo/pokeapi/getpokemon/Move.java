package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class Move{
    @JsonProperty("move") 
    public Move getMove() { 
		 return this.move; } 
    public void setMove(Move move) { 
		 this.move = move; } 
    Move move;
    @JsonProperty("version_group_details") 
    public List<VersionGroupDetail> getVersion_group_details() { 
		 return this.version_group_details; } 
    public void setVersion_group_details(List<VersionGroupDetail> version_group_details) { 
		 this.version_group_details = version_group_details; } 
    List<VersionGroupDetail> version_group_details;
}
