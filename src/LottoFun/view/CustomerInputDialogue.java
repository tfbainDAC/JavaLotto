/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LottoFun.view;
import LottoFun.model.Customer;
import java.util.Scanner;
/**
 *
 * @author t.bain
 */
public class CustomerInputDialogue {
    public CustomerInputDialogue(){
        
    }
    
    public Customer inputCustomerDetails(){
        Customer cCust;
       
        String name, email="";
        Scanner scanL = new Scanner(System.in);
        
        System.out.println("Please enter customer name or quit to exit: ");
        name = scanL.nextLine();
        if(!name.equals("quit")){
            System.out.println("Please enter customer email: ");
            email = scanL.nextLine();
        }    
        cCust = new Customer(name, email);
        
        return cCust;
    }
}
