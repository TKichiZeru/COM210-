/*
Write a Java program to accept three item names, and 
prices, and output them. Also, output the average price if 
one of the items is named Peas (not case sensitive) 
otherwise output: “no average output”. 
*/

import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList; // import the ArrayList class

public class App2
 {
    public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);
    Scanner myPrices = new Scanner(System.in);

    ArrayList<String> myObjs = new ArrayList<String>();
    ArrayList<Double> myPricess = new ArrayList<Double>();

    String items = null;
    double price;
    String[] AmtList = {"First", "Second", "Third"};
    String myStr1 = "Peas";
    int Accepted = 0;
    
    for (int i = 0; i < 1; i++){
        //Enter Item and press Enter
        for(int k = 0; k < 3; k++){
            System.out.println("Enter " + AmtList[k]+ " Item.");
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
        double totalprice = 0.00;
        for (double i : myPricess){
            totalprice += i;
             
        }

        System.out.println("The Total Price is: $" + totalprice);
 

        for(int i = 0; i < 3; i++){
            if(myObjs.get(i).equalsIgnoreCase(myStr1)){
                Accepted = 1;
            }
        }
        if(Accepted == 1){
            System.out.println("The Average Price is: $" + totalprice/3);
        }
        else{
            System.out.println("No Average Price");
        }    
    }
}