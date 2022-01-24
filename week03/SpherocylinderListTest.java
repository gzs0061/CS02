import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Test for spherocylinderList.
*/



public class SpherocylinderListTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
/**
* Tests getName.
*/
  
   @Test public void getNameTest() {
      Spherocylinder[] a = new Spherocylinder[10];
      SpherocylinderList res = new SpherocylinderList("res", a, 0);
      String fileName = "spherocylinder_data_1.txt";
      String name = res.getName();
      Assert.assertEquals("res", name);
   }

/**
* Tests getList.
*/

   @Test public void getListTest() {
      Spherocylinder[] test = new Spherocylinder[100];
      SpherocylinderList res = new SpherocylinderList("res", test, 0);
      Assert.assertArrayEquals(test, res.getList());
   }
   
/**
* Tests totalSurfaceArea.
*/
  
   @Test public void totalSurfaceAreaTest() {
      Spherocylinder[] test = new Spherocylinder[10];
      SpherocylinderList res = new SpherocylinderList("res", test, 0);
      String fileName = "spherocylinder_data_1.txt";
      double surfaceArea = res.totalSurfaceArea();
      Assert.assertEquals(0, surfaceArea, .001);
   }
   
/**
* Tests totalVolume.
*/
   
   @Test public void totalVolumeTest() {
      Spherocylinder[] test = new Spherocylinder[10];
      SpherocylinderList res = new SpherocylinderList("res", test, 0);
      String fileName = "spherocylinder_data_1.txt";
      double volume = res.totalVolume();
      Assert.assertEquals(0, volume, .001);
   }
   
/**
* Tests averageSurfaceArea.
*/
     
   @Test public void averageSurfaceAreaTest() {
      Spherocylinder[] test = new Spherocylinder[10];
      SpherocylinderList res = new SpherocylinderList("res", test, 0);
      String fileName = "spherocylinder_data_1.txt";
      double avgSurfaceArea = res.averageSurfaceArea();
      Assert.assertEquals(0, avgSurfaceArea, .001);
   }
   
/**
* Tests averageSurfaceAreaNull.
*/
   
   @Test public void averageSurfaceAreaNullTest() {
      Spherocylinder[] test = new Spherocylinder[10];
      SpherocylinderList res = new SpherocylinderList("res", test, 0);
      String fileName = "spherocylinder_data_0.txt";
      double avgSurfaceArea = res.averageSurfaceArea();
      Assert.assertEquals(0, avgSurfaceArea, .001);
   }

/**
* Tests averageVolume.
*/   
   
   @Test public void averageVolumeTest() {
      Spherocylinder[] test = new Spherocylinder[10];
      SpherocylinderList res = new SpherocylinderList("res", test, 0);
      String fileName = "spherocylinder_data_1.txt";
      double avgVolume = res.averageVolume();
      Assert.assertEquals(0, avgVolume, .001);
   }

/**
* Tests averageVolumeNull.
*/    
   
   @Test public void averageVolumeNullTest() {
      Spherocylinder[] test = new Spherocylinder[10];
      SpherocylinderList res = new SpherocylinderList("res", test, 0);
      String fileName = "spherocylinder_data_0.txt";
      double avgVolume = res.averageVolume();
      Assert.assertEquals(0, avgVolume, .001);
   }

/**
* Tests addSpherocylinder.
*/    
   
   @Test public void addSpherocylinderTest() {
      Spherocylinder[] test = new Spherocylinder[10];
      SpherocylinderList res = new SpherocylinderList("res", test, 0);
      String fileName = "spherocylinder_data_1.txt";
      res.addSpherocylinder("testThree", 3.4, 5.6);
      Assert.assertEquals(1.0, res.numberOfSpherocylinders(), .0001);
   }

/**
* Tests findSpherocylinderTrue.
*/   
   
   @Test public void findSpherocylinderTrueTest() {
      Spherocylinder[] test = {new Spherocylinder("x", 3.5, 3.6)};
      SpherocylinderList res = new SpherocylinderList("res", test, 1);
      Spherocylinder yes = res.findSpherocylinder("x");
      Assert.assertEquals(test[0], yes);
   }

/**
* Tests findSpherocylinderFalse.
*/    
   
//    @Test public void findSpherocylinderFalseTest() {
//       Spherocylinder[] test = {new Spherocylinder("x", 3.5, 3.6)};
//       SpherocylinderList res = new SpherocylinderList("res", test, 1);
//       Spherocylinder yes = res.findSpherocylinder("res");
//       Assert.assertEquals("null", yes);
//    }

/**
* Tests deleteSpherocylinderTrue.
*/    
   
//    @Test public void deleteSpherocylinderTrueTest() {
//       Spherocylinder[] test = new Spherocylinder[10];
//       SpherocylinderList res = new SpherocylinderList("res", test, 0);
//       String fileName = "spherocylinder_data_1.txt";
//       Spherocylinder g = new Spherocylinder("testOne", 0, 0);
//       g = res.deleteSpherocylinder("Small Example");
//       Assert.assertEquals(2.0, res.numberOfSpherocylinders());
//    }

