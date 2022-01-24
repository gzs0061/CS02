/**
*Program that holds online inventory and extends inventory items.
*
*@author Ella Seaman - CPSC-1220
*@version 09/08/2021
*/
 
public abstract class OnlineTextItem extends InventoryItem { 
   
   /**
   * constructor.
   *@param nameIn brings in name of object
   *@param priceIn brings in price of object
   */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /**
   * returns price.
   *@return returns price 
   */
   public double calculateCost() {
      return price;
   }
   
}
   
