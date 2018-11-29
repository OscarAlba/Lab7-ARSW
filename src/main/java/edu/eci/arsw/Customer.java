/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw;

import org.springframework.data.annotation.Id;

/**
 *
 * @author 2109734
 */
public class Customer {
    
    @Id
    public String id;
    
    public String data;
    public String identifier;
    public String type;
    
    public Customer() {}

    public Customer(String identifier,String data, String type) {
        this.identifier = identifier;
        this.type = type;
        this.data = data;
    }
    
    public String getData(){
        return data;
    }
}
