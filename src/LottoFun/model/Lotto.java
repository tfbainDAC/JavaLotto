/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LottoFun.model;

import java.util.Random;

/**
 *
 * @author t.bain
 */
public class Lotto extends Ticket{
    
    private int _bonusBall;
    private String _retailer;
    
    public Lotto(){
       Random rand = new Random();
        _bonusBall = rand.nextInt(49) + 1;
    }
    
    public boolean setBonusBall(int bonusBall){
         if(utilities.NumberInRange(bonusBall,1,49) &&
             (utilities.NumberNotDuplicate(bonusBall, _ball))){
                 _bonusBall = bonusBall;;
                return true;
            }
        return false;
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
