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
public class utilities {

    /**
     *
     * @param chosenNumber, input number 
     * @param from, starting range for number
     * @param to, end of range for number
     * @return
     */
    public static boolean NumberInRange(int chosenNumber,int from, int to) {
        boolean inRange = false;
        if (chosenNumber >= from && chosenNumber <=to) 
            inRange = true; 
        return inRange;
    }
    
    public static boolean NumberNotDuplicate(int chosenNumber, int arr[]){  
	
        boolean notDuplicate = true;
        
        if (arr != null){
            for(int j= 0;j<arr.length;j++){   
                if (chosenNumber == arr[j]){
                    notDuplicate =  false;
		}
            }
        } 
        
        return notDuplicate;
    }    
}
