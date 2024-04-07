package QKART_TESTNG;

import org.testng.ITestListener;
import org.testng.ITestResult;




public class ListenerClass implements ITestListener{

    @Override
    public void onTestStart(ITestResult result){
        System.out.println("Test Started: " + result.getName() + " >>Taking Screenshot");
        QKART_Tests.takeScreenshot("STARTED TEST","Test Case Started");
    }


    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName()+  " >>Taking Screenshot");
        QKART_Tests.takeScreenshot("SUCCESS","Test Case Success");
    }


    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test failed: " + result.getName() + " >>Taking Screenshot");
        QKART_Tests.takeScreenshot("FAILURE","Test Case failed");
    }

}