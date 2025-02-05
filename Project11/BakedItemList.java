import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
import java.util.NoSuchElementException;


/**
 * Class that provides methods for reading in a data file and generating
 * reports revolved around baked items.
 * Project 11
 * @author Demarco Guajardo - COMP 1210 - 001
 * @version 11/17/22
 */
 
public class BakedItemList {
   
   //instance variables
   
   private String listName;
   private BakedItem[] itemList;
   private String[] excludedRecords; 
   private int itemCount; //tracks number of baked item objects
   private int excludedCount; //tracks number of excluded records
   private static int listCount = 0; //tracks number of lists 
   
   //constructor
   
   /**
    * Constructor that creates a BakedItemList object to hold
    * BakedItem objects.
    */
   public BakedItemList() {
      listName = "";
      itemList = new BakedItem[100];
      excludedRecords = new String[30];
      itemCount = 0;
      excludedCount = 0;
      listCount++;
   }
   
   //methods
   
   /**
    * Creates a method that gets the name of the item list.
    * @return the name of the item list.
    */
   public String getListName() {
      return listName;
   }
   
   /**
    * Creates a method that sets a new list name for the item list.
    * @param listNameIn to represent the new name of the list. 
    */
   public void setListName(String listNameIn) {
      listName = listNameIn;
   }
    
   /**
    * Creates a method that gets the list of baked items.
    * @return list of baked items.
    */
   public BakedItem[] getItemList() {
      return itemList;
   }
    
   /**
    * Creates a method that sets a new list of baked items.
    * @param itemListIn to represent the new list of baked items.
    */
   public void setItemList(BakedItem[] itemListIn) {
      itemList = itemListIn;
   }
    
   /**
    * Creates a method that gets the count of items in the item list.
    * @return number of items in the item list.
    */
   public int getItemCount() {
      return itemCount;
   }
    
   /**
    * Creates a method that sets a new count of items in the item list.
    * @param itemCountIn to represent the new number of items in the item list.
    */
   public void setItemCount(int itemCountIn) {
      itemCount = itemCountIn;
   }
    
   /**
    * Creates a method that gets the String array of excluded records.
    * @return the String array of excluded records.
    */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
    
   /**
    * Creates a method that sets a new String array of excluded records.
    * @param excludedRecordsIn to represent the new String array of excluded
    * records.
    */
   public void setExcludedRecords(String[] excludedRecordsIn) {
      excludedRecords = excludedRecordsIn;
   }
    
   /**
    * Creates a method that gets the number or count of excluded records.
    * @return the number of excluded records. 
    */
   public int getExcludedCount() {
      return excludedCount;
   }
    
   /**
    * Creates a method that sets a new number of excluded records.
    * @param excludedCountIn to represent the number of excluded records.
    */
   public void setExcludedCount(int excludedCountIn) {
      excludedCount = excludedCountIn;
   }
    
   /**
    * Creates a method that gets the number of BakedItem lists.
    * @return the number of BakedItemList objects.
    */
   public static int getListCount() {
      return listCount;
   }
    
   /**
    * Creates a method that resets the number of BakedItem lists to 0.
    */
   public static void resetListCount() {
      listCount = 0;
   }
    
