import java.text.DecimalFormat;

/**
 * RingTorus class that stores the label, small radius, and large radius 
 * where the small radius is less than the large radius and both are positive.
 * Project 7A
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 10/12/22
 */
 
public class RingTorus implements Comparable<RingTorus> {
   
   //instance variables
   
   private String label = "";
   private double largeRadius = 0;
   private double smallRadius = 0;
   
   //static variables
   
   private static int count = 0;
   
   //constructor 
   
   
   /**
    * Constructor that takes a label, large radius, and small radius
    * to create a RingTorus object.
    * @param labelIn for the label of the object.
    * @param largeRadiusIn for the large radius of the object.
    * @param smallRadiusIn for the small radius of the object.
    */
   public RingTorus(String labelIn, double largeRadiusIn,
      double smallRadiusIn) {
      setLabel(labelIn);
      setLargeRadius(largeRadiusIn);
      setSmallRadius(smallRadiusIn);
      count++;
   }
   
   //methods
   
   /**
    * Creates a method that sets the label of the RingTorus object.
    * @param labelIn to represent the label of the object.
    * @return true if label is not null; otherwise, returns false.
    */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      return false;
   }
   
   /**
    * Creates a method that gets the label of the RingTorus object for the
    * user to see.
    * @return label to see the label.
    */
   public String getLabel() {
      return label;
   }
   
   /**
    * Creates a method that sets a new large radius for a RingTorus object.
    * @param largeRadiusIn for new large radius to replace current large
    * radius.
    * @return true if largeRadiusIn is greater than current small radius
    * and is positive; otherwise, returns false.
    */
   public boolean setLargeRadius(double largeRadiusIn) {
      if (largeRadiusIn > smallRadius && largeRadiusIn > 0) {
         largeRadius = largeRadiusIn;
         return true;
      }
      return false;
   }
   
   /**
    * Creates a method that gets the large radius for a RingTorus object.
    * @return largeRadius for the large radius of a RingTorus object.
    */
   public double getLargeRadius() {
      return largeRadius;
   }
   
   /**
    * Creates a method that sets the small radius for a RingTorus object.
    * @param smallRadiusIn for a new small radius to replace current small
    * radius. 
    * @return true if smallRadiusIn is positive and smaller than current
    * large radius; otherwise, returns false.
    */ 
   public boolean setSmallRadius(double smallRadiusIn) {
      if (smallRadiusIn < largeRadius && smallRadiusIn > 0) {
         smallRadius = smallRadiusIn;
         return true;
      }
      return false;
   }
   
   /**
    * Creates a method that gets the small radius for a RingTorus object.
    * @return smallRadius for the small radius of a RingTorus object.
    */
   public double getSmallRadius() {
      return smallRadius;
   }
   
   /**
    * Creates a method that gives the diameter of a RingTorus object.
    * @return the diameter of the RingTorus object.
    */
   public double diameter() {
      return 2 * (largeRadius + smallRadius);
   }
   
   /**
    * Creates a method that gives the surface area of a RingTorus object.
    * @return the surface area of the RingTorus object.
    */
   public double surfaceArea() {
      return (2 * Math.PI * largeRadius) * (2 * Math.PI * smallRadius);
   }
   
   /**
    * Creates a method that gives the volume of a RingTorus object.
    * @return the volume of the RingTorus object.
    */
   public double volume() {
      return (2 * Math.PI * largeRadius) * (Math.PI
         * Math.pow(smallRadius, 2));
   }
   
   /** 
    * Creates a method that changes the representation of a RingTorus object
    * to a string.
    * @return output to show the object as a string.
    */
   public String toString() {
   
      DecimalFormat dfDouble = new DecimalFormat("#,##0.0##");
      
      String output = "RingTorus " + "\"" + label + "\"\n\t"
         + "large radius = " + dfDouble.format(largeRadius) + " units\n\t"
         + "small radius = " + dfDouble.format(smallRadius) + " units\n\t"
         + "diameter = " + dfDouble.format(diameter()) + " units\n\t"
         + "surface area = " + dfDouble.format(surfaceArea()) 
            + " square units\n\t"
         + "volume = " + dfDouble.format(volume()) + " cubic units\n\t";
      return output; 
   }
   
   /**
    * Creates a method that checks if an object is equal to another RingTorus
    * object.
    * @param obj to check if object is equal to RingTorus object.
    * @return true if the object has the same field values as the other
    * RingTorus object; otherwise, returns false.
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof RingTorus)) {
         return false;
      }
      else {
         RingTorus rt = (RingTorus) obj;
         return (label.equalsIgnoreCase(rt.getLabel())
            && (Math.abs(largeRadius - rt.getLargeRadius()) < .000001)
            && (Math.abs(smallRadius - rt.getSmallRadius()) < .000001));
      }
   }
   
   /**
    * Required for equals method above.
    * @return 0.
    */
   public int hashCode() {
      return 0;
   }
   
   /**
    * Creates a method that compares two RingTorus objects' volumes.
    * @param obj to represent the object being compared. 
    * @return 0 if objects' volumes are equal to each other; -1 if objects'
    * volumes being compared are less than the other object; and 1 if objects'
    * volumes being compared are greater than the other object.
    */ 
   public int compareTo(RingTorus obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0;
      }
      else if (this.volume() < obj.volume()) {
         return -1;
      }
      else {
         return 1;
      }
   }
   
   //static methods
   
   /**
    * Creates a static method that shows the user the count of
    * RingTorus objects. 
    * @return count of the RingTorus objects.
    */
   public static int getCount() {
      return count;
   }
   
   /** 
    * Creates a static method that resets the count to 0. 
    */
   public static void resetCount() {
      count = 0;
   }
  
}