package sfkao.ptapi.models;

import jakarta.persistence.*;
import org.hibernate.Hibernate;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    public Pokemon(Integer id, String nombre, String urlSprite, int hp, int atk, int def, int spa, int spd, int spe, String tipo1, String tipo2, Set<Pokemon> formas) {
        this.id = id;
        this.nombre = nombre;
        this.urlSprite = urlSprite;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spa = spa;
        this.spd = spd;
        this.spe = spe;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.formas = formas;
    }

    public Pokemon() {
    }

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    private String nombre;

    private String urlSprite;

    private int hp, atk, def, spa, spd, spe;

    private String tipo1, tipo2;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "pokemon_forms",
            joinColumns = @JoinColumn(name = "pokemon_1_id"),
            inverseJoinColumns = @JoinColumn(name = "pokemons_2_id"))
    private Set<Pokemon> formas = new LinkedHashSet<>();



    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlSprite() {
        return urlSprite;
    }

    public void setUrlSprite(String urlSprite) {
        this.urlSprite = urlSprite;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpa() {
        return spa;
    }

    public void setSpa(int spa) {
        this.spa = spa;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getSpe() {
        return spe;
    }

    public void setSpe(int spe) {
        this.spe = spe;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public Set<Pokemon> getFormas() {
        return formas;
    }

    public void setFormas(Set<Pokemon> formas) {
        this.formas = formas;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Pokemon pokemon = (Pokemon) o;
        return id != null && Objects.equals(id, pokemon.id);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", urlSprite='" + urlSprite + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                ", def=" + def +
                ", spa=" + spa +
                ", spd=" + spd +
                ", spe=" + spe +
                ", tipo1='" + tipo1 + '\'' +
                ", tipo2='" + tipo2 + '\'' +
                '}';
    }
}