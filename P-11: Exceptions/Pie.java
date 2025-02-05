/**
 * Program that creates a Pie object that is an extention of the BakedItem
 * class.
 * Project 9
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 11/03/22
 */
 
public class Pie extends BakedItem {
   
   //instance variables
   
   private double crustCost;
   
   /**
    * Constant that represents the base rate of the Cookie object.
    */
   public static final double BASE_RATE = 12.0;
   
   //constructor
   
   /**
    * Creates a constructor that creates a new Pie object using a name,
    * flavor, quantity, crust cost, and ingredients.
    * @param nameIn to represent the name of the pie.
    * @param flavorIn to represent the flavor of the pie.
    * @param quantityIn to represent the quantity of the pie.
    * @param crustCostIn to represent the cost of the pie's crust.
    * @param ingredientsIn to represent the array of ingredients in the
    * pie.
    */
   public Pie(String nameIn, String flavorIn, int quantityIn, 
      double crustCostIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      crustCost = crustCostIn;
   }
   
   //methods
   
   /**
    * Creates a method that gets the cost of the crust from the pie.
    * @return the cost of the crust from the Pie object. 
    */
   public double getCrustCost() {
      return crustCost;
   }
   
   /**
    * Creates a method that sets a new cost of the crust for the pie.
    * @param crustCostIn to represent the new cost of the crust from the 
    * Pie object. 
    */
   public void setCrustCost(double crustCostIn) {
      crustCost = crustCostIn;
   }
   
   /**
    * Creates a method that gets the total price of the pie.
    * @return the total price of the Pie object.
    */
   public double price() {
      return (BASE_RATE + crustCost) * quantity; 
   }
      
}