   /**
    * Creates a method that reads a file to use for other methods.
    * @param fileNameIn to represent the file being read. 
    * @throws FileNotFoundException if the file cannot be opened.
    */
   public void readItemFile(String fileNameIn) throws FileNotFoundException {
      String fileName = fileNameIn;
      Scanner scanFile = new Scanner(new File(fileName)); //scans overall file
      
      listName = scanFile.nextLine(); 
      
      
      while (scanFile.hasNext()) {
      
         String line = scanFile.nextLine();
         
         try {
           
            Scanner lineScanner = new Scanner(line); //scans individual line
            lineScanner.useDelimiter(",");
            
            char bakedItemType = lineScanner.next().charAt(0);
            String category = Character.toString(bakedItemType);
            
            String name, flavor;
            double crustCost;
            int quantity, layers, tiers;
            
            int index = 0;
            
            String[] ingredients = new String[50];
            BakedItem object; 
            
            switch (bakedItemType) {
               case 'C': //cookie
                  name = lineScanner.next(); 
                  flavor = lineScanner.next();
                  quantity = Integer.parseInt(lineScanner.next());
                  
                  index = 0;
                  while (lineScanner.hasNext()) {
                     ingredients[index] = lineScanner.next();
                     index++;
                  }
                  
                  String[] listOfIngredients = 
                     Arrays.copyOf(ingredients, index);
                  
                  object = new Cookie(name, flavor, quantity, 
                     listOfIngredients);
                     
                  itemList[itemCount] = object;
                  itemCount++;
                  break;
               
               case 'P': //pie
                  name = lineScanner.next(); 
                  flavor = lineScanner.next();
                  quantity = Integer.parseInt(lineScanner.next());
                  crustCost = Double.parseDouble(lineScanner.next());
                  
                  index = 0;
                  while (lineScanner.hasNext()) {
                     ingredients[index] = lineScanner.next();
                     index++;
                  }
                  
                  listOfIngredients = Arrays.copyOf(ingredients, index);
                  
                  object = new Pie(name, flavor, quantity, crustCost, 
                     listOfIngredients);
                     
                  itemList[itemCount] = object;
                  itemCount++;
                  break;
                  
               
               case 'K': //cake
                  name = lineScanner.next(); 
                  flavor = lineScanner.next();
                  quantity = Integer.parseInt(lineScanner.next());
                  layers = Integer.parseInt(lineScanner.next());
                  
                  index = 0;
                  while (lineScanner.hasNext()) {
                     ingredients[index] = lineScanner.next();
                     index++;
                  }
                  
                  listOfIngredients = Arrays.copyOf(ingredients, index);
                  
                  object = new Cake(name, flavor, quantity, layers,
                     listOfIngredients);
                     
                  itemList[itemCount] = object;
                  itemCount++;
                  break;
               
               case 'W': //wedding cake
                  name = lineScanner.next(); 
                  flavor = lineScanner.next();
                  quantity = Integer.parseInt(lineScanner.next());
                  layers = Integer.parseInt(lineScanner.next());
                  tiers = Integer.parseInt(lineScanner.next());
                  
                  index = 0;
                  while (lineScanner.hasNext()) {
                     ingredients[index] = lineScanner.next();
                     index++;
                  }
                  
                  listOfIngredients = Arrays.copyOf(ingredients, index);
                  
                  object = new WeddingCake(name, flavor, 
                     quantity, layers, tiers, listOfIngredients);
                     
                  itemList[itemCount] = object;
                  itemCount++;
                  break;
                  
               default: 
                  throw new InvalidCategoryException(category);
            }
         }
         catch (InvalidCategoryException e) {
            String invalidLine = line;
            excludedRecords[excludedCount] = 
                     "*** " + e + " in:\n" + invalidLine;
            excludedCount++; 
         }
         
         catch (NumberFormatException e) {
            String invalidLine = line;
            excludedRecords[excludedCount] =
                     "*** " + e + " in:\n" + invalidLine;
            excludedCount++;   
         }
         
         catch (NoSuchElementException e) {
            String invalidLine = line;
            excludedRecords[excludedCount] =
                     "*** " + e + " in:\n" + invalidLine;
            excludedCount++;
         }
         
      }
   
   }
    
   /**
    * Creates a method that generates a String report of all BakedItem objects 
    * in the BakedItemList object in no specific order.
    * @return String output of the report. 
    */
   public String generateReport() {
      String output = "\n---------------------------------------\n"
         + "Report for " + listName
         + "\n---------------------------------------\n";
      for (int i = 0; i < itemCount; i++) {
         output += "\n" + itemList[i] + "\n";
      }
      return output;
   }
    
   /**
    * Creates a method that generates a String report of all BakedItem objects 
    * in the BakedItemList object in order by class.
    * @return String output of the report.
    */
   public String generateReportByClass() {
      String output = "\n---------------------------------------\n"
         + "Report for " + listName + " (by Class)"
         + "\n---------------------------------------\n";
      
      BakedItem[] copyList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(copyList);
      
      for (int i = 0; i < itemCount; i++) {
         output += "\n" + copyList[i] + "\n";
      }
      
      return output;
   }
    
   /**
    * Creates a method that generates a String report of all BakedItem objects 
    * in the BakedItemList object in order by price.
    * @return String output of the report.
    */
   public String generateReportByPrice() {
      String output = "\n---------------------------------------\n"
         + "Report for " + listName + " (by Price)"
         + "\n---------------------------------------\n";
       
      BakedItem[] copyList = Arrays.copyOf(itemList, itemCount);   
      Arrays.sort(copyList, new PriceComparator());
      
      for (int i = 0; i < itemCount; i++) {
         output += "\n" + copyList[i] + "\n";
      }
      
      return output;
   }
    
   /**
    * Creates a method that generates a String report of all BakedItem objects 
    * in the BakedItemList object in order by flavor.
    * @return String output of the report.
    */
   public String generateReportByFlavor() {
      String output = "\n---------------------------------------\n"
         + "Report for " + listName + " (by Flavor)"
         + "\n---------------------------------------\n";
      
      BakedItem[] copyList = Arrays.copyOf(itemList, itemCount);   
      Arrays.sort(copyList, new FlavorComparator());
      
      for (int i = 0; i < itemCount; i++) {
         output += "\n" + copyList[i] + "\n";
      }
      return output;
   }
    
   /**
    * Creates a method that generates a String report of all BakedItem objects 
    * that failed to have a specific category.
    * @return String output of the report.
    */
   public String generateExcludedRecordsReport() {
      String output = "\n---------------------------------------\n"
         + "Excluded Records Report"
         + "\n---------------------------------------\n";
      
      for (int i = 0; i < excludedCount; i++) {
         output += "\n" + excludedRecords[i];
      }  
      return output;
   }
   
}