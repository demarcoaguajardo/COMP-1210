import org.junit.Assert;
import org.junit.Test;


/**
 * Test that tests the methods from the Cake class to assure there are no
 * errors or faults in the class.
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 11/03/22
 */
public class CakeTest {

   /**
    * Creates a test that gets the number of layers on the cake.
    */
   @Test public void getLayersTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1, 
                        "flour", "sugar", "cocoa powder", "vanilla", "eggs", 
                        "butter", "baking soda", "baking powder", "salt");
      Assert.assertEquals(1, c1.getLayers());
   }
   
   /**
    * Creates a test that sets a new number of layers on the cake.
    */
   @Test public void setLayersTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1, 
                        "flour", "sugar", "cocoa powder", "vanilla", "eggs", 
                        "butter", "baking soda", "baking powder", "salt");
      c1.setLayers(3);
      Assert.assertEquals(3, c1.getLayers());
   }
   
   /**
    * Creates a test that gets the total price of the cake.
    */
   @Test public void priceTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1, 
                        "flour", "sugar", "cocoa powder", "vanilla", "eggs", 
                        "butter", "baking soda", "baking powder", "salt");
      Assert.assertEquals(8.00, c1.price(), 0.000001);
      
      Cake c2 = new Cake("2-Layer", "Red Velvet", 1, 2, 
                        "flour", "sugar", "cocoa powder", "food coloring",  
                        "eggs", "butter", "baking soda", "baking powder",  
                        "salt"); 
      Assert.assertEquals(16.00, c2.price(), 0.000001);
   }
   
   

}