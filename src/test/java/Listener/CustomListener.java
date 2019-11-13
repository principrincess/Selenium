package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    //this belongs to TestListeners and will execute before starting of test set
    public void onStart(ITestContext arg){
        System.out.println("start test execution..."+arg.getName());
    }

    //this belongs to TestListeners and will execute after starting of test set
    public void onFinish(ITestContext arg){
        System.out.println("start test execution..."+arg.getName());
    }

    //this belongs to TestListeners and will execute before the main test start i.e. @Test
    public void onTestStart(ITestResult arg0) {
        System.out.println("start test execution..." + arg0.getName());
    }
    //this belongs to TestListeners and will execute when a test is skipped
    public void onTestSkipped(ITestResult arg0) {
        System.out.println("start test execution..." + arg0.getName());
    }
    //this belongs to TestListeners and will execute when a test is pass
    public void onTestSuccess(ITestResult arg0) {
        System.out.println("start test execution..." + arg0.getName());
    }
    //this belongs to TestListeners and will execute when the test is fail
    public void onTestFailure(ITestResult arg0) {
        System.out.println("start test execution..." + arg0.getName());
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0){

    }
}
