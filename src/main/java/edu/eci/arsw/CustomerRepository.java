/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author 2109734
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByIdentifierAndType(String identifier, String Type);

}
