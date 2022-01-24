/**
*Program that holds inventory.
*
*@author Ella Seaman - CPSC-1220
*@version 09/08/2021
*/
 
public class InventoryItem { 
// instance variables
   protected double price;
   protected String name;
   private static double taxRate = 0;
   
   /**
   * constructor.
   *@param nameIn brings in name of object
   *@param priceIn brings in price of object
   */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**
   * customer name.
   *@return returns customer name
   */
   public String getName() {
      return name;
   }
   
   
   /**
   * calculates tax.
   *@return returns price with tax
   */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   /**
   * calculates tax.
   *@param taxRateIn brings in price of object
   */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
   * name and cost.
   *@return returns item and cost
   */
   public String toString() {
      return name + ": $" + calculateCost();
   }
   
}
   
