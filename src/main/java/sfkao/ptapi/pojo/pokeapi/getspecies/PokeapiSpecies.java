package sfkao.ptapi.pojo.pokeapi.getspecies; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class PokeapiSpecies {
    @JsonProperty("base_happiness") 
    public int getBase_happiness() { 
		 return this.base_happiness; } 
    public void setBase_happiness(int base_happiness) { 
		 this.base_happiness = base_happiness; } 
    int base_happiness;
    @JsonProperty("capture_rate") 
    public int getCapture_rate() { 
		 return this.capture_rate; } 
    public void setCapture_rate(int capture_rate) { 
		 this.capture_rate = capture_rate; } 
    int capture_rate;
    @JsonProperty("color") 
    public Color getColor() { 
		 return this.color; } 
    public void setColor(Color color) { 
		 this.color = color; } 
    Color color;
    @JsonProperty("egg_groups") 
    public List<EggGroup> getEgg_groups() { 
		 return this.egg_groups; } 
    public void setEgg_groups(List<EggGroup> egg_groups) { 
		 this.egg_groups = egg_groups; } 
    List<EggGroup> egg_groups;
    @JsonProperty("evolution_chain") 
    public EvolutionChain getEvolution_chain() { 
		 return this.evolution_chain; } 
    public void setEvolution_chain(EvolutionChain evolution_chain) { 
		 this.evolution_chain = evolution_chain; } 
    EvolutionChain evolution_chain;
    @JsonProperty("evolves_from_species") 
    public EvolvesFromSpecies getEvolves_from_species() { 
		 return this.evolves_from_species; } 
    public void setEvolves_from_species(EvolvesFromSpecies evolves_from_species) { 
		 this.evolves_from_species = evolves_from_species; } 
    EvolvesFromSpecies evolves_from_species;
    @JsonProperty("flavor_text_entries") 
    public List<FlavorTextEntry> getFlavor_text_entries() { 
		 return this.flavor_text_entries; } 
    public void setFlavor_text_entries(List<FlavorTextEntry> flavor_text_entries) { 
		 this.flavor_text_entries = flavor_text_entries; } 
    List<FlavorTextEntry> flavor_text_entries;
    @JsonProperty("form_descriptions") 
    public List<Object> getForm_descriptions() { 
		 return this.form_descriptions; } 
    public void setForm_descriptions(List<Object> form_descriptions) { 
		 this.form_descriptions = form_descriptions; } 
    List<Object> form_descriptions;
    @JsonProperty("forms_switchable") 
    public boolean getForms_switchable() { 
		 return this.forms_switchable; } 
    public void setForms_switchable(boolean forms_switchable) { 
		 this.forms_switchable = forms_switchable; } 
    boolean forms_switchable;
    @JsonProperty("gender_rate") 
    public int getGender_rate() { 
		 return this.gender_rate; } 
    public void setGender_rate(int gender_rate) { 
		 this.gender_rate = gender_rate; } 
    int gender_rate;
    @JsonProperty("genera") 
    public List<Genera> getGenera() { 
		 return this.genera; } 
    public void setGenera(List<Genera> genera) { 
		 this.genera = genera; } 
    List<Genera> genera;
    @JsonProperty("generation") 
    public Generation getGeneration() { 
		 return this.generation; } 
    public void setGeneration(Generation generation) { 
		 this.generation = generation; } 
    Generation generation;
    @JsonProperty("growth_rate") 
    public GrowthRate getGrowth_rate() { 
		 return this.growth_rate; } 
    public void setGrowth_rate(GrowthRate growth_rate) { 
		 this.growth_rate = growth_rate; } 
    GrowthRate growth_rate;
    @JsonProperty("habitat") 
    public Object getHabitat() { 
		 return this.habitat; } 
    public void setHabitat(Object habitat) { 
		 this.habitat = habitat; } 
    Object habitat;
    @JsonProperty("has_gender_differences") 
    public boolean getHas_gender_differences() { 
		 return this.has_gender_differences; } 
    public void setHas_gender_differences(boolean has_gender_differences) { 
		 this.has_gender_differences = has_gender_differences; } 
    boolean has_gender_differences;
    @JsonProperty("hatch_counter") 
    public int getHatch_counter() { 
		 return this.hatch_counter; } 
    public void setHatch_counter(int hatch_counter) { 
		 this.hatch_counter = hatch_counter; } 
    int hatch_counter;
    @JsonProperty("id") 
    public int getId() { 
		 return this.id; } 
    public void setId(int id) { 
		 this.id = id; } 
    int id;
    @JsonProperty("is_baby") 
    public boolean getIs_baby() { 
		 return this.is_baby; } 
    public void setIs_baby(boolean is_baby) { 
		 this.is_baby = is_baby; } 
    boolean is_baby;
    @JsonProperty("is_legendary") 
    public boolean getIs_legendary() { 
		 return this.is_legendary; } 
    public void setIs_legendary(boolean is_legendary) { 
		 this.is_legendary = is_legendary; } 
    boolean is_legendary;
    @JsonProperty("is_mythical") 
    public boolean getIs_mythical() { 
		 return this.is_mythical; } 
    public void setIs_mythical(boolean is_mythical) { 
		 this.is_mythical = is_mythical; } 
    boolean is_mythical;
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("names") 
    public List<Name> getNames() { 
		 return this.names; } 
    public void setNames(List<Name> names) { 
		 this.names = names; } 
    List<Name> names;
    @JsonProperty("order") 
    public int getOrder() { 
		 return this.order; } 
    public void setOrder(int order) { 
		 this.order = order; } 
    int order;
    @JsonProperty("pal_park_encounters") 
    public List<Object> getPal_park_encounters() { 
		 return this.pal_park_encounters; } 
    public void setPal_park_encounters(List<Object> pal_park_encounters) { 
		 this.pal_park_encounters = pal_park_encounters; } 
    List<Object> pal_park_encounters;
    @JsonProperty("pokedex_numbers") 
    public List<PokedexNumber> getPokedex_numbers() { 
		 return this.pokedex_numbers; } 
    public void setPokedex_numbers(List<PokedexNumber> pokedex_numbers) { 
		 this.pokedex_numbers = pokedex_numbers; } 
    List<PokedexNumber> pokedex_numbers;
    @JsonProperty("shape") 
    public Object getShape() { 
		 return this.shape; } 
    public void setShape(Object shape) { 
		 this.shape = shape; } 
    Object shape;
    @JsonProperty("varieties") 
    public List<Variety> getVarieties() { 
		 return this.varieties; } 
    public void setVarieties(List<Variety> varieties) { 
		 this.varieties = varieties; } 
    List<Variety> varieties;
}
