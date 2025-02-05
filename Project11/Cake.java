/**
 * Program that creates a Cake object that is an extention of the BakedItem
 * class.
 * Project 9
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 11/03/22
 */
 
public class Cake extends BakedItem {
   
   //instance variables
   protected int layers;
   
   /**
    * Constant that represents the base rate of the Cake object. 
    */
   public static final double BASE_RATE = 8;
   
   //constructor
   
   /**
    * Creates a constructor that creates a new Cake object using a name,
    * flavor, quantity, layers, and ingredients.
    * @param nameIn to represent the name of the cake.
    * @param flavorIn to represent the flavor of the cake.
    * @param quantityIn to represent the quantity of the cake.
    * @param layersIn to represent the layers of the cake.
    * @param ingredientsIn to represent the array of ingredients in the
    * cake.
    */
   public Cake(String nameIn, String flavorIn, int quantityIn, 
      int layersIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      layers = layersIn;
   }
   
   //methods
   
   /**
    * Creates a method that gets the number of layers on the cake.
    * @return the number of layers from the Cake object. 
    */
   public int getLayers() {
      return layers;
   }
   
   /**
    * Creates a method that sets a new number of layers on the cake.
    * @param layersIn to represent the new number of layers on the Cake object.
    */
   public void setLayers(int layersIn) {
      layers = layersIn;
   }
   
   /**
    * Creates a method that gets the total price of the cake.
    * @return the total price of the Cake object.
    */
   public double price() {
      return (BASE_RATE * layers) * quantity; 
   }
   
}