/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Avalith.test.model;
import java.util.List;



public class developerModel {
    String nombres_completos;
    String link_github;
    List<String> tecnologias_conocidas;

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

    public List<String> getTecnologias_conocidas() {
        return tecnologias_conocidas;
    }

    public void setTecnologias_conocidas(List<String> tecnologias_conocidas) {
        this.tecnologias_conocidas = tecnologias_conocidas;
    }

}