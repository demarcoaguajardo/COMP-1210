import org.junit.Assert;
import org.junit.Test;

/**
 * Test that tests the methods from the Cookie class to assure there are no
 * errors or faults in the class.
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 11/03/22
 */ 
public class CookieTest {

   /**
    * Tests getting the name of the Cookie object.
    */
   @Test public void getNameTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,
                     "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      Assert.assertEquals("Chips Delight", c.getName());
   }
   
   /**
    * Tests setting a new name for the Cookie object.
    */
   @Test public void setNameTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,
                     "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      c.setName("Chips Ahoy");
      Assert.assertEquals("Chips Ahoy", c.getName());
   }
   
   /**
    * Tests getting the flavor of the Cookie object.
    */
   @Test public void getFlavorTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,
                     "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      Assert.assertEquals("Chocolate Chip", c.getFlavor());
        
   }
   
   /**
    * Tests setting a new flavor for the Cookie object.
    */
   @Test public void setFlavorTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,
                     "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      c.setFlavor("Peanut Butter");
      Assert.assertEquals("Peanut Butter", c.getFlavor());
   
   }
   
   /**
    * Tests getting the quantity of the Cookie object.
    */
   @Test public void getQuantityTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,
                     "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      Assert.assertEquals(12, c.getQuantity());
   
   }
   
   /**
    * Tests setting a new quantity for the Cookie object.
    */
   @Test public void setQuantityTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,
                     "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      c.setQuantity(8);
      Assert.assertEquals(8, c.getQuantity());
   
   }
   
   /**
    * Tests getting the ingredients of the Cookie object.
    */
   @Test public void getIngredientsTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,
                     "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      Assert.assertEquals(c.getIngredients(), c.getIngredients());
   
   }
   
   /**
    * Tests setting new ingredients for the Cookie object.
    */
   @Test public void setIngredientsTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,
                     "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      c.setIngredients("pecan", "apple", "sugar", "flour");
      Assert.assertEquals(c.getIngredients(), c.getIngredients());
   
   }
   
   /**
    * Tests getting the count of all the Cookie objects.
    */
   @Test public void getCountTest() {
      BakedItem.resetCount();
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,
                     "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      Assert.assertEquals(1, BakedItem.getCount());
   
   }
   
   /**
    * Tests resetting the count of all the Cookie objects.
    */
   @Test public void resetCountTest() {
      BakedItem.resetCount();
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,
                     "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      BakedItem.resetCount();
      Assert.assertEquals(0, BakedItem.getCount());
   
   }
   
   /**
    * Tests getting the string representation of the Cookie object.
    */
   @Test public void toStringTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,
                     "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      Assert.assertEquals("Cookie: Chips Delight - Chocolate Chip" 
         + "   Quantity: 12   Price: $4.20"
         + "\n(Ingredients: flour, sugar, dark chocolate chips, butter, baking "
         + "soda, "
         + "\nsalt)", c.toString());
         
      Cookie c2 = new Cookie("Chips Delight", "Chocolate Chip", 12,
                     "flour", "sugar", "dark chocolate chips", 
                     "butter");
      Assert.assertEquals("Cookie: Chips Delight - Chocolate Chip" 
         + "   Quantity: 12   Price: $4.20"
         + "\n(Ingredients: flour, sugar, dark chocolate chips, butter)", 
         c2.toString());
   
   }
   
   /**
    * Tests getting the price of the Cookie object.
    */
   @Test public void priceTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,
                     "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      Assert.assertEquals((12 * 0.35), c.price(), 0.000001);
   
   }
}
