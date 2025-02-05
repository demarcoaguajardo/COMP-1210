import java.util.Scanner;
/**
 * Simple program to take a user-inputted distance in inches and 
   display the combined distance in miles, yards, feet, and inches
   for both short and long distances.
 * Project 2
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 8/29/22
 */
 
public class LaserMeasure {
/**
   * Requesting the user to input a distance in inches, then printing
     the if-else statement to cover both positive and negative inputs.
     Lastly, if a positive input, the program displays the combined 
     distance in all measurements. 
   * @param args Command line arguments - not used. 
   */
   
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int miles, yards, feet, inches;
      
      //Request user to enter measurement:
      System.out.print("Enter the raw distance measurement in inches: ");
      int rawInches = userInput.nextInt();
      
      //Printing if-else for negatives:
      if (rawInches < 0) {
         System.out.println("Measurement must be non-negative!");
      }
      //Printing if-else for positives:
      else {
         int rawInches2 = rawInches;
         miles = rawInches2 / 63360;
         rawInches2 = rawInches2 % 63360;
         yards = rawInches2 / 36;
         rawInches2 = rawInches2 % 36;
         feet = rawInches2 / 12;
         rawInches2 = rawInches2 % 12;
         inches = rawInches2 / 1;
         
         
         System.out.println("\nMeasurement by combined miles, "
            + "yards, feet, inches: ");
         System.out.println("\tmiles: " + miles);
         System.out.println("\tyards: " + yards);
         System.out.println("\tfeet: " + feet);
         System.out.println("\tinches: " + inches);
         System.out.println("\n" + rawInches + " in = " + miles + " mi, "
            + yards + " yd, " + feet + " ft, " + inches + " in");
      }  
   }
}