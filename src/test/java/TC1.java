import org.testng.annotations.*;

public class TC1 {

    @BeforeClass
    void beforeclass() {
        System.out.println("This is opening before class test");
    }

    @AfterClass
    void afterclass() {
        System.out.println("This is opening after class test");
    }
    @BeforeMethod
    void beforemethod() {
        System.out.println("This is opening before method test");
    }

    @AfterMethod
    void aftermethod() {
        System.out.println("This is opening after method test");
    }

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
