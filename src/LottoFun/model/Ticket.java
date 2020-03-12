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
public class Ticket {
    
    protected Customer _customer;
    protected int _ball[] = new int[6];
    

    public Ticket(){
        _customer = new Customer();
        Random rand = new Random();
        for(int i=0;i<6;i++){
           _ball[i] = rand.nextInt(49) + 1 ;
        }
    }
    public Ticket(Customer cust, int Bonus, int[] balls){
        this._customer = cust;
        Random rand = new Random();
        for(int i=0;i<6;i++){
           _ball[i] = rand.nextInt(49) + 1 ;
        }
    }
    
    public void setCustomer(Customer  cust){
        _customer = cust;
    }
    public Customer getCustomer(){
        return _customer;
    }
    
    public boolean setBall(int i, int chosenNumber){
	    boolean acceptable=true;
		if(chosenNumber >=1 && chosenNumber <=49){
			for(int j= 0;j<i;j++){
				if (chosenNumber == _ball[j]){
					acceptable = false;
				}
			}	
			if(acceptable){
				_ball[i] = chosenNumber;
			}
		}
		else{
			acceptable = false;
		}	
		return acceptable;
	}	
  
    public void displayTicket(){
        System.out.println("Ticket for " + _customer.getName());
        for(int i=0;i<6;i++){
           System.out.println("Balls " + _ball[i]);
        } 
    }


}
