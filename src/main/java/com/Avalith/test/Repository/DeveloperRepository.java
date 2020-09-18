/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Avalith.test.Repository;

import com.Avalith.test.entity.Developer;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
/**
 *
 * @author juanfernandoborjabrito
 */
   @Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
 

    Optional<Developer> findByName(String name);

}
