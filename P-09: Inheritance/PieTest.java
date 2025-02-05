import org.junit.Assert;
import org.junit.Test;

/**
 * Test that tests the methods from the Pie class to assure there are no
 * errors or faults in the class.
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 11/03/22
 */
public class PieTest {

   /**
    * Creates a test that gets the cost of the pie's crust.
    */
   @Test public void getCrustCostTest() {
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0, 
                         "flour", "sugar", "apples", "cinnamon", 
                         "butter", "baking soda", "salt");
      Assert.assertEquals(0, p1.getCrustCost(), 0.000001);
   }

   /**
    * Creates a test that sets a new cost for the pie's crust.
    */
   @Test public void setCrustCostTest() {
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0, 
                         "flour", "sugar", "apples", "cinnamon", 
                         "butter", "baking soda", "salt");
      p1.setCrustCost(5.0);
      Assert.assertEquals(5.0, p1.getCrustCost(), 0.000001);
   
   }

   /**
    * Creates a test that gets the total price of the pie. 
    */
   @Test public void priceTest() {
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0, 
                         "flour", "sugar", "apples", "cinnamon", 
                         "butter", "baking soda", "salt");
      Assert.assertEquals(12.00, p1.price(), 0.000001);
      
      Pie p2 = new Pie("Summer Special", "Key Lime", 1, 2.0, 
                        "flour", "sugar", "lime juice", "lemon juice", 
                        "graham crackers", "butter", "baking soda", "salt");
      Assert.assertEquals(14.00, p2.price(), 0.000001);
   
   }

}
