/**
*Program that holds online data.
*
*@author Ella Seaman - CPSC-1220
*@version 09/09/2021
*/

 
public abstract class CloudStorage {
// instance variables
   protected double baseStorageCost;
   protected String name;
   protected static int count = 0;
   
   /**
   * constructor.
   *@param nameIn brings in name of object
   *@param baseStorageCIn brings in price of object
   */
   public CloudStorage(String nameIn, double baseStorageCIn) {
      name = nameIn;
      baseStorageCost = baseStorageCIn;
      count++;
   }
   
   /**
   * customer name.
   *@return returns customer name
   */
   public String getName() {
      return name;
   }
   
   /**
   * customer name.
   *@param nameIn string
   */
   public void setName(String nameIn) {
      name = nameIn;

   }
   
   /**
   * base storage cost.
   *@return returns baseStorageCost.
   */
   public double getBaseStorageCost() {
      return baseStorageCost;
   }
   
   /**
   * base storage cost.
   *@param baseStorageCIn double
   */
   public void setBaseStorageCost(double baseStorageCIn) {
      baseStorageCost = baseStorageCIn;

   }
   
   /**
   * get count of objs.
   *@return returns count.
   */
   public static int getCount() {
      return count;
   }
   
   /**
   * resets count.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   * name and cost.
   *@return returns item and cost
   */
   public String toString() {
      return name + " (" + this.getClass() + ") ";
   }
   
   /**
   * abstract method for monthly cost.
   * @return returns monthly cost
   */
   public abstract double monthlyCost();
   
   
   /**
   * abstract method for compares monthly cost.
   * @param other CloudStorage object
   * @return returns comparison
   */
   public int compareTo(CloudStorage other) {
      return name.toLowerCase()  
                 .compareTo(other.getName().toLowerCase());
   }
}