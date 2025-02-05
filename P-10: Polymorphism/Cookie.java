/**
 * Program that creates a Cookie object that is an extention of the BakedItem
 * class.
 * Project 9
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 11/03/22
 */
 
public class Cookie extends BakedItem {
   
   //instance variables
   
   /**
    * Constant that represents the base rate of the Cookie object.
    */
   public static final double BASE_RATE = 0.35;
   
   //constructor
   
   /**
    * Creates a constructor that creates a new Cookie object using name,
    * flavor, quantity, and ingredients.
    * @param nameIn to represent the name of the cookie.
    * @param flavorIn to represent the flavor of the cookie.
    * @param quantityIn to represent the quantity of the cookie.
    * @param ingredientsIn to represent the array of ingredients in the
    * cookie.
    */
   public Cookie(String nameIn, String flavorIn, int quantityIn, 
      String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
   }
   
   //methods
   
   /**
    * Creates a method that gets the price of the cookie.
    * @return the total price of the Cookie object including base rate.
    */
   public double price() {
      return BASE_RATE * quantity;
   }
}