/**
* Tests deleteSpherocylinderFalse.
*/    
//    
//    @Test public void deleteSpherocylinderFalseTest() {
//       Spherocylinder[] test = new Spherocylinder[10];
//       SpherocylinderList res = new SpherocylinderList("res", test, 0);
//       String fileName = "spherocylinder_data_1.txt";
//       Spherocylinder g = new Spherocylinder("testOne", 0, 0);
//       g = res.deleteSpherocylinder("testOne");
//       Assert.assertEquals(3.0, res.numberOfSpherocylinders());
//    }

/**
* Tests editSpherocylinderTrue.
*/   
   
   @Test public void editSpherocylinderTrueTest() {
      Spherocylinder[] test = {new Spherocylinder("x", 3.5, 3.6)};
      SpherocylinderList res = new SpherocylinderList("res", test, 1);
      boolean yes = true;
      yes = res.editSpherocylinder("x", 2.6, 8.5);
      Assert.assertTrue(yes);
   }

/**
* Tests editSpherocylinderFalse.
*/   
   
//    @Test public void editSpherocylinderFalseTest() {
//       Spherocylinder[] test = {new Spherocylinder("x", 3.5, 3.6)};
//       SpherocylinderList res = new SpherocylinderList("res", test, 1);
//       boolean yes = false;
//       yes = res.editSpherocylinder("x", 2.6, 8.5);
//       Assert.assertFalse(yes);
//    }

/**
* Tests findSpherocylinderWithLargestVolumeTrue.
*/   
   
   @Test public void findSpherocylinderWithLargestVolumeTrueTest() {
      Spherocylinder[] test = {new Spherocylinder("x", 3.5, 3.6),
         new Spherocylinder("testTwo", 8.5, 4.6)};
      SpherocylinderList res = new SpherocylinderList("res", test, 2);
      Spherocylinder yes = res.findSpherocylinderWithLargestVolume();
      Assert.assertEquals(test[1], yes);
   }

/**
* Tests findSpherocylinderWithLargestVolumeFalse.
*/   
   
   @Test public void findSpherocylinderWithLargestVolumeFalseTest() {
      Spherocylinder[] test = {new Spherocylinder("x", 8.6, 7.8),
         new Spherocylinder("testTwo", 3.1, 2.2)};
      SpherocylinderList res = new SpherocylinderList("res", test, 2);
      Spherocylinder yes = res.findSpherocylinderWithLargestVolume();
      Assert.assertEquals(test[0], yes);
   }

/**
* Tests findSpherocylinderWithLargestVolumeNull.
*/   
   
   @Test public void findSpherocylinderWithLargestVolumeNullTest() {
      Spherocylinder[] test = new Spherocylinder[0];
      SpherocylinderList res = new SpherocylinderList("res", test, 0);
      String fileName = "spherocylinder_data_0.txt";
      Spherocylinder yes = res.findSpherocylinderWithLargestVolume();
      Assert.assertEquals(null, yes);
   }

// /**
// * Tests toString.
// */   
//    
//    @Test public void toStringTest() {
//       Spherocylinder[] test = new Spherocylinder[10];
//       SpherocylinderList res = new SpherocylinderList("res", test, 0);
//       String fileName = "spherocylinder_data_1.txt";
//       String toString = "Spherocylinder Test List\n\n" 
//          + "Spherocylinder \"Small Example\" with radius" 
//          + " 0.5 and cylinder height 0.25 has:\n"
//          + "\tcircumference = 3.142 units\n"
//          + "\tsurface area = 3.927 square units\n"
//          + "\tvolume = 0.72 cubic units\n"
//          + "\nSpherocylinder \"Medium Example\" with radius" 
//          + " 10.8 and cylinder height 10.1 has:\n"
//          + "\tcircumference = 67.858 units\n"
//          + "\tsurface area = 2,151.111 square units\n"
//          + "\tvolume = 8,977.666 cubic units\n"
//          + "\nSpherocylinder \"Large Example\" with radius" 
//          + " 98.32 and cylinder height 99.0 has:\n"
//          + "\tcircumference = 617.763 units\n"
//          + "\tsurface area = 182,635.388 square units\n"
//          + "\tvolume = 6,987,754.655 cubic units\n";
//    
//    
//       Assert.assertEquals(res.toString(), toString);
//    }
//  }

/**
 * Tests toString.
 */   
    
   //  @Test public void toStringTest() {
//        Spherocylinder[] test = new Spherocylinder[10];
//        SpherocylinderList res = new SpherocylinderList("res", test, 0);
//        String fileName = "spherocylinder_data_1.txt";
//        String summary = "----- Summary for Spherocylinder Test List -----"
//           + "\nNumber of Spherocylinders: 0\n"
//           + "Total Surface Area: 0\n"
//           + "Total Volume: 0\n"
//           + "Average Surface Area: 0\n"
//           + "Average Volume: 0";
//        Assert.assertEquals(test.toString(), toString());
//     }
}