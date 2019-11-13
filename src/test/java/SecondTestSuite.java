import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestSuite {
    @Test(priority = 1)
    void setup() {
        System.out.println("This is opening browser test");
    }

    @Test(priority = 2)
    void addcustomer()
    {
        System.out.println("This is addcustomer test");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 3)
    void searchcustomer() {
        System.out.println("This is searchcustomer test");
    }


    @Test(priority = 4)
    void teardown() {
        System.out.println("This is closing browser test");
    }

}
