import java.util.ArrayList;
import java.text.DecimalFormat;


/**
 * Program that creates a class which stores the name of a list and an
   ArrayList of HexagonalPrism objects.
 * Project 5
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 09/20/22
 */
 
public class HexagonalPrismList {
   
   //Instance Variables
   private String listName;
   private ArrayList<HexagonalPrism> prismsList;
   
   //Constructor
   
   /**
    * Constructor that creates a hexagonal prism list object which stores the
      name of a list and an ArrayList of HexagonalPrism objects.
    * @param listNameIn for the name of the list
    * @param prismsListIn for the prisms list. 
    */
   public HexagonalPrismList(String listNameIn, ArrayList<HexagonalPrism> 
      prismsListIn) {
      listName = listNameIn;
      prismsList = prismsListIn;
   }
   
   //Methods
   
   /**
    * Creates a method to return the name of the prism list. 
    * @return the name of the list to the user.
    */
   public String getName() {
      return listName; 
   }
   
   /**
    * Creates a method to return the size of the prism list.
    * @return the size of the prism list.
    */
   public int numberOfHexagonalPrisms() {
      if (prismsList.size() != 0) {
         return prismsList.size();
      }
      else {
         return 0;
      }
   }
   
   /**
    * Creates a method to return the total surface areas in the prism list.
    * @return the total surface area of all prisms in the list.
    */
   public double totalSurfaceArea() {
      if (prismsList.size() == 0) {
         return 0;
      }
      else {
         double total = 0;
         int index = 0;
         while (index < prismsList.size()) {
            total += prismsList.get(index).surfaceArea();
            index++;
         } 
         return total;
      }
   }
   
   /**
    * Creates a method to return the total volumes in the prism list.
    * @return the total volume of all prisms in the list.
    */
   public double totalVolume() {
      if (prismsList.size() == 0) {
         return 0;
      }
      else {
         double total = 0;
         int index = 0;
         while (index < prismsList.size()) {
            total += prismsList.get(index).volume();
            index++;
         }
         return total;
      }
   } 
   
   /**
    * Creates a method to return the average surface area of all the
      prisms in the prism list.
    * @return the average surface area of all prisms in the list.
    */
   public double averageSurfaceArea() {
      if (prismsList.size() == 0) {
         return 0;
      }
      else { 
         double average = prismsList.get(0).surfaceArea() / prismsList.size();
         int index = 1;
         while (index < prismsList.size()) {
            average += prismsList.get(index).surfaceArea() / prismsList.size();
            index++;
         }
         return average; 
      }
   
   }
   
   /**
    * Creates a method to return the average volume of all the
      prisms in the prism list.
    * @return the average volume of all prisms in the list.
    */
   public double averageVolume() {
      if (prismsList.size() == 0) {
         return 0;
      }
      else {
         double average = prismsList.get(0).volume() / prismsList.size();
         int index = 1;
         while (index < prismsList.size()) {
            average += prismsList.get(index).volume() / prismsList.size();
            index++;
         }  
         return average;
      }
   }
   
   /**
    * Creates a method that returns a string for the HexagonalPrism list.
    * @return the string for the list.
    */
   public String toString() {
      String result = "----- " + listName + " -----\n\n";
      int index = 0;
      while (index < prismsList.size()) {
         result += prismsList.get(index) + "\n";
         index++;
      } 
      return result;
   }
   
   /**
    * Creates a method that returns a string for the summary of the
      HexagonalPrism list, including number of prisms, total surface
      area, total volume, average surface area, and average volume.
    * @return String for summaryInfo results. 
    */
   public String summaryInfo() {
      DecimalFormat dFdouble = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of HexagonalPrisms: " + numberOfHexagonalPrisms();
      result += "\nTotal Surface Area: " + dFdouble.format(totalSurfaceArea())
         + " square units";
      result += "\nTotal Volume: " + dFdouble.format(totalVolume())
         + " cubic units";
      result += "\nAverage Surface Area: "
         + dFdouble.format(averageSurfaceArea())
         + " square units";
      result += "\nAverage Volume: " + dFdouble.format(averageVolume())
         + " cubic units";
      
      return result;
   }
}
