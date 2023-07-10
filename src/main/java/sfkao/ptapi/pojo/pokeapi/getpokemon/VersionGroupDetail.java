package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class VersionGroupDetail{
    @JsonProperty("level_learned_at") 
    public int getLevel_learned_at() { 
		 return this.level_learned_at; } 
    public void setLevel_learned_at(int level_learned_at) { 
		 this.level_learned_at = level_learned_at; } 
    int level_learned_at;
    @JsonProperty("move_learn_method") 
    public MoveLearnMethod getMove_learn_method() { 
		 return this.move_learn_method; } 
    public void setMove_learn_method(MoveLearnMethod move_learn_method) { 
		 this.move_learn_method = move_learn_method; } 
    MoveLearnMethod move_learn_method;
    @JsonProperty("version_group") 
    public VersionGroup getVersion_group() { 
		 return this.version_group; } 
    public void setVersion_group(VersionGroup version_group) { 
		 this.version_group = version_group; } 
    VersionGroup version_group;
}
