/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LottoFun.view;
import java.util.Scanner;
import LottoFun.model.*;
import java.util.ArrayList;
/**
 *
 * @author t.bain
 */
public class TicketMenuView {
    public TicketMenuView()
    {
        
    }
    
    public int displayTicketMenu(Customer cust, ArrayList<Ticket> ticketList)
    {
        //  NOTE: THIS IS A PART WHICH WOULD BE AFFECTED WHEN ADDING THE CURRENT BASKET TO THE CUSTOMER OBJECT
        //  THIS WOULD ONLY RECEIVE CUSTOMER AS AN ARGUMENT AND THEN WE WOULD code ticketlist = cust.getTicketList();
        Scanner s = new Scanner(System.in);
        int menuChoice = 0; 
        
        System.out.println("Customer :  "+ cust.toString()+"\n");
        //displayBasket(Customer cust);
        System.out.println("Current Tickets in Basket: ");
        if (ticketList.isEmpty()){
            System.out.println("None");
        }
        else
        {
            ticketList.forEach((t) -> {
            System.out.println(t.toString());
         });
        }
        System.out.println("\nPurchase Ticket or type 3 to quit ...");
        System.out.println("1. Lotto");
        System.out.println("2. Euro");
        System.out.println("3. Quit");
        System.out.println("");
        System.out.println("Please enter your choice: ");
        
        menuChoice = s.nextInt();
        
        return menuChoice;
    }
    
   
}
