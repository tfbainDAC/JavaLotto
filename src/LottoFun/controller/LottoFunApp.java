/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LottoFun.controller;

import LottoFun.view.*;
import LottoFun.model.*;
import java.util.ArrayList;
/**
 *
 * @author t.bain
 */
public class LottoFunApp {
    private final MainMenuView mainMenu;
    private final TicketMenuView ticketMenu;
    private final Header header;

    private LottoInputDialogue lottoInput;
    private CustomerInputDialogue customerInput;
    //private StudentView studentView;
    
    //Data Model
    private ArrayList<Ticket> ticketList;
    private Customer currentCustomer;
    
    public LottoFunApp()
    {
        mainMenu = new MainMenuView();
        ticketMenu = new TicketMenuView();
        lottoInput = new LottoInputDialogue();
        customerInput = new CustomerInputDialogue();
        header = new Header();
        ticketList = new ArrayList();
    }
    
    public void runMainMenu()
    {
       int choice;
       boolean quit = false;

       while(!quit)
       {
           header.displayHeader("Main Menu");
           choice = mainMenu.displayMainMenu();
        
            switch(choice)
            {
                case 1:
                    createTickets();
                    break;
                case 2:
                    System.out.println("Quit Program");
                    quit = true;
                    break;
                default:
                    System.out.println("Please choose a valid option");           
            }
       }
       
    }
    public void createTickets()
    {
        currentCustomer = customerInput.inputCustomerDetails();  // object *********  
        if(!currentCustomer.getName().equalsIgnoreCase("Quit")){
            runTicketMenu();
        }
       
    }
    public void runTicketMenu()
    {
       int choice;
       boolean quit = false;

       while(!quit)
       {
           header.displayHeader("Customer Ticket Menu");
           choice = ticketMenu.displayTicketMenu(currentCustomer, ticketList);
        
            switch(choice)
            {
                case 1:
                    createLotto();
                    break;
                 case 2:
                    System.out.println("Euro");
                    break;    
                case 3:
                    System.out.println("Quit Program");
                    quit = true;
                    break;
                default:
                    System.out.println("Please choose a valid option");           
            }
       }
       
    }
    
    public void createLotto()
    {
           int choice = 0; 
           boolean quit = false;
           
           while(!quit)
           {   
           header.displayHeader("Lotto Ticket ");
           choice = lottoInput.displayLottoChoices(currentCustomer);
       
            switch(choice)
            {
                case 1:
                    generateLotto();
                    quit = true;
                    break;
                 case 2:
                    inputLotto(); 
                    quit = true;
                    break;    
                  default:
                    System.out.println("Please choose a valid option");           
            }
           }
 
    }
    
    public void generateLotto(){
        Lotto LottoT ;
        LottoT = new Lotto(currentCustomer);  // creates new lottery ticket with random numbers
        System.out.println(LottoT.toString());
        if(lottoInput.confirmPurchase()){
            ticketList.add(LottoT);
        }
    }
    public void inputLotto(){
        Lotto LottoT ;
        LottoT = new Lotto(currentCustomer);  // creates new lottery ticket with random numbers
        LottoT =  lottoInput.lottoInputNumbers(LottoT);
        ticketList.add(LottoT);
    }

    public static void main(String[] args) 
    {
        LottoFunApp lfa = new LottoFunApp();
        lfa.runMainMenu(); 
    }   
}
