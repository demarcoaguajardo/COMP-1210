import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * Program that creates a class which stores the name of a list and an
   ArrayList of HexagonalPrism objects.
 * Project 6
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 09/29/22
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
      String result = "----- " + listName + " -----\n";
      int index = 0;
      while (index < prismsList.size()) {
         result += "\n" + prismsList.get(index) + "\n";
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
         + " cubic units\n";
      
      return result;
   }
   
   /**
    * Creates a method that returns the list of prisms.
    * @return the list of hexagonal prisms.
    */
   public ArrayList<HexagonalPrism> getList() {
      return prismsList;
   }
   
   /**
    * Creates a method that reads a file in the method and returns that
      file in the form of a HexagonalPrismList object.
    * @param fileNameIn for name of the file.
    * @return the scanned list of hexagonal prisms.
    * @throws FileNotFoundException if the file cannot be opened.
    */
   public HexagonalPrismList readFile(String fileNameIn)
      throws FileNotFoundException {
      String fileName = fileNameIn;
      Scanner scanFile = new Scanner(new File(fileName));
      String hexPrismListName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         String labelIn = scanFile.nextLine();
         double edgeIn = Double.parseDouble((scanFile.nextLine()));
         double heightIn = Double.parseDouble((scanFile.nextLine()));
         
         HexagonalPrism hexPrism = 
            new HexagonalPrism(labelIn, edgeIn, heightIn);
         prismsList.add(hexPrism); 
      }
      scanFile.close();
      HexagonalPrismList myPrismList = 
         new HexagonalPrismList(hexPrismListName, prismsList);
      return myPrismList;
   }
   
   /**
    * Creates a method that adds a new hexagonalPrism object to the 
      HexagonalPrismList.
    * @param newLabelIn for new prism's label.
    * @param newEdgeIn for new prism's edge.
    * @param newHeightIn for new prism's height.
    * @return nothing.
    */
   public HexagonalPrism addHexagonalPrism(String newLabelIn, 
      double newEdgeIn, double newHeightIn) {
      HexagonalPrism newHexPrism = 
         new HexagonalPrism(newLabelIn, newEdgeIn, newHeightIn);
      prismsList.add(newHexPrism);
      return null;
   }
   
   /**
    * Creates a method that is able to find a HexagonalPrism object by
      searching for the name of the object's label.
    * @param labelIn that tells the program which label to look for.
    * @return prism if the findLabelIn matches a prism in the list;
      otherwise, returns null. 
    */
   public HexagonalPrism findHexagonalPrism(String labelIn) {
      for (HexagonalPrism prism : prismsList) {
         if (prism.getLabel().equalsIgnoreCase(labelIn)) {
            return prism;
         }
      }
      return null;
   }
   
   /**
    * Creates a method that allows the user to delete a
      HexagonalPrism object by entering the label of the object
      they wish to delete.
    * @param labelIn that tells the program which object to delete
      using the label.
    * @return the prism if found; otherwise, returns null. 
    */
   public HexagonalPrism deleteHexagonalPrism(String labelIn) {
      for (HexagonalPrism prism : prismsList) {
         if (prism.getLabel().equalsIgnoreCase(labelIn)) {
            prismsList.remove(prism);
            return prism;
            
         }
      }
      return null;      
   }
   
   /** 
    * Creates a method that edits any HexagonalPrism object of the
      same label entered by the user, changing the edge and height 
      to the user's liking.
    * @param labelIn for the label to search for.
    * @param edgeIn to change the original edge to this.
    * @param heightIn to change the original height to this.
    * @return true if matching labels are found; otherwise, returns false.
    */
   public boolean editHexagonalPrism(String labelIn, 
      double edgeIn, double heightIn) {
      for (HexagonalPrism prism : prismsList) {
         if (prism.getLabel().equalsIgnoreCase(labelIn)) {
            prism.setEdge(edgeIn);
            prism.setHeight(heightIn);
            return true;
         }
      }
      return false; 
   }
}

