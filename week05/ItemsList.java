/**
*Program extension on inventory list items.
*
*@author Ella Seaman - CPSC-1220
*@version 09/15/2021
*/
 
public class ItemsList extends InventoryListApp { 
//instance variables
   private InventoryItem[] inventory;
   private int count;
   
   /**
   *Prints inventory items.
   *
   */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /**
   *Prints inventory items.
   *@param itemIn inventory item 
   */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++; 
   }
   
   /**
   *calculates total for items.
   *@param electronicsSurcharge inventory item 
   *@return returns total
   */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         } 
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
      
   /**
   *outputs the counter.
   *@return output
   */  
   public String toString() {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
    
   }  
   
   
}