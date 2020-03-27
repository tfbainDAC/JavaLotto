/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LottoFun.view;
import java.util.Scanner;
import LottoFun.model.*;
/**
 *
 * @author t.bain
 */
public class TicketMenuView {
    public TicketMenuView()
    {
        
    }
    
    public int displayTicketMenu(Customer cust)
    {
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;
        
        System.out.println("Customer :"+ cust.toString()+"\n");
        System.out.println("1. Lotto");
        System.out.println("2. Euro");
        System.out.println("3. Quit");
        System.out.println("");
        System.out.println("Please enter your choice: ");
        
        menuChoice = s.nextInt();
        
        return menuChoice;
    }
    
   
}
