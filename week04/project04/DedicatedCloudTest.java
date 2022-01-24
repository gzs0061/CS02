import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
*Test for dedicated cloud.
*/

public class DedicatedCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void defaultTest() {
   }
   
   /** tests getServerCost. **/
   @Test public void getAndSetTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      
      c1.setName("Cloud");
      Assert.assertEquals("Cloud", c1.getName());
      
      c1.setBaseStorageCost(40.00);
      Assert.assertEquals(40.00, c1.getBaseStorageCost(), .0);
      
      CloudStorage.resetCount();
      Assert.assertEquals(0, CloudStorage.getCount());
      
      c1.setServerCost(10.00);
      Assert.assertEquals(10.00, c1.getServerCost(), 10.00);
   
   }
    
     /** tests monthly cost. **/
   @Test public void monthlyCostTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      
      Assert.assertEquals(50.00, c1.monthlyCost(), 0.0);
   
   }
   
   /** tests toString. **/
   @Test public void toStringTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      
      String output = "Cloud One";
      output += " (class DedicatedCloud) Monthly Cost: $50.00\n"  
                  + "Base Storage Cost: $40.00\nServer Cost: $10.00\n";
        
      Assert.assertEquals(output, c1.toString());
   }

}
