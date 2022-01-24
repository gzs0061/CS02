import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Spherocylinder Test.
*
*/
public class SpherocylinderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** tests getLabel. **/
   @Test public void getLabelTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 1.2);
      String label = testOne.getLabel();
      Assert.assertEquals("testOne", label);
   }
   
   /** tests setLabel true. **/
   @Test public void setLabelTrueTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 1.2);
      boolean yes = false;
      String label = "testTwo";
      yes = testOne.setLabel(label);
      Assert.assertEquals(testOne.getLabel(), label);
      Assert.assertTrue(yes);
   }
   
   
    /** tests setLabel false. **/
   @Test public void setLabelFalseTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 1.2);
      boolean yes = testOne.setLabel(null);
      Assert.assertFalse(yes);
   }

   
   /** tests getRadius. **/
   @Test public void getRadiusTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 1.2);
      double radius = testOne.getRadius();
      Assert.assertEquals(2.3, radius, .000001);
   }
   
   /** tests getCylinderHeight. **/
   @Test public void getCylinderHeightTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 1.2);
      double cylHeight = testOne.getCylinderHeight();
      Assert.assertEquals(1.2, cylHeight, .000001);
   }
   
   /** tests setCylinderHeight True. **/
   @Test public void setCylinderHeightTrueTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 1.2);
      boolean yes = false;
      double num = 3.4;
      yes = testOne.setCylinderHeight(num);
      Assert.assertEquals(testOne.getCylinderHeight(), num, .000001);
      Assert.assertTrue(yes);
   }
   
    /** tests setCylinderHeight false. **/
   @Test public void setCylinderHeightFalseTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 1.2);
      boolean yes = testOne.setCylinderHeight(-1);
      Assert.assertFalse(yes);
   }
   
   /** tests setRadius true. **/
   @Test public void setRadiusTrueTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 1.2);
      boolean yes = false;
      double num = 7.9;
      yes = testOne.setRadius(num);
      Assert.assertEquals(testOne.getRadius(), num, .000001);
      Assert.assertTrue(yes);
   }
   
   /** tests setRadius false. **/
   @Test public void setRadiusFalseTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 1.2);
      boolean yes = testOne.setRadius(-1);
      Assert.assertFalse(yes);
   }

   
   /** tests circumference. **/
   @Test public void circumferenceTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 0, 1.2);
      double circumference = testOne.circumference();
      Assert.assertEquals(0, circumference, .000001);
   }
   
   /** tests surfaceArea. **/
   @Test public void surfaceAreaTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 0, 0);
      double surfaceArea = testOne.surfaceArea();
      Assert.assertEquals(0, surfaceArea, .000001);
   }
   
   /** tests volume. **/
   @Test public void volumeTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 0, 0);
      double volume = testOne.volume();
      Assert.assertEquals(0, volume, .000001);
   }
      
      /** tests getCount. **/
   @Test public void getCountTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 2.9);
      int count = Spherocylinder.getCount();
      Assert.assertEquals(Spherocylinder.getCount(), count);
   }
   
   /** tests resetCount. **/
   @Test public void resetCountTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 2.9);
      Spherocylinder.resetCount();
      int count = Spherocylinder.getCount();
      Assert.assertEquals(0, count);
   }
   
   /** tests equals true. **/
   @Test public void equalsTrueTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 2.3);
      Spherocylinder obj = new Spherocylinder("testOne", 2.3, 2.3);
      boolean yes = false;
      yes = testOne.equals(obj);
      Assert.assertEquals(testOne, obj);
      Assert.assertTrue(yes);
   }
   
     /** tests equals label. **/
   @Test public void equalsLabelTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 2.3);
      Spherocylinder obj = new Spherocylinder("testTwo", 2.3, 2.3);
      boolean yes = false;
      yes = testOne.equals(obj);
      Assert.assertFalse(yes);
   }
   
    /** tests equals radius. **/
   @Test public void equalsRadiusTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 2.3);
      Spherocylinder obj = new Spherocylinder("testOne", 1.7, 2.3);
      boolean yes = false;
      yes = testOne.equals(obj);
      Assert.assertFalse(yes);
   }

    /** tests equals cyl height. **/
   @Test public void equalsCylHeightTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 2.3);
      Spherocylinder obj = new Spherocylinder("testOne", 2.3, 1.7);
      boolean yes = false;
      yes = testOne.equals(obj);
      Assert.assertFalse(yes);
   }

   
   /** tests equals false. **/
   @Test public void equalsFalseTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 1.2, 2.1);
      String hello = "";
      boolean yes = testOne.equals(hello);
      Assert.assertFalse(yes);
   }

   
   /** tests hashCode. **/
   @Test public void hashCodeTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 1.2, 2.1);
      int code = testOne.hashCode();
      Assert.assertEquals(0, code, .00001);
   }
   
   /** tests toString. **/
   @Test public void toStringTest() {
      Spherocylinder testOne = new Spherocylinder("testOne", 4.3, 2.1);
      String toString = "Spherocylinder \"testOne\" with radius 4.3"
         + " and cylinder height 2.1 has:\n"
         + "\tcircumference = 27.018 units\n"
         + "\tsurface area = 289.089 square units\n"
         + "\tvolume = 455.023 cubic units";
      Assert.assertEquals(testOne.toString(), toString);
   }
   
   /** tests compareTo equal. */
   @Test public void testCompareToEqual() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 2.3);
      Spherocylinder obj = new Spherocylinder("testTwo", 2.3, 2.3);
      Assert.assertEquals("Testing compareTo is equal",
                              0, testOne.compareTo(obj));
   
   }
   
   /** tests compareTo lessThan. */
   @Test public void testCompareToLess() {
      Spherocylinder testOne = new Spherocylinder("testOne", 2.3, 2.3);
      Spherocylinder obj = new Spherocylinder("testTwo", 6.3, 5.9);
      Assert.assertEquals("Testing compareTo is less",
                              -1, testOne.compareTo(obj));
   
   }
   
   /** tests compareTo greaterThan. */
   @Test public void testCompareToGreater() {
      Spherocylinder testOne = new Spherocylinder("testOne", 6.3, 5.9);
      Spherocylinder obj = new Spherocylinder("testTwo", 3.4, 2.3);
      Assert.assertEquals("Testing compareTo is greater",
                              1, testOne.compareTo(obj));
   
   }
   
}