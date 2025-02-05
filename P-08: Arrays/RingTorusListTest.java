import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/**
 * Test that tests the methods from the RingTorusList class to assure there are 
 * no errors or faults in the class.
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 10/23/22
 */
public class RingTorusListTest {

   //instance variable
   private RingTorus[] rtList = {
      new RingTorus("Small Example", 9.5, 1.25),
      new RingTorus(" Medium Example ", 35.1, 10.4),
      new RingTorus("Large Example", 134.28, 32.46)
   };
      
   private RingTorus[] rtList0 = new RingTorus[0];
   
   /**
    * Tests getting the label of the list.
    */
   @Test public void getNameTest() {
      RingTorusList l = new RingTorusList("list 1", rtList, 3);
      Assert.assertEquals("list 1", l.getName());
   }
   
   /**
    * Tests the number of RingTorus objects in the list.
    */
   @Test public void numberOfRingTorusesTest() {
      RingTorusList l = new RingTorusList("list1", rtList, 3);
      Assert.assertEquals(3, l.numberOfRingToruses());
   }
   
   /**
    * Tests the total diameter of RingTorus objects in the list.
    */
   @Test public void totalDiameterTest() {
      RingTorusList l = new RingTorusList("list1", rtList, 3);
      l.totalDiameter();
      Assert.assertEquals(445.98, l.totalDiameter(), 0.000001);
      
      RingTorusList l0 = new RingTorusList("list0", rtList0, 0);
      l0.totalDiameter();
      Assert.assertEquals(0, l0.totalDiameter(), 0.000001);
   }
   
   /**
    * Tests the total surface area of RingTorus objects in the list.
    */
   @Test public void totalSurfaceAreaTest() {
      RingTorusList l = new RingTorusList("list1", rtList, 3);
      l.totalSurfaceArea();
      Assert.assertEquals(186955.72356188612, l.totalSurfaceArea(), 0.000001);
      
      RingTorusList l0 = new RingTorusList("list0", rtList0, 0);
      l0.totalSurfaceArea();
      Assert.assertEquals(0, l0.totalSurfaceArea(), 0.000001);
   }
   
   /**
    * Tests the total volume of RingTorus objects in the list.
    */
   @Test public void totalVolumeTest() {
      RingTorusList l = new RingTorusList("list1", rtList, 3);
      l.totalVolume();
      Assert.assertEquals(2868020.1192850494, l.totalVolume(), 0.000001);
      
      RingTorusList l0 = new RingTorusList("list0", rtList0, 0);
      l0.totalVolume();
      Assert.assertEquals(0, l0.totalVolume(), 0.000001);
   }
   
   /**
    * Tests the average diameter of RingTorus objects in the list.
    */
   @Test public void averageDiameterTest() {
      RingTorusList l = new RingTorusList("list1", rtList, 3);
      l.averageDiameter();
      Assert.assertEquals(148.66, l.averageDiameter(), 0.000001);
      
      RingTorusList l0 = new RingTorusList("list0", rtList0, 0);
      l0.averageDiameter();
      Assert.assertEquals(0, l0.averageDiameter(), 0.000001);
   }
   
   /**
    * Tests the average surface area of RingTorus objects in the list.
    */
   @Test public void averageSurfaceAreaTest() {
      RingTorusList l = new RingTorusList("list1", rtList, 3);
      l.averageSurfaceArea();
      Assert.assertEquals(62318.5745206287, l.averageSurfaceArea(), 0.000001);
      
      RingTorusList l0 = new RingTorusList("list0", rtList0, 0);
      l0.averageSurfaceArea();
      Assert.assertEquals(0, l0.averageSurfaceArea(), 0.000001);
   }
   
   /**
    * Tests the average volume of RingTorus objects in the list.
    */
   @Test public void averageVolumeTest() {
      RingTorusList l = new RingTorusList("list1", rtList, 3);
      l.averageVolume();
      Assert.assertEquals(956006.7064283498, l.averageVolume(), 0.000001);
      
      RingTorusList l0 = new RingTorusList("list0", rtList0, 0);
      l0.averageVolume();
      Assert.assertEquals(0, l0.averageVolume(), 0.000001);
   }
   
