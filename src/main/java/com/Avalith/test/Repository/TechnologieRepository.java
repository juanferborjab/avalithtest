/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Avalith.test.Repository;

import com.Avalith.test.entity.Technologies;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author juanfernandoborjabrito
 */
public interface TechnologieRepository extends JpaRepository<Technologies, Long> {
    Technologies findBytecnologia(String tecnologia);
}

