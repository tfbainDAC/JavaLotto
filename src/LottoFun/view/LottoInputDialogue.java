/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LottoFun.view;
import LottoFun.model.*;
import java.util.Scanner;
/**
 *
 * @author t.bain
 */
public class LottoInputDialogue {
    public LottoInputDialogue(){
        
    }
    
    public Ticket lottoInputNumbers(Ticket lottoT){
        int no;
        boolean good;
        Scanner s = new Scanner(System.in);

        //  if taking input here use set methods to change data
        for(int i=0;i<6;i++){
           good = false; 
           while(!good){ 
            System.out.print("enter number " + (i+1));
            no = s.nextInt();
            good =lottoT.setBall(i,no);
           }
        }
        return lottoT;
    }
    
    public int displayLottoChoices(Customer cust)
    {
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;
        
        System.out.println("Lottery Ticket purchase");
        System.out.println("Customer: " + cust.toString());
        System.out.println("1. Generate Numbers");
        System.out.println("2. Enter Numbers");
        System.out.println("");
        System.out.println("Please enter your choice: ");
        
        menuChoice = s.nextInt();
        
        return menuChoice;
    }
    
    public boolean confirmPurchase(){
        Scanner scan = new Scanner(System.in);
        boolean confirm=false;
        char purchase;
        System.out.println("Do you want to purchase this ticket (y/n) >>");
        purchase = scan.next().charAt(0);
        if(purchase =='y' || purchase == 'Y')
            confirm = true;
        return confirm;
    }
    
    public String inputRetailer(){
          Scanner sL = new Scanner(System.in);
          String retailer;
          System.out.println("Please add retailer >> ");
          retailer = sL.nextLine();
          return retailer;
    }
}
