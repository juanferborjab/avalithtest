/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Avalith.test.Repository;

import com.Avalith.test.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juanfernandoborjabrito
 */
   @Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
 

}
