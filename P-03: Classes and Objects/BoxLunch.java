import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
 * Program to read data for a coded
   box lunch order to then interpret and
   print the formatted order information.
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 09/04/22
 */

public class BoxLunch {
/**
 * Imports a scanner to create an order code which is
   used to get the information of the user's order.
 * @param args Command line arguments - not used.
 */
    
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      DecimalFormat dollarFmt = new DecimalFormat("$#,##0.00");
      DecimalFormat prizeFmt = new DecimalFormat("0000");
      Random rand = new Random();
      
      String rawOrderCode, orderCode, name, rawTheme, theme;
      int numChildMeals, numAdultMeals, luckyNumber;
      double childMealCost, adultMealCost;
      
      //Inputting Order Code:
      System.out.print("Enter order code: ");
      rawOrderCode = userInput.nextLine();
      orderCode = rawOrderCode.trim();
      if (orderCode.length() < 13) {
         System.out.println("\n*** Invalid Order Code ***");
         System.out.println("Order code must have at least 13 characters.");
      }
      else if (orderCode.length() == 13) {
         System.out.println("\n*** Invalid Order Code ***");
         System.out.println("Order code must have a name following the "
            + "last digit.");
      }
      else { //Creating Variables from Order Code:
      
         //NAME
         name = orderCode.substring(13);
         System.out.println("\nName: " + name);
         
         //ADULT MEALS
         numAdultMeals = Integer.parseInt((orderCode.substring(1, 3)));
         adultMealCost = Double.parseDouble((orderCode.substring(3, 7)));
         System.out.println("Adult meals: " + numAdultMeals
            + " at " + dollarFmt.format(adultMealCost / 100));
            
         //CHILD MEALS
         numChildMeals = Integer.parseInt((orderCode.substring(7, 9)));
         childMealCost = Double.parseDouble((orderCode.substring(9, 13)));
         System.out.println("Child meals: " + numChildMeals
            + " at " + dollarFmt.format(childMealCost / 100));
            
         //TOTAL
         double adultMealTotal = numAdultMeals * adultMealCost;
         double childMealTotal = numChildMeals * childMealCost;
         System.out.println("Total: " 
            + dollarFmt.format((adultMealTotal + childMealTotal) / 100));
         
         //THEME
         rawTheme = orderCode.substring(0, 1);
         if (rawTheme.equals("0")) {
            theme = "Birthday";
            System.out.println("Theme: " + theme);
         }
         else if (rawTheme.equals("1")) {
            theme = "Graduation";
            System.out.println("Theme: " + theme);
         }
         else {
            theme = "Holiday";
            System.out.println("Theme: " + theme);
         }
         
        //LUCKY NUMBER
         luckyNumber = rand.nextInt(10000) + 1;
         System.out.println("Lucky Number: " + prizeFmt.format(luckyNumber)); 
      }
      
   }

}