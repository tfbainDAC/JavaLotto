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
    
    private Customer customer;
    private int bonusBall;
    private int ball[] = new int[6];
    

    public Ticket(){
        customer = new Customer();
        Random rand = new Random();
        bonusBall = rand.nextInt(49) + 1;
        for(int i=0;i<6;i++){
           ball[i] = rand.nextInt(49) + 1 ;
        }
    }
    public Ticket(Customer cust, int Bonus, int[] balls){
        this.customer = cust;
        Random rand = new Random();
        bonusBall = rand.nextInt(49) + 1;
        for(int i=0;i<6;i++){
           ball[i] = rand.nextInt(49) + 1 ;
        }
    }
    
    public void setCustomer(Customer  cust){
        customer = cust;
    }
    public Customer getCustomer(){
        return customer;
    }
    
    public boolean setBall(int i, int chosenNumber){
	    boolean acceptable=true;
		if(chosenNumber >=1 && chosenNumber <=49){
			for(int j= 0;j<i;j++){
				if (chosenNumber == ball[j]){
					acceptable = false;
				}
			}	
			if(acceptable){
				ball[i] = chosenNumber;
			}
		}
		else{
			acceptable = false;
		}	
		return acceptable;
	}	
    public void setBonus(int chosenNumber){
	    bonusBall = chosenNumber;
	}
  
    public void displayTicket(){
        System.out.println("Ticket for " + customer.getName());
        for(int i=0;i<6;i++){
           System.out.println("Balls " + ball[i]);
        } 
        System.out.println("Bonus " + bonusBall);
    }


}
