import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;


/**
 * Program that presents the user with eight options and implements 
   the choices of reading a file, printing a report, printing a summary,
   adding a HexagonalPrism object to the HexagonalPrismList object,
   deleting a HexagonalPrism object from the HexagonalPrismList object,
   finding a HexagonalPrism object from the HexagonalPrismList object,
   editing a HexagonalPrism object from the HexagonalPrismList object, and
   quitting the program.
 * Project 6
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 09/29/22
 */
 
public class HexagonalPrismListMenuApp {

   /**
    * Desc. 
    * @param args - is not used.
    * @throws FileNotFoundException if the file cannot be opened.
    */
   public static void main(String[] args) throws FileNotFoundException {
      
      Scanner scan = new Scanner(System.in);
      
      String prismListName = "*** no list name assigned ***";
      ArrayList<HexagonalPrism> myList = new ArrayList<HexagonalPrism>();
      HexagonalPrismList myPrismList = 
         new HexagonalPrismList(prismListName, myList);
      String code = "";
      String fileName = "";
      String label = "";
      double edge = 0;
      double height = 0;
      
      System.out.println("HexagonalPrism List System Menu");
      System.out.println("R - Read File and Create HexagonalPrism List");
      System.out.println("P - Print HexagonalPrism List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add HexagonalPrism");
      System.out.println("D - Delete HexagonalPrism");
      System.out.println("F - Find HexagonalPrism");
      System.out.println("E - Edit HexagonalPrism");
      System.out.println("Q - Quit");
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R': //Read in file and creates HexPrism list
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               
               myPrismList = myPrismList.readFile(fileName);
               
               System.out.println("\tFile read in and HexagonalPrism List"
                  + " created\n"); 
               break;
                  
            case 'P': //Print list
               System.out.println("\n" + myPrismList);
               break;
               
            case 'S': //Print summary for list
               System.out.println("\n" + myPrismList.summaryInfo());
               break;
               
            case 'A': //Add HexagonalPrism object to HexagonalPrism List
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               
               myPrismList.addHexagonalPrism(label, edge, height);
               
               System.out.println("\t*** HexagonalPrism added ***\n");
               
               break;
               
            case 'D': //Delete HexagonalPrism object from HexagonalPrism List
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (myPrismList.deleteHexagonalPrism(label) != null) {
                  System.out.println("\t\"" + label + "\" deleted\n"); 
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'F': //Find HexagonalPrism object in HexagonalPrism List
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (myPrismList.findHexagonalPrism(label) != null) {
                  System.out.println(myPrismList.findHexagonalPrism(label) 
                     + "\n");
                  
               }
               
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               
               break;
               
            case 'E': //Edit HexagonalPrism object in HexagonalPrism List
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               
               if (myPrismList.editHexagonalPrism(label, height, edge)) {
                  System.out.println("\t\"" 
                     + myPrismList.findHexagonalPrism(label).getLabel()
                        + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               
               break;
               
            case 'Q': //Quit
               break;
            
            default: //no match, loop again
               System.out.println("\t*** invalid code ***\n");
               break; 
         }
         
      } while (!code.equalsIgnoreCase("Q"));
   
   }
}