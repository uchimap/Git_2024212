/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024212;

import java.util.Scanner;

/**
 *
 * @author paula
 */
public class Git_2024212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Paula 2024212");    
        
        
    
        // TODO code application logic here
    }
    

/**
 * InputUtilities to ask user for input
 * BSc Sept 2024
 * 
 * @author kheal
 */
public class InputUtils {

    /**
     * Prompts user to enter some text. 
     * if not text will keep repeating prompt
     * @param prompt The question or prompt to the user
     * @return text entered by user as a String
     * 
     */
    public String askUserForText(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        
        String userInput;
        
        do {
            System.out.println(prompt);
            System.out.println("You must enter text only!");
            
            userInput = myKB.nextLine();
            
        }while (!userInput.matches("[a-zA-Z!.?', ]+"));
        
        //the input must be text
        return(userInput);
        
    }
    
    /**
     * Ask user to enter integer value
     * if not an integer, ask again until input is valid
     * @param prompt the question or prompt to the user
     * @return an int value entered by user
     */
    public int askUserForInt(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        
        String userInput;
        
        do {
            System.out.println(prompt);
            System.out.println("You must enter numbers only!");
            
            userInput = myKB.nextLine();
            
        }while (!userInput.matches("[0-9]+"));
        //must have a numeric input stored as a string
        
        return( Integer.parseInt(userInput));
        
    }
    
    /**
     * Ask user to enter a integer with a given maximum
     * if input is non-numeric OR if it is too big then repeat prompt
     * @param prompt the question or prompt to the user
     * @param maxValue the maximum int value allowed
     * @return a valid int entered by user
     */
    public int askUserForInt(String prompt, int maxValue){
        
        Scanner myKB = new Scanner(System.in);
        
        int userInput = maxValue+1; //default to an invalid value
        
        do {
            System.out.println(prompt);
            System.out.println("You must enter numbers less than " + maxValue + " only!");
            
             try{
                    //this might go wrong if user enters text
                    userInput = myKB.nextInt();
            }
             catch (Exception e){
                System.out.println("That was not a number!");
                myKB.nextLine(); // this prevents infinite loop
            }
            
            //keep going while input too big
        }while ( userInput > maxValue);
        
        //userInput must be a valid int
        return userInput;
    }
  
}

  
    
    
    
    
}
