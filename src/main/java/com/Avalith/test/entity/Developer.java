package com.Avalith.test.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.annotations.NaturalId;
import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name = "developer")


public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_developer;

    @Size(max = 200)
    private String nombres_completos;

    @Size(max = 250)
    private String link_github;
    
    
    
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "developer_technologies",
        joinColumns = @JoinColumn(name = "id_developer"),
        inverseJoinColumns = @JoinColumn(name = "id_tecnologia")
    )
   @JsonIgnore
    private Set<Technologies> Technologies = new HashSet<>();

    public Developer() {

    }

    public long getId_developer() {
        return id_developer;
    }

    public void setId_developer(long id_developer) {
        this.id_developer = id_developer;
    }

    public String getNombres_completos() {
        return nombres_completos;
    }

    public void setNombres_completos(String nombres_completos) {
        this.nombres_completos = nombres_completos;
    }

    public String getLink_github() {
        return link_github;
    }

    public void setLink_github(String link_github) {
        this.link_github = link_github;
    }

    public Set<Technologies> getTechnologies() {
        return Technologies;
    }

    public void setTechnologies(Set<Technologies> Technologies) {
        this.Technologies = Technologies;
    }

   
    	
	

}
