/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author t.bain
 */
public class Customer {
    private String _name;
    private String _phone;
    private String _email;
    
    public Customer(){
        this._name = "";
        this._email = "";
        this._phone = "";
    }
    
    public Customer(String name, String email, String phone){
        this._name = name;
        this._email = email;
        this._phone = phone;
    }
    
    public void setName(String name){
        _name = name;
    }
    
    public String getName(){
        return _name;
    }
    
    @Override
    public String toString() {   // overrides the standard toString() method
            return String.format("Customer " + _name + ", " + _email + ", " + _phone ); 
    }  
    
}
