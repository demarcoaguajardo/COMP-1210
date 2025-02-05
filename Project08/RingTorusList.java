import java.text.DecimalFormat;


/**
 * Program that stores an array or list of RingTorus objects and a label of
 * that list.
 * Project 8
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 10/23/22
 */
 
public class RingTorusList {
   
   //instance variables
   
   private String label = "";
   private RingTorus[] rtArray;
   private int count = 0;
   
   //constructor
   
   /**
    * Constructor that creates a RingTorusList object that stores the label
    * of the list, the array of RingTorus objects, and the number of RingTorus
    * objects in the list.
    * @param labelIn to represent the label of the list.
    * @param rtArrayIn to represent the array of RingTorus objects.
    * @param countIn to represent the count of RingTorus objects.
    */ 
   public RingTorusList(String labelIn, RingTorus[] rtArrayIn, int countIn) {
      
      label = labelIn;
      rtArray = rtArrayIn;
      count = countIn;
   }
   
   //methods
   
   /**
    * Creates a method that gets the label of the RingTorus object list.
    * @return label of the list.
    */
   public String getName() {
      return label;
   }
    
   /**
    * Creates a method that gets the number of RingTorus objects in the list.
    * @return count of RingTorus objects.
    */
   public int numberOfRingToruses() {
      return count;
   }
    
   /**
    * Creates a method that finds the total diameter of all RingTorus objects.
    * @return total diameter of all RingTorus objects.
    */
   public double totalDiameter() {
      double total = 0;
      
      for (int i = 0; i < count; i++) {	
         total += rtArray[i].diameter(); 	
      }  	
      return total;
   }
    
   /**
    * Creates a method that finds the total surface area of all
    * RingTorus objects.
    * @return total surface area of all RingTorus objects.
    */
   public double totalSurfaceArea() {
      double total = 0;
      
      for (int i = 0; i < count; i++) {	
         total += rtArray[i].surfaceArea(); 	
      }  	
      return total;
   }
    
   /**
    * Creates a method that finds the total volume of all
    * RingTorus objects.
    * @return total volume of all RingTorus objects.
    */
   public double totalVolume() {
      double total = 0;
      
      for (int i = 0; i < count; i++) {	
         total += rtArray[i].volume(); 	
      }  	
      return total;
   }
    
   /**
    * Creates a method that finds the average diameter of all
    * RingTorus objects.
    * @return average diameter of all RingTorus objects.
    */
   public double averageDiameter() {
      double sum = 0;
      
      if (count == 0) {
         return 0;
      
      }   
      for (int i = 0; i < count; i++) {
         sum += rtArray[i].diameter();
      
      }
      return sum / count;      
      
   }
    
   /**
    * Creates a method that finds the average surface area of all
    * RingTorus objects.
    * @return average surface area of all RingTorus objects.
    */
   public double averageSurfaceArea() {
      double sum = 0;
      
      if (count == 0) {
         return 0;
      
      }   
      for (int i = 0; i < count; i++) {
         sum += rtArray[i].surfaceArea();
      
      }
      return sum / count;
      
      
   }
    
   /**
    * Creates a method that finds the average volume of all
    * RingTorus objects.
    * @return average volume of all RingTorus objects.
    */
   public double averageVolume() {
      double sum = 0;
     
       
      if (count == 0) {
         return 0;
      
      }   
      for (int i = 0; i < count; i++) {
         sum += rtArray[i].volume();
      
      }
      return sum / count;
      
     
      
      
   }
    
   /**
    * Creates a method that converts a RingTorusList object into a string.
    * @return the output of the string representing the RingTorusList object.
    */
   public String toString() {
   
      DecimalFormat dfDouble = new DecimalFormat("#,##0.0##");
      
      String result = "";
   
      result += "----- Summary for " + label + " -----\n";
      result += "Number of RingToruses: " + count + "\n";
      result += "Total Diameter: " + dfDouble.format(totalDiameter()) 
         + " units\n";
      result += "Total Surface Area: " + dfDouble.format(totalSurfaceArea())
         + " square units\n";
      result += "Total Volume: " + dfDouble.format(totalVolume()) 
         + " cubic units\n";
      result += "Average Diameter: " + dfDouble.format(averageDiameter()) 
         + " units\n";
      result += "Average Surface Area: " + dfDouble.format(averageSurfaceArea())
         + " square units\n";
      result += "Average Volume: " + dfDouble.format(averageVolume()) 
         + " cubic units";
      
      return result;
   }
    