   /**
    * Tests converting a RingTorusList object into a string.
    */
   @Test public void toStringTest() {
      RingTorusList l = new RingTorusList("RingTorus Test List", rtList, 3);
      l.toString();
      Assert.assertEquals("----- Summary for RingTorus Test List -----\n"
         + "Number of RingToruses: 3\n"
         + "Total Diameter: 445.98 units\n"
         + "Total Surface Area: 186,955.724 square units\n"
         + "Total Volume: 2,868,020.119 cubic units\n"
         + "Average Diameter: 148.66 units\n"
         + "Average Surface Area: 62,318.575 square units\n"
         + "Average Volume: 956,006.706 cubic units", l.toString());
   }
   
   /**
    * Tests getting the list of RingTorus objects.
    */
   @Test public void getListTest() {
      RingTorusList l = new RingTorusList("RingTorus Test List", rtList, 3);
      Assert.assertEquals(rtList, l.getList());
   }
   
   /**
    * Tests adding a RngTorus object to the RingTorus list.
    */
   @Test public void addRingTorusTest() {
      RingTorusList l = new RingTorusList("list 1", rtList, 3);
      l.addRingTorus("new", 56, 32);
      Assert.assertEquals("----- Summary for list 1 -----\n" 
         + "Number of RingToruses: 4\n"
         + "Total Diameter: 621.98 units\n"
         + "Total Surface Area: 257,701.048 square units\n"
         + "Total Volume: 3,999,945.309 cubic units\n"
         + "Average Diameter: 155.495 units\n"
         + "Average Surface Area: 64,425.262 square units\n"
         + "Average Volume: 999,986.327 cubic units", l.toString());
   }
   
   /**
    * Tests finding a RingTorus object given a label.
    */
   @Test public void findRingTorusTest() {
      RingTorusList l = new RingTorusList("list 1", rtList, 3);
      Assert.assertEquals(l.findRingTorus("Small Example"), 
         l.findRingTorus("Small example"));
         
      RingTorusList l2 = new RingTorusList("list 2", rtList, 3);
      Assert.assertEquals(null, l.findRingTorus("Op"));
   }
   
   /**
    * Tests deleting a RingTorus object from a list.
    */
   @Test public void deleteRingTorusTest() {
      RingTorusList l = new RingTorusList("list 1", rtList, 3);
      Assert.assertEquals(l.findRingTorus("Medium Example"), 
         l.deleteRingTorus("Medium example"));
      
      RingTorusList l2 = new RingTorusList("list 2", rtList, 3);
      Assert.assertEquals(null, l.deleteRingTorus("Op"));
   }
   
   /**
    * Tests editing a RingTorus object from a list.
    */
   @Test public void editRingTorusTest() {
      RingTorusList l = new RingTorusList("list 1", rtList, 3);
      l.editRingTorus("Medium Example", 20, 10);
      Assert.assertTrue(true);
      
      RingTorusList l2 = new RingTorusList("list 2", rtList, 3);
      l.editRingTorus("Op", 20, 10);
      Assert.assertFalse(false);
   }
   
   /**
    * Tests finding the RingTorus object with the largest volume.
    */
   @Test public void findRingTorusWithLargestVolumeTest() {
      RingTorusList l = new RingTorusList("list 1", rtList, 3);
      Assert.assertEquals(l.findRingTorus("Large Example"), 
         l.findRingTorusWithLargestVolume());
         
      RingTorusList l2 = new RingTorusList("list 2", rtList, 3);
      l.addRingTorus("New", 30, 10);
      l.addRingTorus("New Big", 135, 35);
      Assert.assertEquals(l.findRingTorus("New Big"), 
         l.findRingTorusWithLargestVolume());
         
      RingTorusList l0 = new RingTorusList("list0", rtList0, 0);
      Assert.assertEquals(null, l0.findRingTorusWithLargestVolume());
   }
}
