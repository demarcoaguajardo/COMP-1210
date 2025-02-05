/**
 * Program that creates a WeddingCake object that is an extention of the Cake
 * class.
 * Project 9
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 11/03/22
 */
 
public class WeddingCake extends Cake {
   
   //instance variables
   private int tiers;
   
   /**
    * Constant that represents the base rate of the WeddingCake object. 
    */
   public static final double BASE_RATE = 15.0;
   
   //constructor
   
   /**
    * Creates a constructor that creates a new WeddingCake object using a name,
    * flavor, quantity, layers, tiers, and ingredients.
    * @param nameIn to represent the name of the wedding cake.
    * @param flavorIn to represent the flavor of the wedding cake.
    * @param quantityIn to represent the quantity of the wedding cake.
    * @param layersIn to represent the layers of the wedding cake.
    * @param tiersIn to represent the tiers of the wedding cake.
    * @param ingredientsIn to represent the array of ingredients in the
    * wedding cake.
    */
   public WeddingCake(String nameIn, String flavorIn, int quantityIn, 
      int layersIn, int tiersIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, layersIn, ingredientsIn);
      tiers = tiersIn;
   }
   
   //methods
   
   /**
    * Creates a method that gets the number of tiers on the wedding cake.
    * @return the number of tiers from the WeddingCake object. 
    */
   public int getTiers() {
      return tiers;
   }
   
   /**
    * Creates a method that sets a new number of tiers on the wedding cake.
    * @param tiersIn to represent the new number of tiers on the WeddingCake
    * object.
    */
   public void setTiers(int tiersIn) {
      tiers = tiersIn;
   }
   
   /**
    * Creates a method that gets the total price of the wedding cake.
    * @return the total price of the WeddingCake object.
    */
   public double price() {
      return (BASE_RATE * layers * tiers) * quantity; 
   }
   
}