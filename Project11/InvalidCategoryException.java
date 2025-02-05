/**
 * Class created by extending the Exception class that determines whether
 * a category is invalid or not.
 * Project 11
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 11/17/22
 */
 
public class InvalidCategoryException extends Exception {
   
   /**
    * Constructor that creates the InvalidCategoryException taking in the
    * invalid category.
    * @param category to represent the category that is invalid.
    */
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   
   }
}