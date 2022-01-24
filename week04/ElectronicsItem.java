/**
*Program that holds electronic inventory and extends inventory items.
*
*@author Ella Seaman - CPSC-1220
*@version 09/08/2021
*/


public class ElectronicsItem extends InventoryItem { 
   
   protected double weight;
   /** SHIPPING_COST final double for shipping cost.*/ 
   public static final double SHIPPING_COST = 1.5;
   
   /**
   * constructor.
   *@param nameIn brings in name of object
   *@param priceIn brings in price of object
   *@param weightIn bring in weight of object
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**
   * calculates calculateCost + SHIPPING_COST and weight.
   *@return returns price with shipping calculation
   */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
   
}
   
