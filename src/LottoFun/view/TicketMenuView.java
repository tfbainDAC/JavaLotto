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
    
    public int displayTicketMenu()
    {
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;
        
        System.out.println("Ticket Menu");
        System.out.println("");
        System.out.println("1. Lotto");
        System.out.println("2. Euro");
        System.out.println("3. Quit");
        System.out.println("");
        System.out.println("Please enter your choice: ");
        
        menuChoice = s.nextInt();
        
        return menuChoice;
    }
    
    public int displayLottoChoices(Customer cust)
    {
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;
        
        System.out.println("Lottery Ticket purchase");
        System.out.println("Customer: " + cust.toString());
        System.out.println("1. Generate Numbers");
        System.out.println("2. Enter Numbers");
        System.out.println("3. Quit ");
        System.out.println("");
        System.out.println("Please enter your choice: ");
        
        menuChoice = s.nextInt();
        
        return menuChoice;
    }
    
    public int displayEuroChoices(Customer cust)
    {
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;
        
        System.out.println("Euro Ticket Menu");
        System.out.println("Customer: " + cust.toString());
        System.out.println("");
        System.out.println("1. Generate Numbers");
        System.out.println("2. Enter Numbers");
        System.out.println("3. Quit");
        System.out.println("");
        System.out.println("Please enter your choice: ");
        
        menuChoice = s.nextInt();
        
        return menuChoice;
    }
}
