import org.junit.Assert;
import org.junit.Test;

/**
 * Test that tests the methods from the WeddingCake class to assure there are
 * no errors or faults in the class.
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 11/03/22
 */
public class WeddingCakeTest {

   /**
    * Creates a test that gets the number of tiers on the wedding cake.
    */
   @Test public void getTiersTest() {
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3, 
                         "flour", "sugar", "buttermilk", "coffee", 
                         "eggs", "butter", "baking soda", "baking powder",  
                         "salt");
      Assert.assertEquals(3, c3.getTiers());
   }
   
   /**
    * Creates a test that sets a new number of tiers on the wedding cake.
    */
   @Test public void setTiersTest() {
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3, 
                         "flour", "sugar", "buttermilk", "coffee", 
                         "eggs", "butter", "baking soda", "baking powder",  
                         "salt");
      c3.setTiers(4);
      Assert.assertEquals(4, c3.getTiers());
   }
   
   /**
    * Creates a test that gets the total price of the wedding cake.
    */
   @Test public void priceTest() {
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3, 
                         "flour", "sugar", "buttermilk", "coffee", 
                         "eggs", "butter", "baking soda", "baking powder",  
                         "salt");
      Assert.assertEquals(135.00, c3.price(), 0.000001);
   }
}
