/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Avalith.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name = "Technologies")
public class Technologies {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_tecnologia;

    @Size(max = 255)
    private String tecnologia;
    
    
   @ManyToMany(fetch = FetchType.LAZY,

            mappedBy = "Technologies")
    @JsonIgnore
    private Set<Developer> Developers = new HashSet<>();



    public void setDevelopers(Set<Developer> Developers) {
        this.Developers = Developers;
    }

    public Technologies() {
    }

    public long getId_tecnologia() {
        return id_tecnologia;
    }

    public void setId_tecnologia(long id_tecnologia) {
        this.id_tecnologia = id_tecnologia;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
}
