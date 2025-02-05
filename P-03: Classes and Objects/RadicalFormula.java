import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Program to solve for the result of
   a specified expression using methods from
   the Math class, giving the user both its 
   unformatted and formatted result, and its
   properties. 
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 09/04/22
 */
 
public class RadicalFormula {
/**
 * Creating the expression, inputting an x, and
   displaying the unformatted result, its properties, 
   and the formatted result.
 * @param args Command line arguments - not used.
 */
 
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x, discriminant1, discriminant2, expression, result;
   
      //Entering value for x:
      System.out.print("Enter a value for x: ");
      x = Double.parseDouble(userInput.nextLine());
      
      //Making the expression and finding result:
      discriminant1 = Math.pow((3 * Math.pow(x, 8) - 2 * Math.pow(x, 3)), 2);
      discriminant2 = Math.abs((3 * Math.pow(x, 5) - 2 * Math.pow(x, 3)));
      expression = Math.sqrt(discriminant1 + discriminant2);
      result = expression;
      
      //Printing result:
      System.out.println("Result: " + result);
      
      //Creating result as a String:
      Double dResult = result;
      String sResult = Double.toString(dResult);
      
      //Finding length of digits away from decimal:
      int periodLocation = sResult.indexOf("."); //location of "." in result
      String leftToDecimal = sResult.substring(0, periodLocation);
      int digitsToLeft = leftToDecimal.length();
      String rightToDecimal = sResult.substring(periodLocation + 1);
      int digitsToRight = rightToDecimal.length();
      
      //Displaying distance from decimal:
      System.out.println("# digits to left of decimal point: "
         + digitsToLeft);
      System.out.println("# digits to right of decimal point: "
         + digitsToRight);
         
      //Formatting final result:
      DecimalFormat dmfResult = new DecimalFormat("#,##0.0##");
      System.out.println("Formatted Result: " + dmfResult.format(result));  
   }
}
