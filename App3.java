/*
Write a Java program to accept a given number of item names 
and prices and then output them in the reverse order in 
which they were input. In addition, output the average 
price if one of the items is named Peas (not case 
sensitive) otherwise output: “no average output”. (The 
first user input will be the number of items to process.) 
*/

import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList; // import the ArrayList class

public class App3
 {
    public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);
    Scanner myPrices = new Scanner(System.in);
    Scanner Entry = new Scanner(System.in);

    ArrayList<String> myObjs = new ArrayList<String>();
    ArrayList<Double> myPricess = new ArrayList<Double>();

    String items = null;
    double price;
    //String[] AmtList = {"First", "Second", "Third"};
    String myStr1 = "Peas";
    int Accepted = 0;
    int enterInput = 0;
    
    System.out.println("How many Items do you have?");
    enterInput = Entry.nextInt(); 
    System.out.println("Input Test: " + enterInput); //Test Site



    for (int i = 0; i < 1; i++){
        //Enter Item and press Enter
        for(int k = 0; k < enterInput; k++){
            System.out.println("Enter Item...");
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

        System.out.print("The Items are: ");

        for(int r = enterInput; r > 0; r--){
            System.out.print(myObjs.get(r-1) + ":  ");
        }
        System.out.println("");

        //System.out.println("The Items are: " + myObjs);
        double totalprice = 0.00;
        for (double i : myPricess){
            totalprice += i;
             
        }
        

        System.out.println("The Total Price is: $" + totalprice);

        double roundedAverage = Math.round((totalprice/3) * 100.0) / 100.0;
 

        for(int i = 0; i < 3; i++){
            if(myObjs.get(i).equalsIgnoreCase(myStr1)){
                Accepted = 1;
            }
        }
        if(Accepted == 1){
            System.out.println("The Average Price is: $" + roundedAverage);
        }
        else{
            System.out.println("No Average Price");
        }    
    }
}