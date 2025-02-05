import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/**
 * Test that tests the methods from the RingTorus class to assure there are no
 * errors or faults in the class.
 */ 
public class RingTorusTest {

// 
//    /** Fixture initialization (common initialization
//     *  for all tests). **/
   // @Before public void setUp() {
   // }
// 
// 
//    /** A test that always fails. **/
   // @Test public void defaultTest() {
      // Assert.assertEquals("Default test added by jGRASP. Delete "
         //    + "this test once you have added your own.", 0, 1);
   // }
   
   
   /**
    * Tests setting a new label to a RingTorus object.
    */
   @Test public void setLabelTest() {
      RingTorus obj1 = new RingTorus("Old", 2.0, 1.0);
      obj1.setLabel("New");
      Assert.assertTrue(true);
      
      RingTorus obj2 = new RingTorus("Old2", 2.0, 1.0);
      obj1.setLabel(null);
      Assert.assertFalse(false);    
   }
   
   /**
    * Tests getting the label of a RingTorus object.
    */
   @Test public void getLabelTest() {
      RingTorus obj1 = new RingTorus("Old", 2.0, 1.0);
      obj1.getLabel();
      Assert.assertEquals("Old", obj1.getLabel());
   }
   
   /**
    * Tests setting a new large radius to a RingTorus object.
    */
   @Test public void setLargeRadiusTest() {
      RingTorus obj1 = new RingTorus("Old", 2.0, 1.0);
      obj1.setLargeRadius(3.0);
      obj1.getLargeRadius();
      Assert.assertTrue(true);
      
      RingTorus obj2 = new RingTorus("Old 2", 2.0, 1.0);
      obj2.setLargeRadius(0.5);
      obj2.getLargeRadius();
      Assert.assertFalse(false);
      
      RingTorus obj3 = new RingTorus("Old 3", 2.0, 1.0);
      obj3.setLargeRadius(-1.0); 
      obj3.getLargeRadius();
      Assert.assertFalse(false);
   }
   
   /**
    * Tests getting the large radius of a RingTorus object.
    */
   @Test public void getLargeRadiusTest() {
      RingTorus obj1 = new RingTorus("Old", 2.0, 1.0);
      obj1.getLargeRadius();
      Assert.assertEquals(2.0, obj1.getLargeRadius(), 0.000001);
   }
   
   /**
    * Tests setting a new small radius for a RingTorus object.
    */
   @Test public void setSmallRadiusTest() {
      RingTorus obj1 = new RingTorus("Old", 2.0, 1.0);
      obj1.setSmallRadius(0.5);
      Assert.assertTrue(true);
      
      RingTorus obj2 = new RingTorus("Old 2", 2.0, 1.0);
      obj2.setSmallRadius(3.0);
      Assert.assertFalse(false);
      
      RingTorus obj3 = new RingTorus("Old 3", 2.0, 1.0);
      obj3.setSmallRadius(-1.0); 
      Assert.assertFalse(false);
   }
   
   /**
    * Tests getting the small radius of a RingTorus object.
    */
   @Test public void getSmallRadiusTest() {
      RingTorus obj1 = new RingTorus("Old", 2.0, 1.0);
      obj1.getSmallRadius();
      Assert.assertEquals(1.0, obj1.getSmallRadius(), 0.000001);
   }  
   
   /**
    * Tests getting the diameter of a RingTorus object.
    */
   @Test public void diameterTest() {
      RingTorus obj1 = new RingTorus("Old", 9.5, 1.25);
      obj1.diameter();
      Assert.assertEquals(21.5, obj1.diameter(), 0.000001);
   }
   
   /**
    * Tests getting the surface area of a RingTorus object.
    */
   @Test public void surfaceAreaTest() {
      RingTorus obj1 = new RingTorus("Old", 9.5, 1.25);
      Assert.assertEquals(468.806209, obj1.surfaceArea(), 0.000001);
   }
   
