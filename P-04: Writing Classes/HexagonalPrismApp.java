import java.util.Scanner; 
/**
 * Program that successfully uses the HexagonalPrism
class on multiple occasions.
 * Project 4
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 09/11/22
 */


public class HexagonalPrismApp {

   /**
    * Program that takes the user's inputs for a hexagonal
      prism and displays all of its objects.
    * @param args Command line arguments - not used.
    */
    
   public static void main(String[] args) {
      String label;
      double edge = 0;
      double height = 0;
      
      Scanner input = new Scanner(System.in);
    
      System.out.println("Enter label, edge, and height "
         + "for a hexagonal prism."); 
         
      System.out.print("\tlabel: ");
      label = input.nextLine();
      
      HexagonalPrism hexPrism = new HexagonalPrism(label, edge, height);
      
      System.out.print("\tedge: ");
      edge = Double.parseDouble(input.nextLine());
   
      if (!hexPrism.setEdge(edge)) {
         System.out.println("Error: edge must be greater than zero.");
         return;
      }
      
      System.out.print("\theight: ");
      height = Double.parseDouble(input.nextLine());
      
      if (!hexPrism.setHeight(height)) {
         System.out.println("Error: height must be greater than zero.");
         return;
      }
      
      System.out.println("\n" + hexPrism);
   }
}