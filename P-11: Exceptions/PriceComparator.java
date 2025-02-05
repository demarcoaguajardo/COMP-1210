import java.util.Comparator;

/**
 * Comparator that sorts arrays by price.
 * Project 10
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 11/09/22
 */
 
public class PriceComparator implements Comparator<BakedItem> {
   
   /**
    * Creates a method that compares two BakedItem objects by their prices.
    * @param b1 to represent the first BakedItem object being compared.
    * @param b2 to represent the second BakedItem object being compared.
    * @return an int depending on the order of the BakedItem objects' prices.
    */
   public int compare(BakedItem b1, BakedItem b2) {
      if (b1.price() < b2.price()) {
         return -1;
      }
      else if (b1.price() > b2.price()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}