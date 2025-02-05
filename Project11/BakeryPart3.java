import java.io.FileNotFoundException;

/**
 * Program that uses a main method and command line to read a file and provide
 * generated reports based on the argument put into the command line.
 * Project 11
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 11/17/22
 */
 
public class BakeryPart3 {
 
   /**
 * Creates a main method that provides multiple reports of a BakedItemList
 * object determined by a command line argument. If there are no arguments,
 * then there is no report shown. 
 * @param args file to be read provided by the user.
 */
   public static void main(String[] args) {
   
      try {
      
         if (args.length == 0) {
            System.out.println("File name expected as command line argument.\n"
               + "Program ending.");
         }
         else {
            int i = 0;
            String fileName = args[i];
               
            BakedItemList bList = new BakedItemList();
               
            bList.readItemFile(fileName);
               
            System.out.println(bList.generateReport());
            System.out.println(bList.generateReportByClass());
            System.out.println(bList.generateReportByPrice());
            System.out.println(bList.generateReportByFlavor());
            System.out.println(bList.generateExcludedRecordsReport());
         }
      }
      
      catch (FileNotFoundException e) {
         System.out.println("Attempted to read file: " + args[0]
            + " (No such file or directory)");
         System.out.println("Program ending.");
      }
      
   
   }
   
}