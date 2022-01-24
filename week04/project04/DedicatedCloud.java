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
 
public class DedicatedCloud extends CloudStorage {
//instance variables
   private double serverCost;
   
   /**
   * constructor.
   *@param name brings in name of object
   *@param baseStorageCost brings in price of object
   *@param serverCostIn brings in server cost
   */
   public DedicatedCloud(String name, double baseStorageCost, 
            double serverCostIn) {
      super(name, baseStorageCost);
      serverCost = serverCostIn;
   }
   
   /**
   * get serverCost.
   *@return returns serverCost.
   */
   public double getServerCost() {
      return serverCost;
   }
   
   /**
   * sets serverCost.
   * @param serverCostIn server cost in
   */
   public void setServerCost(double serverCostIn) {
      serverCost = serverCostIn;
   }
   
   /**
   * calculates monthly cost.
   * @return returns monthly cost
   */
   public double monthlyCost() {
      return baseStorageCost + serverCost;
   }
   
   /**
   * name and cost.
   *@return returns output
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.00#");
      return super.toString() + "Monthly Cost: $" + df.format(monthlyCost())
                + "\nBase Storage Cost: $" + df.format(getBaseStorageCost())
                + "\nServer Cost: $" + df.format(getServerCost()) + "\n"; 
   }
   

}