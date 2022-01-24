/**
*Program that holds online data.
*
*@author Ella Seaman - CPSC-1220
*@version 09/09/2021
*/

import java.text.DecimalFormat;
/**
*Decimal Format tool.
*
*/ 
 
public class SharedCloud extends CloudStorage {
//instance variables
   protected double dataStored;
   protected double dataLimit;
/** COST_FACTOR final double for cost.*/ 
   public static final double COST_FACTOR = 1.0;
   
   /**
   * constructor.
   *@param name brings in name of object
   *@param baseStorageCost brings in price of object
   *@param dataStoredIn brings in data stored
   *@param dataLimitIn brings in data limit
   */
   public SharedCloud(String name, double baseStorageCost, 
            double dataStoredIn, double dataLimitIn) {
      super(name, baseStorageCost);
      dataStored = dataStoredIn;
      dataLimit = dataLimitIn;
   }
   
   /**
   * get data stored.
   *@return returns dataStored.
   */
   public double getDataStored() {
      return dataStored;
   }
   
   /**
   * sets data stored.
   * @param dataStoredIn data stored in
   */
   public void setDataStored(double dataStoredIn) {
      dataStored = dataStoredIn;
   }
   
   /**
   * get data limit.
   *@return returns dataLimit.
   */
   public double getDataLimit() {
      return dataLimit;
   }
   
   /**
   * sets data limit.
   * @param dataLimitIn data limit in
   */
   public void setDataLimit(double dataLimitIn) {
      dataLimit = dataLimitIn;
   }
   
   /**
   * get cost factor.
   *@return returns cost factor.
   */
   public double getCostFactor() {
      return COST_FACTOR;
   }
   
   /**
   * calculate data overage.
   *@return returns value.
   */
   public double dataOverage() {
      double val = dataStored - dataLimit;
      if (val > 0) {
         return val;
      }
      return 0;
   }
   
   /**
   * calculates monthly cost.
   * @return returns monthly cost
   */
   public double monthlyCost() {
      return (baseStorageCost + dataOverage() * SharedCloud.COST_FACTOR);
   }
   
   
   /**
   * name, limit and cost.
   *@return returns output
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.00#");
      DecimalFormat gb = new DecimalFormat("#,##0.000#");
      return super.toString() + "Monthly Cost: $" + df.format(monthlyCost())
               + "\nBase Storage Cost: $" + df.format(getBaseStorageCost())
               + "\nData Stored: " + gb.format(getDataStored()) + " GB"
               + "\nData Limit: " + gb.format(getDataLimit()) + " GB"
               + "\nOverage: " + gb.format(dataOverage()) + " GB"
               + "\nCost Factor: " + this.getCostFactor() + "\n";
   }

}