/**
*Program that holds online data.
*
*@author Ella Seaman - CPSC-1220
*@version 09/09/2021
*/
 
public class PublicCloud extends SharedCloud {

/** COST_FACTOR final double for cost.*/ 
   public static final double COST_FACTOR = 2.0;
   
   /**
   * constructor.
   *@param name brings in name of object
   *@param baseStorageCost brings in price of object
   *@param dataStored brings in data stored
   *@param dataLimit brings in data limit
   */
   public PublicCloud(String name, double baseStorageCost, 
            double dataStored, double dataLimit) {
      super(name, baseStorageCost, dataStored, dataLimit);
   }
   
   /**
   * get cost factor.
   *@return returns cost factor.
   */
   public double getCostFactor() {
      return COST_FACTOR;
   }
   
   /**
   * calculates monthly cost.
   * @return returns monthly cost
   */
   public double monthlyCost() {
      return (baseStorageCost + dataOverage() * PublicCloud.COST_FACTOR);
   }
}