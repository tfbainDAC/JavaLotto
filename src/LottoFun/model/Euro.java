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
    
    private int[] _luckyStar = new int[2];
    private String _country;
    
    public Euro(){
        super();
         _luckyStar = utilities.generateRandomBalls(49, _luckyStar);
         _country = "";
    }
    
    public boolean setluckyStar(int i, int chosenNumber){  

        if(utilities.NumberInRange(chosenNumber,1,49) &&
             (utilities.NumberNotDuplicate(chosenNumber, _luckyStar)) &&
                (utilities.NumberNotDuplicate(chosenNumber, _ball))){
                _luckyStar[i] = chosenNumber;
                return true;
            }
        return false;
        
    }	

    public int[] getLuckyStar(){
        return _luckyStar;
    }
    
    public void setCountry(String country){
        _country = country;
    }
    
    public String getCountry(){
        return _country;
    }
            
    
    @Override
    public String toString(){
        String ballNos="", lucky = "";
        for( int i: _ball){
            ballNos = ballNos + String.valueOf(i) + " ";
        }
        for( int i: _luckyStar){
            lucky = lucky + String.valueOf(i) + " ";
        }
        return String.format("Lotto Ticket for %1s " +
                             "Ticket is bought in %2s " +
                             "Ball numbers are %3s " +
                             "Lucky stars are %4s", 
                             _customer.getName(),
                             _country,
                             ballNos,
                             lucky); 
    }

    
}
