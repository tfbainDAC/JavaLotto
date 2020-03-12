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
        
        System.out.println("Main Menu");
        System.out.println("");
        System.out.println("1. Menu option 1");
        System.out.println("2. Menu option 2");
        System.out.println("3. Menu option 3");
        System.out.println("4. Menu option 4");
        System.out.println("5. Quit");
        System.out.println("");
        System.out.println("Please enter your choice: ");
        
        menuChoice = s.nextInt();
        
        return menuChoice;
    }
}
