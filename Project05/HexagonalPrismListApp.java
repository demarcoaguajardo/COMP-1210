import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Program that uses the HexagonalPrismList and HexagonalPrism classes 
   that uses a file scanner to effectively use the above classes.
 * Project 5
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 09/20/22
 */
public class HexagonalPrismListApp {
   
   /**
    * Creates a method that allows for the creation of a file scanner and
      an ArrayList object that stores all HexagonalPrism objects and later
      creates an ArrayList object that stores the name of the list and the
      HexagonalPrism list itself and displays it to the user.
    * @param args Command line arguments - not used.
         * @throws FileNotFoundException required by Scanner for File
    */
   public static void main(String[] args) throws FileNotFoundException 
   {
      ArrayList<HexagonalPrism> myList = new ArrayList<HexagonalPrism>();
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
      
      String hexPrismListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         String labelIn = scanFile.nextLine();
         double edgeIn = Double.parseDouble((scanFile.nextLine()));
         double heightIn = Double.parseDouble((scanFile.nextLine()));
         
         HexagonalPrism hexPrism = 
            new HexagonalPrism(labelIn, edgeIn, heightIn);
         myList.add(hexPrism); 
      }
      scanFile.close();
      
      HexagonalPrismList myPrismList = 
         new HexagonalPrismList(hexPrismListName, myList);
         
      System.out.println("\n" + myPrismList);
      
      System.out.println(myPrismList.summaryInfo());
      
   
   }
}