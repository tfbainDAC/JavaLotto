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
    public boolean setluckyStar(int i, int chosenNumber){  // refactor as same code in Ticket
	    boolean acceptable=true;
		if(chosenNumber >=1 && chosenNumber <=49){
			for(int j= 0;j<i;j++){   // maybe make a util check duplicates
				if (chosenNumber == luckyStar[j]){
					acceptable = false;
				}
			}	
			if(acceptable){
				luckyStar[i] = chosenNumber;
			}
		}
		else{
			acceptable = false;
		}	
		return acceptable;
	}	
    
    
    
}
