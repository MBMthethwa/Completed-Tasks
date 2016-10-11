/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Programming
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
      HashMap<String,Integer> restaurantMenu = new HashMap<>();
      
      restaurantMenu.put("burger", 50);
      restaurantMenu.put("chips", 30);
      restaurantMenu.put("fish", 35);
      restaurantMenu.put("chips and fish", 65);
      restaurantMenu.put("drink", 15);
      restaurantMenu.put("russian", 20);
      restaurantMenu.put("vienna", 5);
      restaurantMenu.put("wings", 35);
      restaurantMenu.put("strips", 40);
      restaurantMenu.put("pops", 11);
      
        String choice = JOptionPane.showInputDialog( " Menu :" + "\n"  + "Do you want to order or pay ?"+ "\n" + restaurantMenu.entrySet() );
        int total = 0;
        String order = ""; 
        String more = "";
        boolean ordered = false;
        
        do
        {
            if(choice.equalsIgnoreCase("order"))
            {
                order = JOptionPane.showInputDialog("Enter one food name you want to order \n" + restaurantMenu.entrySet());
                total = total + restaurantMenu.get(order);
                ordered = true;
                
                do
                {
                    more = JOptionPane.showInputDialog("do you want to order another food ? yes or pay "); 
                    if(more.equalsIgnoreCase("yes"))
                    {
                        order = JOptionPane.showInputDialog("Enter food name you want to order \n" + restaurantMenu.entrySet());
                        total = total + restaurantMenu.get(order);
                        more = JOptionPane.showInputDialog("do you want to order another food ? yes or pay ");
                    }
            
                }
                while(more.equals("yes"));
            
            
            
            }
            else if(choice.equals("pay"))
            {
                JOptionPane.showMessageDialog(null, "You must order first ");
                ordered = false;
                choice = JOptionPane.showInputDialog( " Menu :" + "\n"  + "Do you want to order or pay ?"+ "\n" + restaurantMenu.entrySet() );
            
            }
            
        }
        while(ordered != true && total < 1);
        
        boolean succefulPaid = false;
        if(more.equalsIgnoreCase("pay"))
        {
            do
            {
                if(total > 0)
                {   
                    int amt = Integer.parseInt(JOptionPane.showInputDialog("Enter amonth to pay \n"+ "You must pay R" + total ));
                    if(amt == total)
                    {
                        JOptionPane.showMessageDialog(null, "Thank you!, You succefully paid");
                        succefulPaid = true;
                    }
                    else if(amt > total)
                    {
                        JOptionPane.showMessageDialog(null, "Thank you!, You succefully paid. your change is " + (amt - total));
                        succefulPaid = true;

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Your money short with " + (total - amt));
                        succefulPaid = false;
                    }
                }
                
            }
             while(succefulPaid == false);
            
        } 
      
    }
    
}