   /**
    * Tests getting the volume of a RingTorus object.
    */
   @Test public void volumeTest() {
      RingTorus obj1 = new RingTorus("Old", 9.5, 1.25);
      Assert.assertEquals(293.003880, obj1.volume(), 0.000001);
   }
   
   /**
    * Tests turning a RingTorus object into a string.
    */
   @Test public void toStringTest() {
      RingTorus obj1 = new RingTorus("Old", 9.5, 1.25);
      obj1.toString();
      Assert.assertEquals("RingTorus " + "\"Old\"" + "\n\t"
         + "large radius = 9.5 units\n\t"
         + "small radius = 1.25 units\n\t"
         + "diameter = 21.5 units\n\t"
         + "surface area = 468.806 square units\n\t"
         + "volume = 293.004 cubic units\n\t", obj1.toString());
   }
   
   /**
    * Tests to see if a new object is equal to a RingTorus object.
    */
   @Test public void equalsTest() {
      RingTorus obj1 = new RingTorus("Old", 2.0, 1.0);
      RingTorus obj2 = new RingTorus("Old", 2.0, 1.0);
      obj1.equals(obj2);
      Assert.assertTrue(true);
      
      RingTorus obj3 = new RingTorus("Old", 2.0, 1.0);
      RingTorus obj4 = new RingTorus("Old", 3.0, 1.0);
      obj3.equals(obj4);
      Assert.assertFalse(false);
      
      RingTorus obj5 = new RingTorus("Old", 2.0, 1.0);
      RingTorus obj6 = new RingTorus("Old", 2.0, 0.5);
      obj5.equals(obj6);
      Assert.assertFalse(false);
      
      RingTorus obj7 = new RingTorus("Old", 2.0, 1.0);
      RingTorus obj8 = new RingTorus("Old 2", 2.0, 1.0);
      obj7.equals(obj8);
      Assert.assertFalse(false);
      
      RingTorus obj9 = new RingTorus("Old", 2.0, 1.0);
      String obj10 = "not a torus";
      obj9.equals(obj10);
      Assert.assertFalse(false);
   }
   
   /**
    * Tests hash code for equals method.
    */
   @Test public void hashCodeTest() {
      RingTorus obj1 = new RingTorus("Old", 2.0, 1.0);
      obj1.hashCode();
      Assert.assertEquals(0, obj1.hashCode()); 
   }
   
   /**
    * Tests getting the correct count of RingTorus objects.
    */
   @Test public void getCountTest() {
      RingTorus.resetCount();
      RingTorus obj1 = new RingTorus("Old", 2.0, 1.0);
      RingTorus.getCount();
      Assert.assertEquals(1, RingTorus.getCount());
   }
   
   /**
    * Tests resetting the count of RingTorus objects to 0.
    */
   @Test public void resetCountTest() {
      RingTorus.resetCount();
      Assert.assertEquals(0, RingTorus.getCount());
   }
   
   /**
    * Tests comparing two RingTorus objects to see if their volumes are equal
    * or different, such as less than or greater than the other.
    */
   @Test public void compareToTest() {
      RingTorus obj1 = new RingTorus("Old", 2.0, 1.0);
      obj1.volume();
      
      RingTorus obj2 = new RingTorus("Old 2", 2.0, 1.0);
      obj2.volume();
      
      Assert.assertTrue(obj1.compareTo(obj2) == 0);
      
      Ring Torus obj3 = new RingTorus("Old 2", 1.0, 0.5);
      obj.volume();
      
      Ring Torus obj4 = new RingTorus("Old 2", 2.0, 1.0);
      obj.volume();
      
      Assert.assertTrue(obj3.compareTo(obj4) < 0);
      
      Ring Torus obj5 = new RingTorus("Old 2", 4.0, 1.0);
      obj.volume();
      
      Ring Torus obj6 = new RingTorus("Old 2", 2.0, 1.0);
      obj.volume();
      
      Assert.assertTrue(obj5.compareTo(obj6) > 0);
   }

   
}
