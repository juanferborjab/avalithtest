/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Avalith.test.Controller;
import com.Avalith.test.entity.Developer;
import com.Avalith.test.entity.Technologies;
import com.Avalith.test.Repository.DeveloperRepository;
import com.Avalith.test.Exception.ResourceNotFoundException;
import com.Avalith.test.model.developerModel;
     
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Avalith.test.Repository.TechnologieRepository;


@RestController
@RequestMapping("/developers")
public class DeveloperController {

    @Autowired
    private DeveloperRepository developerRepository;
    
    @Autowired
    private TechnologieRepository tecnologiaRepository;
    
    
    @PostMapping
    public Developer createDeveloper(@Valid @RequestBody developerModel developer) {
        
        List<Technologies> lit = tecnologiaRepository.findAll(); 
        Developer d = new Developer();
        d.setLink_github(developer.getLink_github());
        d.setNombres_completos(developer.getNombres_completos());
        List<String> tech = developer.getTecnologias_conocidas();
        System.out.println("Tecnologías: "+tech.size());
        Set<Technologies> s = new HashSet<>();
        List<String> tec = new ArrayList<>();
        for (Technologies tecno : lit) {
                tec.add(tecno.getTecnologia());
                
            }
        
        
        for (String tecnol : tech) {
            Technologies t = new Technologies();
            if (!tec.contains(tecnol)) {
                
            t.setTecnologia(tecnol);
             tecnologiaRepository.save(t);
            
            }
            t = tecnologiaRepository.findBytecnologia(tecnol);
            s.add(t);
            
            
        }
        
        
   
        d.setTechnologies(s);
        return developerRepository.save(d);
    }
    
    @GetMapping
    public List<Developer> allDevelopers() {
        return developerRepository.findAll();
    }
    
    @PutMapping("/{id}")
    public Developer updateDeveloper(@PathVariable(value = "id") Long id,
            @Valid @RequestBody developerModel developer) {

        List<Technologies> lit = tecnologiaRepository.findAll();
        Developer d = developerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Developer", "id", id));

        
        d.setLink_github(developer.getLink_github());
        d.setNombres_completos(developer.getNombres_completos());
        List<String> tech = developer.getTecnologias_conocidas();
        System.out.println("Tecnologías: "+tech.size());
        Set<Technologies> s = new HashSet<>();
        List<String> tec = new ArrayList<>();
        for (Technologies tecno : lit) {
                tec.add(tecno.getTecnologia());
                
            }
        
        
        for (String tecnol : tech) {
            Technologies t = new Technologies();
            if (!tec.contains(tecnol)) {
                
            t.setTecnologia(tecnol);
             tecnologiaRepository.save(t);
            
            }
            t = tecnologiaRepository.findBytecnologia(tecnol);
            s.add(t);
            
            
        }
        
        return developerRepository.save(d);

    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDeveloper(@PathVariable(value = "id") Long id) {
        Developer d = developerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Developer", "id", id));

        developerRepository.delete(d);

        return ResponseEntity.ok().build();
    }
    
    
}

