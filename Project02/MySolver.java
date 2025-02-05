import java.util.Scanner;
/**
 * Simple program to find the result of a 
   given equation using double variables 
   that the user inputs into the program.
 * Project 2
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 8/29/22
 */
 
public class MySolver {
/**
  * Prints and requests user to input x, y, and
    z to print the result of the given equation,
    including a possible undefined result.
  * @param args Command line arguments - not used. 
  */
   
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x, y, z;
    
      //Printing the equation
      System.out.println("result = (8.5x + 6.1) (10y + 7.9) / z");
      
      //Prompt user for x:
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      
      //Prompt user for y:
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      
      //Prompt user for z:
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      
      //Printing the result
      double result = (8.5 * x + 6.1) * (10 * y + 7.9) / z;
      
      //If-else to determine undefined result if z = 0
      if (z == 0.0) {
         System.out.println("result is undefined");
      }
      else {
         System.out.println("result = " + result);
      } 
   }
}