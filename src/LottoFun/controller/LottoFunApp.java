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
    //private StudentView studentView;
    
    //Data Model
    private final ArrayList<Ticket> ticketList;
    
    
    public LottoFunApp()
    {
        mainMenu = new MainMenuView();
        ticketMenu = new TicketMenuView();
        lottoInput = new LottoInputDialogue();
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
        CustomerInputDialogue();   /*******/
        runTicketMenu();
       
    }
    public void runTicketMenu()
    {
       int choice;
       boolean quit = false;

       while(!quit)
       {
           header.displayHeader("Ticket Menu");
           choice = ticketMenu.displayTicketMenu();
        
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
        Ticket LottoT ;
        
        LottoT = lottoInput.lottoInputDetails();
        
        ticketList.add(LottoT);
    }
    
    
    
    
    public static void main(String[] args) 
    {
        LottoFunApp lfa = new LottoFunApp();
        lfa.runMainMenu(); 
    }   
}