   /**
    * Creates a method that gets the list of the RingTorus objects.
    * @return the array of RingTorus objects.
    */
   public RingTorus[] getList() {
      return rtArray;
   }
    
   /**
    * Creates a method that adds a RingTorus object to the RingTorus list.
    * @param labelIn to represent the label of the new RingTorus object.
    * @param largeRadiusIn to represent the large radius of the new
    * RingTorus object.
    * @param smallRadiusIn to represent the small radius of the new
    * Ring Torus object.
    */
   public void addRingTorus(String labelIn, double largeRadiusIn, 
      double smallRadiusIn) {
      RingTorus newRingTorus = new RingTorus(labelIn, largeRadiusIn,
         smallRadiusIn);
      RingTorus[] rtArray2 = new RingTorus[count + 1];
      for (int i = 0; i < count; i++) {
         rtArray2[i] = rtArray[i]; 
      }
      rtArray = rtArray2;
      count++;
      rtArray[count - 1] = newRingTorus;
   }
   
   /**
    * Creates a method that finds a specific RingTorus object in the RingTorus
    * list.
    * @param labelIn to represent the label of the RingTorus object the user
    * is trying to find.
    * @return RingTorus object if there is a matching label;
    * otherwise, returns null.
    */
   public RingTorus findRingTorus(String labelIn) {
      for (int i = 0; i < count; i++) {
         if (rtArray[i].getLabel().equalsIgnoreCase(labelIn)) {
            return rtArray[i];
         }
         
      }
      return null;
   }
    
   /**
    * Creates a method that deletes a RingTorus object from the RingTorus list.
    * @param labelIn to represent the label of the RingTorus object to
    * be deleted. 
    * @return RingTorus object to be deleted; otherwise, returns null.
    */
   public RingTorus deleteRingTorus(String labelIn) {
      for (int i = 0; i < count; i++) {
         if (rtArray[i].getLabel().equalsIgnoreCase(labelIn)) { 
            RingTorus delObject = rtArray[i];
            for (int j = i; j < count - 1; j++) {
               rtArray[j] = rtArray[j + 1];
            }
            rtArray[count - 1] = null;
            count--;
            return delObject;
            
         }
      }
      return null;
   }
    
   /**
    * Creates a method that edits a RingTorus object in the list.
    * @param labelIn to represent the label of the RingTorus to be edited.
    * @param largeRadiusIn to represent the large radius of the RingTorus
    * to be edited.
    * @param smallRadiusIn to represent the small radius of the RingTorus
    * to be edited.
    * @return true if there is a RingTorus object to edit; otherwise,
    * returns false.
    */
   public boolean editRingTorus(String labelIn, double largeRadiusIn,
      double smallRadiusIn) {
      for (int i = 0; i < count; i++) {
         if (rtArray[i].getLabel().equalsIgnoreCase(labelIn)) {
            rtArray[i].setLargeRadius(largeRadiusIn);
            rtArray[i].setSmallRadius(smallRadiusIn);
            return true;
         }
      }
      return false;
   }
    
   /**
    * Creates a method that finds the RingTorus with the largest volume.
    * @return RingTorus object with the largest volume; if there are no objects
    * in the array, returns null.
    */
   public RingTorus findRingTorusWithLargestVolume() {
      double largest = 0;
      int index = 0;
      if (count != 0) {
         RingTorus largestVolObject = rtArray[index];
         while (index < count) {
            if (largest < rtArray[index].volume()) {
               largest = rtArray[index].volume();
               largestVolObject = rtArray[index];
            }
            index++;
         }
         return largestVolObject;
      } 
      return null;
   }
      
   // public double findRingTorusVolume() {
      // double largest = 0;
      // int index = 0;
      // while (index < count) {
         // if (largest < rtArray[index].volume()) {
            // largest = rtArray[index].volume();
         // }
         // index++;  
      // }   
   //    
      // return largest;
   // }
}