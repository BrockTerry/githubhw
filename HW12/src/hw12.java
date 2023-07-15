/**
 * Objective:Write a program that prompts the user to read two integers and displays their sum.
 * Your program should prompt the user to read the number again if the input is incorrect.
 * Algorithm: I intend to use a do-while method to contain the loop of correct or incorrect information
 * Created by:Brock Terry
 * Date:6/18/23
 */


import java.util.*;

public class hw12 {
    public static void main(String[] args){

      do{
          //create a scanner to check input information
          Scanner input = new Scanner (System.in);
          try{
              //prompt the user then use the scanner I created to collect user information(twice)
              System.out.println("Enter the first number: ");
              int firstnum = input.nextInt();
              System.out.println("Enter the second number: ");
              int secondnum = input.nextInt();
              int sum = firstnum + secondnum;
              //insert math algorithm and output information for user
              System.out.println("The sum equals: " + sum);
              input.close();
              break;
          }
          //the catch will determine the compatibility of the incoming information
          catch (InputMismatchException e){
              System.out.println("Exception:Not an integer; ");
      }
        }
while(true);
    }
}