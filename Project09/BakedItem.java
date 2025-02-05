import java.text.DecimalFormat;


/**
 * Program that stores BakedItem data and provides methods to access the data.
 * Project 10
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 11/09/22
 */
 
public abstract class BakedItem implements Comparable<BakedItem> {
   
   //instance variables
   
   protected String name;
   protected String flavor;
   protected int quantity;
   protected String[] ingredients;
   protected static int count = 0;
   
   //constructor

   /**
    * Constructor that takes a name, flavor, quantity, and an array of
    * ingredients to create a BakedItem object.
    * @param nameIn to represent the name of the baked item.
    * @param flavorIn to represent the flavor of the baked item.
    * @param quantityIn to represent the quantity of the baked item.
    * @param ingredientsIn to represent the array of ingredients in the
    * baked item.
    */
   public BakedItem(String nameIn, String flavorIn, int quantityIn, 
      String...ingredientsIn) {
      
      name = nameIn;
      flavor = flavorIn;
      quantity = quantityIn;
      ingredients = ingredientsIn;
      
      count++;
      
   }
   
   //methods
   
   /**
    * Creates a method that gets the name of the baked item.
    * @return the name of the BakedItem object.
    */
   public String getName() {
      return name;
   }
   
   /**
    * Creates a method that sets a new name for the baked item.
    * @param nameIn to represent the new name to set for the BakedItem object.
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
    * Creates a method that gets the flavor of the baked item.
    * @return the flavor of the BakedItem object.
    */
   public String getFlavor() {
      return flavor;
   }
   
   /**
    * Creates a method that sets a new flavor for the baked item.
    * @param flavorIn to represent the new flavor to set for the BakedItem
    * object.
    */
   public void setFlavor(String flavorIn) {
      flavor = flavorIn;
   }
   
   /**
    * Creates a method that gets the quantity of baked item.
    * @return the quantity of the BakedItem object.
    */
   public int getQuantity() {
      return quantity;
   }
   
   /**
    * Creates a method that sets a new quantity for the baked item.
    * @param quantityIn to represent the new quantity to set for the BakedItem
    * object.
    */
   public void setQuantity(int quantityIn) {
      quantity = quantityIn;
   }
   
   /**
    * Creates a method that gets the array of ingredients for the baked item.
    * @return ingredients of the BakedItem object.
    */
   public String[] getIngredients() {
      return ingredients;
   }
   
   /**
    * Creates a method that sets new ingredients for the baked item.
    * @param ingredientsIn to represent the new ingredients to set for the
    * BakedItem object.
    */
   public void setIngredients(String...ingredientsIn) {
      ingredients = ingredientsIn;
   }
   
   /**
    * Creates a method that gets the count of baked items.
    * @return count of BakedItem objects.
    */
   public static int getCount() {
      return count;
   }
   
   /**
    * Creates a method that resets the count of baked items.
    */
   public static void resetCount() {
      count = 0;
   }
   
   /** 
    * Creates a method that changes the representation of a BakedItem object
    * to a string.
    * @return output to show the object as a string.
    */
   public final String toString() {
   
      String output = "";   
   
      DecimalFormat dfDouble = new DecimalFormat("$#,##0.00");  
      
      output += this.getClass().toString().substring(6) + ": " + name + " - "
         + flavor + "   Quantity: " + quantity + "   Price: "
            + dfDouble.format(price());
      output += "\n(Ingredients: ";
      for (int i = 0; i < ingredients.length; i++) {
         if (i != 0 && i % 5 == 0) {
            output += "\n";
         }
         if (i < ingredients.length - 1) {
            output += ingredients[i] + ", ";
         }
         if (i == ingredients.length - 1) {
            output += ingredients[i] + ")";
         }
         
      }
      return output;
   }
   
   /**
    * Creates a method that compares two baked items by their strings.
    * @param item to represent the other BakedItem object being compared.
    * @return value representing object's placement in order.
    */
   public int compareTo(BakedItem item) {
      return this.toString().
         toUpperCase().compareTo(item.toString().toUpperCase());
   }
   
   /**
    * Creates a method that gets the price of the baked item.
    * @return price of the baked item.
    */
   public abstract double price();
         
}