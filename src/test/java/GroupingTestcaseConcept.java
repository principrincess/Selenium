import org.testng.annotations.Test;

public class GroupingTestcaseConcept {
    @Test(groups = {"sanity"})
    void setup()
    {
        System.out.println("This is opening browser test");
    }
    @Test(groups = {"sanity"})
    void login()
    {
        System.out.println("This is login test");
    }
    @Test(groups = {"regression"})
    void teardown()
    {
        System.out.println("This is closing browser test");
    }
    @Test(groups = {"sanity","regression"})
    void test5()
    {
        System.out.println("This is test5");
    }
}
