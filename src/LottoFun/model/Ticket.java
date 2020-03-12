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
public abstract class Ticket {
    
    protected Customer _customer;
    protected int _ball[] = new int[6];
    

    public Ticket(){
        _customer = new Customer();
        _ball = utilities.generateRandomBalls(49, _ball);
    }
    public Ticket(Customer cust, int[] balls){
        this._customer = cust;
        this._ball = balls;
    }
    
    public void setCustomer(Customer  cust){
        _customer = cust;
    }
    public Customer getCustomer(){
        return _customer;
    }
    
    public boolean setBall(int i, int chosenNumber){
	    
        if(utilities.NumberInRange(chosenNumber,1,49) &&
             (utilities.NumberNotDuplicate(chosenNumber, _ball))){
                 _ball[i] = chosenNumber;
                return true;
            }
        return false;

	}	

    @Override
    public abstract String toString();   // overrides the standard toString() method
             
  
}
