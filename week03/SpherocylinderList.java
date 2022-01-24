/**
*Program that creates and tests spherocylinder.
*
*@author Ella Seaman - CPSC-1220
*@version 09/05/2021
*/
import java.text.DecimalFormat;
/**
*Decimal Format tool.
*
*/ 
 
public class SpherocylinderList { 
// instance variables
   private String listName = "";
   private int num = 0;
   private Spherocylinder[] objects;
  
   
   /**
   * method.
   * pass info to public
   * @param nameIn string name
   * @param objIn object
   * @param numIn count
   *
   */
   public SpherocylinderList(String nameIn,
         Spherocylinder[] objIn, int numIn) { 
      listName = nameIn;
      objects = objIn;
      num = numIn;
   }
   
   /**
   * method
   * get name
   * Returns name string.
   *
   * @return listName for name.
   */
   public String getName() {
      return listName;
   }
   
   /**
   * 
   * gets number of spherocylinders.
   * @return num returns number of spherocylinders;
   */
   
   public int numberOfSpherocylinders() {
      return num;
   }
   
   /**
   * calculates the total surface area.
   * @return surfaceArea
   */
   
   public double totalSurfaceArea() {
      double surfaceArea = 0;
      int i = 0;
      while (i < num) {
         surfaceArea += objects[i].surfaceArea();
      }
      return surfaceArea;
   }
   
   /**
   * calculates total volume.
   * @return volume
   */
   
   public double totalVolume() {
      double volume = 0;
      int i = 0;
      while (i < num) {
         volume += objects[i].volume();
      }
      return volume;
   }
   
   /**
   * 
   * gets average surface area.
   * @return returns average;
   */
   
   public double averageSurfaceArea() {
      double surfaceArea = 0;
      int i = 0;
      while (i < num) {
         surfaceArea += objects[i].surfaceArea();
         i++;
      }
      if (num > 0) {
         surfaceArea /= num;
      }
      return surfaceArea;
   }
   
   /**
   * 
   * gets average volume.
   * @return returns average;
   */
   
   public double averageVolume() {
      double volume = 0;
      int i = 0;
      while (i < num) {
         volume += objects[i].volume();
         i++;
      }
      if (num > 0) {
         volume /= num;
      }
      return volume;
   }
   
   /**
   * returns spherocylinder list summary.
   * @return String summary of spherocylinder list.
   */

   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + "\"" + listName + " -----\n"
           + " Number of Spherocyliners " + num + "\n"
           + " Total Surface Area: " + df.format(totalSurfaceArea()) + "\n"
           + " Total Volume: " + df.format(totalVolume()) + "\n"
           + " Average Surface Area: " + df.format(averageSurfaceArea()) + "\n"
           + " Average Volume: " + df.format(averageVolume()) + "\n";
      return output;
   }
   
   /**
   * returns spherocylinder list.
   * @return objects.
   */
   public Spherocylinder[] getList() {
      return objects;
   }
   
   /**
   * returns spherocylinder list.
   * @param labelIn label
   * @param radiusIn radius
   * @param cHeightIn height
   */
   public void addSpherocylinder(String labelIn, 
                  double radiusIn, double cHeightIn) {
      Spherocylinder s = new Spherocylinder(labelIn, radiusIn, cHeightIn);
      objects[num] = s;
      num++;
   }
   
   /**
   * returns spherocylinder list.
   * @param labelIn label
   * @return returns list
   */
   public Spherocylinder findSpherocylinder(String labelIn) {
      Spherocylinder res = new Spherocylinder("", 0, 0);
      boolean find = false;
      for (int i = 0; i < num; i++) {
         if (objects[i].getLabel().toUpperCase()
            .equals(labelIn.toUpperCase()))
         {
            res = objects[i];
            find = true;
         }
      }
      if (find) {
         return res;
      }
      else {
         return null;
      }
   }
   
   /**
   * deletes spherocylinder list.
   * @param labelIn label
   * @return returns list
   */
   public Spherocylinder deleteSpherocylinder(String labelIn) {
      Spherocylinder res = findSpherocylinder(labelIn);
      
      for (int i = 0; i < num; i++) {
         if (objects[i].getLabel().toUpperCase()
            .equals(labelIn.toUpperCase()))
         {
            res = objects[i];
            for (int j = i; j < num - 1; j++) {
               objects[j] = objects[j + 1];
            }
            objects[num - 1] = null;
            num--;
            break;
         }
      }
      return res;
   }
   
   /**
   * edits spherocylinder list.
   * @param labelIn label
   * @param radiusIn radius
   * @param cHeightIn height
   * @return true
   */
   public boolean editSpherocylinder(String labelIn, 
                  double radiusIn, double cHeightIn) {
      boolean bool = false;
      
      for (int i = 0; i < num; i++) {
         if (objects[i].getLabel().toUpperCase()
            .equals(labelIn.toUpperCase()))
         {
            objects[i].setRadius(radiusIn);
            objects[i].setCylinderHeight(cHeightIn);
            bool = true;
         }
      }
      return bool;
   }
   
   /**
   * finds spherocylinder list.
   * @return list
   */
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      if (num > 0) {
         Spherocylinder large = objects[0];
         
         for (int i = 0; i < num; i++) {
            if (objects[i].volume() > large.volume()) {
               large = objects[i];
            }
         }
         return large;
      }
      else {
         return null;
      }
   }
}
   
   
  