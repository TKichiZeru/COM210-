//Bugged 
package com210;

import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList; // import the ArrayList class

public class COM210 {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
        Scanner myPrices = new Scanner(System.in);

        ArrayList<String> myObjs = new ArrayList<String>();
        ArrayList<Double> myPricess = new ArrayList<Double>();
       
        String items = null;
        double price;
        double totalprice = 0.00;
        String mystr1 = "Peas";
        String[] AmtList = {"First", "Second", "Third"};


        for (int i = 0; i < 1; i++){
            //Enter Item and press Enter
            for(int k = 0; k < 3; k++){
                System.out.println("Enter " + AmtList[k] + " Item.");
                items = myObj.nextLine();
                myObjs.add(items);
                
                
                
                //Find TotalPrice
            for (int j = 0; j < 1; j++){
                System.out.println("Enter Price:");
                price = myPrices.nextDouble();
                myPricess.add(price);
                
                
                
                
            }
            }     
        }    
        System.out.println("The Items are: " + myObjs);
        
        for (double i : myPricess){
            totalprice += i;
            
        }
        
        
        
        
        for(int m = 0; m < 3; m++){
            
            if(myObjs.get(m).equalsIgnoreCase(mystr1)){
                System.out.println("The Total Price is: $" + totalprice);      
            } 
            else if (myObjs.get(m) != mystr1) {
                System.out.println("No Average Price");
            }
            
            //System.out.println("The Items Prices is: $" + myPrices);
                      
        }     
    }
}
