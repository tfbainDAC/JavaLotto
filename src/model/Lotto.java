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
public class Lotto extends Ticket{
    
    private int _bonusBall;
    private String _retailer;
    
    public void setBonusBall(int bonusBall){
        _bonusBall = bonusBall;
    }
    
    public int getBonusBall(){
        return _bonusBall;
    }
    
    public void setRetailer(String retailer){
        _retailer = retailer;
    }
    
    public String getRetailer(){
        return _retailer;
    }
}
