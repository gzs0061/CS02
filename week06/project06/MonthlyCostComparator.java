/**
*Program that holds online data.
*
*@author Ella Seaman - CPSC-1220
*@version 09/18/2021
*/
import java.util.Comparator;
/**
*import java comparator functionality.
*/

public class MonthlyCostComparator implements Comparator<CloudStorage> {
 /**
   * constructor.
   *@param c1 cloud 1
   *@param c2 cloud 2
   *@return int comparison value
   */
   public int compare(CloudStorage c1, CloudStorage c2) {
      if (c1.monthlyCost() > c2.monthlyCost()) {
         return -1;
      }
      else if (c1.monthlyCost() < c2.monthlyCost()) {
         return 1;
      }
      else {
         return 0;
      }
   
   }
   
}
    
