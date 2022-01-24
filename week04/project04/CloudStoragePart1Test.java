import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** 
*tests cloud storage p1. 
**/
public class CloudStoragePart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** tests count five. **/
   @Test public void mainTest() {
      CloudStorage.resetCount();
      CloudStoragePart1.main(null);
      Assert.assertEquals("CloudStorage count should be 5. ",
         5, CloudStorage.getCount());
      
   }
}
