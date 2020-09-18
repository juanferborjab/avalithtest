/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Avalith.test.Controller;
import com.Avalith.test.entity.Technologies;
import com.Avalith.test.Repository.TechnologieRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juanfernandoborjabrito
 */
@RestController
@RequestMapping("/tecnologias")
public class TechnologieController {
    
    @Autowired
    private TechnologieRepository tecnologiaRepository;

    @PostMapping
    public Technologies createDeveloper(@Valid @RequestBody Technologies tecnologia) {
        
        
        
        return tecnologiaRepository.save(tecnologia);
    }
}