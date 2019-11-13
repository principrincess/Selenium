import org.testng.annotations.Test;

public class TestSuite {

    @Test(priority = 1)
    void setup() {
        System.out.println("This is opening browser test");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    void teardown() {
        System.out.println("This is closing browser test");
    }

}
