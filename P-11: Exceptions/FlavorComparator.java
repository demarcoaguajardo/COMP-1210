import java.util.Comparator;

/**
 * Comparator that sorts arrays by flavor.
 * Project 10
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 11/09/22
 */
 
public class FlavorComparator implements Comparator<BakedItem> {
   
   /**
    * Creates a method that compares two BakedItem objects by their flavors.
    * @param b1 to represent the first BakedItem object being compared.
    * @param b2 to represent the second BakedItem object being compared.
    * @return an int depending on the order of the BakedItem objects' flavors.
    */
   public int compare(BakedItem b1, BakedItem b2) {
      return b1.getFlavor().toUpperCase().compareTo(b2.getFlavor()
         .toUpperCase());
   }
}