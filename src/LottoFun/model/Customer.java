/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LottoFun.model;

/**
 *
 * @author t.bain
 */
public class Customer {
    private String _name;
    private String _email;
    
    public Customer(){
        this._name = "";
        this._email = "";
    }
    
    public Customer(String name, String email){
        this._name = name;
        this._email = email;
    }
    
    public void setName(String name){
        _name = name;
    }
    
    public String getName(){
        return _name;
    }
    
    @Override
    public String toString() {   // overrides the standard toString() method
            return String.format(_name + ", " + _email  ); 
    }  
    
}
