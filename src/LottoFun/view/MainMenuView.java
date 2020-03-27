/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LottoFun.view;
import java.util.Scanner;
/**
 *
 * @author t.bain
 */
public class MainMenuView {
    public MainMenuView()
    {
        
    }
    
    public int displayMainMenu()
    {
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;

        System.out.println("1. New Customer");
        System.out.println("2. Quit");
        System.out.println("");
        System.out.println("Please enter your choice: ");
        
        menuChoice = s.nextInt();
        
        return menuChoice;
    }
}
