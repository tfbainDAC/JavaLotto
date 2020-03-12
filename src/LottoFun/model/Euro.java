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
public class Euro extends Ticket {
    
    private int[] luckyStar = new int[2];
    private String country;
    
    public boolean setluckyStar(int i, int chosenNumber){  

        if(utilities.NumberInRange(chosenNumber,1,49) &&
             (utilities.NumberNotDuplicate(chosenNumber, luckyStar)) &&
                (utilities.NumberNotDuplicate(chosenNumber, _ball))){
                luckyStar[i] = chosenNumber;
                return true;
            }
        return false;
        
    }	

   
    
    
    
}
