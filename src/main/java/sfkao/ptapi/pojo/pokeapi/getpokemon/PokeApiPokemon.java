package sfkao.ptapi.pojo.pokeapi.getpokemon; 
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.List;
public class PokeApiPokemon{
    @JsonProperty("abilities") 
    public List<Ability> getAbilities() {
		 return this.abilities; } 
    public void setAbilities(List<Ability> abilities) { 
		 this.abilities = abilities; } 
    List<Ability> abilities;
    @JsonProperty("base_experience") 
    public int getBase_experience() { 
		 return this.base_experience; } 
    public void setBase_experience(int base_experience) { 
		 this.base_experience = base_experience; } 
    int base_experience;
    @JsonProperty("forms") 
    public List<Form> getForms() { 
		 return this.forms; } 
    public void setForms(List<Form> forms) { 
		 this.forms = forms; } 
    List<Form> forms;
    @JsonProperty("game_indices") 
    public List<GameIndex> getGame_indices() { 
		 return this.game_indices; } 
    public void setGame_indices(List<GameIndex> game_indices) { 
		 this.game_indices = game_indices; } 
    List<GameIndex> game_indices;
    @JsonProperty("height") 
    public int getHeight() { 
		 return this.height; } 
    public void setHeight(int height) { 
		 this.height = height; } 
    int height;
    @JsonProperty("held_items") 
    public List<Object> getHeld_items() { 
		 return this.held_items; } 
    public void setHeld_items(List<Object> held_items) { 
		 this.held_items = held_items; } 
    List<Object> held_items;
    @JsonProperty("id") 
    public int getId() { 
		 return this.id; } 
    public void setId(int id) { 
		 this.id = id; } 
    int id;
    @JsonProperty("is_default") 
    public boolean getIs_default() { 
		 return this.is_default; } 
    public void setIs_default(boolean is_default) { 
		 this.is_default = is_default; } 
    boolean is_default;
    @JsonProperty("location_area_encounters") 
    public String getLocation_area_encounters() { 
		 return this.location_area_encounters; } 
    public void setLocation_area_encounters(String location_area_encounters) { 
		 this.location_area_encounters = location_area_encounters; } 
    String location_area_encounters;
    @JsonProperty("moves") 
    public List<Move> getMoves() { 
		 return this.moves; } 
    public void setMoves(List<Move> moves) { 
		 this.moves = moves; } 
    List<Move> moves;
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("order") 
    public int getOrder() { 
		 return this.order; } 
    public void setOrder(int order) { 
		 this.order = order; } 
    int order;
    @JsonProperty("past_types") 
    public List<Object> getPast_types() { 
		 return this.past_types; } 
    public void setPast_types(List<Object> past_types) { 
		 this.past_types = past_types; } 
    List<Object> past_types;
    @JsonProperty("species") 
    public Species getSpecies() { 
		 return this.species; } 
    public void setSpecies(Species species) { 
		 this.species = species; } 
    Species species;
    @JsonProperty("sprites") 
    public Sprites getSprites() { 
		 return this.sprites; } 
    public void setSprites(Sprites sprites) { 
		 this.sprites = sprites; } 
    Sprites sprites;
    @JsonProperty("stats") 
    public List<Stat> getStats() { 
		 return this.stats; } 
    public void setStats(List<Stat> stats) { 
		 this.stats = stats; } 
    List<Stat> stats;
    @JsonProperty("types") 
    public List<Type> getTypes() { 
		 return this.types; } 
    public void setTypes(List<Type> types) { 
		 this.types = types; } 
    List<Type> types;
    @JsonProperty("weight") 
    public int getWeight() { 
		 return this.weight; } 
    public void setWeight(int weight) { 
		 this.weight = weight; } 
    int weight;
}
