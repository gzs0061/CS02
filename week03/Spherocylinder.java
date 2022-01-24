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
 
public class Spherocylinder implements Comparable<Spherocylinder> { 
// instance variables
   private String label = "";
   private double radius = 0;
   private double cylinderHeight = 0;
   private static int count = 0;
   
   /**
   * constructor.
   *  
   * @param labelIn - brings label string
   * 
   * @param radiusIn - radius double called.
   *
   * @param cylinderHeightIn - cylinderHeight double called.
   *
   *
   */
   public Spherocylinder(String labelIn, double radiusIn, 
            double cylinderHeightIn) { 
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylinderHeightIn);
      count++;
   }
   
   /**
   * method
   * getLabel
   * Returns label string.
   *
   * @return labelIn for label.
   */
   public String getLabel() {
      return label;
   }
   
   /**
   * setLabel
   * trims label string.
   * 
   * @param labelIn to trim label.
   *
   * @return isSet
   */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) { 
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   
   /**
   * 
   * gets radius and returns radius.
   * @return returns radius;
   */
   
   public double getRadius() {
      return radius;
   }
   
   /**
   * 
   * sets radius and returns true or false.
   * @param radiusIn to check if valid.
   * @return isSet
   */
   
   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
      if (radiusIn >= 0) {
         radius = radiusIn;
         isSet = true;
      } 
      return isSet;
   }
   /**
   * getCylinderHeight gets and returns cylinderHeight.
   *
   * @return returns cylinderHeight;
   */
   
   public double getCylinderHeight() {
      return cylinderHeight;
   }
   
   /**
   * setCylinderHeight returns if cylinderHeight is valid.
   * @param cylinderHeightIn checks if cylinder is valid or not.
   * @return isSet
   */
   
   public boolean setCylinderHeight(double cylinderHeightIn) {
      boolean isSet = false;
      if (cylinderHeightIn >= 0) {
         cylinderHeight = cylinderHeightIn;
         isSet = true;
      } 
      return isSet;
      
   }   
     
   /**
   * circumference calculator. 
   * @return circumference calculated
   */
   public double circumference() {
      double circumference = 2 * Math.PI * radius;
      return circumference;
   }
   
   /**
   * calculates the surface area.
   * @return calculated surfaceArea
   */
   
   public double surfaceArea() {
      double sa =  2 * Math.PI * radius;
      double sa2 = 2 * radius + cylinderHeight;
      double totalSa = sa2 * sa;
      return totalSa;
   }
   
   /**
   * calculates the volume.
   * @return calculated volume
   */
   
   public double volume() {
      double volume =  4.0 / 3 * radius + cylinderHeight;
      double volume2 = Math.PI * Math.pow(radius, 2);
      double totalVolume = volume2 * volume;
      return totalVolume;
   }
   
   /**
   * returns spherocylinder object.
   * @return String representation of spherocylinder.
   */

   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder " + "\"" + label + "\""
           + " with radius " + radius + " and cylinder height "
           + cylinderHeight + " has:\n\t";
      output += "circumference = " + df.format(circumference())
           + " units\n";
      output += "\tsurface area = " + df.format(surfaceArea())
           + " square units\n";
      output += "\tvolume = " + df.format(volume())
           + " cubic units";
      return output;
   }
   
   /**
   * getCount gets and returns count.
   *
   * @return returns count;
   */
   
   public static int getCount() {
      return count;
   }
   
   /**
   * Resets count.
   *
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   * checks inputs.
   * @param obj 
   *
   * @return verification;
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder)) {
         return false;
      }
      else {
         Spherocylinder d = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(d.getLabel())
                  && Math.abs(radius - d.getRadius()) < .000001
                  && Math.abs(cylinderHeight - d.getCylinderHeight())
                  < .000001);
      }
   }
   
   /**
   * the method is required by Checkstyle.
   * @return 0
   */
   public int hashCode() {
      return 0;
   }
   
   /**
   * the method compares volumes.
   * @param obj to compare
   * @return 0 for equal, -1 for less, and 1 for greater
   */
   
   public int compareTo(Spherocylinder obj) {
   
      if (Math.abs(this.volume() - obj.volume()) < .000001) {
         return 0;
      }
      
      else if (this.volume() < obj.volume()) {
         return -1;
      }
      
      return 1;
   }

}