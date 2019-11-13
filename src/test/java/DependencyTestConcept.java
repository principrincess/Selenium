import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestConcept {
    @Test(priority = 1)
    void setup()
    {
        System.out.println("This is opening browser test");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"setup"})
    void login()
    {
        System.out.println("This is login test");
    }

    @Test(dependsOnMethods = {"setup","login"},alwaysRun = true)
    void teardown()
            {
        System.out.println("This is closing browser test");
    }

}
