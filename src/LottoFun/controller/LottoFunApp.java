/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LottoFun.controller;
import LottoFun.model.utilities;
import LottoFun.view.MainMenuView;
import LottoFun.view.Header;
/**
 *
 * @author t.bain
 */
public class LottoFunApp {
    private final MainMenuView mainMenu;
    private final Header header;
    
    public LottoFunApp()
    {
        mainMenu = new MainMenuView();
        header = new Header();
    }
    
    public void runMainMenu()
    {
       int choice;
       boolean quit = false;
       System.out.println("hello");
       int[] arr = new int[6];
       arr = utilities.generateRandomBalls(49, arr);
       while(!quit)
       {
           header.displayHeader("Main Menu");
            choice = mainMenu.displayMainMenu();

            switch(choice)
            {
                case 1:
                    System.out.println("Doing something");
                    break;
                case 2:
                    System.out.println("Doing option 2");
                    break;
                case 3:
                    System.out.println("Doing option 3");
                    break;
                case 4:
                    System.out.println("Doing option 4");
                    break;
                case 5:
                    System.out.println("Quit Program");
                    quit = true;
                    break;
                default:
                    System.out.println("Please choose a valid option");           
            }
       }
       
    }
    
    public static void main(String[] args) 
    {
        LottoFunApp lfa = new LottoFunApp();
        lfa.runMainMenu(); 
    }   
}
