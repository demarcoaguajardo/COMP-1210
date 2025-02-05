import java.text.DecimalFormat;
/**
 * HexagonalPrism describes right regular
   HexagonalPrism objects.
 * Project 4
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 09/11/22
 */
 
public class HexagonalPrism {
 // instance variables
   private String label = "";
   private double edge = 0;
   private double height = 0; 
   
 // constructor
 
   /**
    * Determines label, edge, and height of hexagonal prism.
    * @param labelIn to determine label.
    * @param edgeIn to determine edge.
    * @param heightIn to determine height. 
    */
   public HexagonalPrism(String labelIn, double edgeIn, double heightIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
   }
   
 //methods
 
   /**
    * Determines label.
    * @param labelIn to determine label.
    * @return true if applied; otherwise false.
    */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false; 
      }
   }
 
   /**
    * Returns the label.
    * @return the label.
    */
   public String getLabel() {
      return label;
   }
   
   /**
    * Determines edge.
    * @param edgeIn to determine edge.
    * @return true if applied; otherwise false. 
    */
   public boolean setEdge(double edgeIn) {
      if (edgeIn > 0) {
         edge = edgeIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Returns the edge.
    * @return the edge.
    */
   public double getEdge() {
      return edge;
   }
   
   /**
    * Determines height.
    * @param heightIn to determine height.
    * @return true if applied; otherwise false.
    */
   public boolean setHeight(double heightIn) {
      if (heightIn > 0) {
         height = heightIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Returns the height.
    * @return the height.
    */
   public double getHeight() {
      return height;
   }
   
   /**
    * Returns the value of the surface area.
    * @return the value of the surface area.
    */
   public double surfaceArea() {
      return (6 * edge * height) + (3 * Math.sqrt(3) * Math.pow(edge, 2)); 
   }
   
   /**
    * Returns the value of the lateral surface area.
    * @return the value of the lateral surface area.
    */
   public double lateralSurfaceArea() {
      return (6 * edge * height);
   }
   
   /**
    * Returns the value of the base surface area.
    * @return the value of the base surface area.
    */
   public double baseArea() {
      return ((3 * Math.sqrt(3)) * (Math.pow(edge, 2) / 2));
   }
    
    /**
    * Returns the value of the volume.
    * @return the value of the volume.
    */
   public double volume() {
      return ((3 * Math.sqrt(3) / 2) * Math.pow(edge, 2) * height);
   }
   
   /** 
    * Changes representation of object to a string.
    * @return string representing the HexagonalPrism objects.
    */
   public String toString() {
      DecimalFormat dFdouble = new DecimalFormat("#,##0.0##");
      String output = "HexagonalPrism " + "\"" + label + "\" "
         + "has 8 faces, 18 edges, and 12 vertices.\n\t"
         + "edge = " + dFdouble.format(edge) + " units\n\t"
         + "height = " + dFdouble.format(height) + " units\n\t"
         + "lateral surface area = " + dFdouble.format(lateralSurfaceArea())
            + " square units\n\t"
         + "base area = " + dFdouble.format(baseArea()) + " square units\n\t"
         + "surface area = " + dFdouble.format(surfaceArea()) + " square" 
            + " units\n\t"
         + "volume = " + dFdouble.format(volume()) + " cubic units\n\t";
      return output;
   }
}


