package testNGlistener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
  {
	
    @Override
    public void onTestFailure(ITestResult result) {
    	Reporter.log("tc is failed,screenshot taken",true);
    	ITestListener.super.onTestFailure(result);
    }
    @Override
    public void onTestSuccess(ITestResult result) {
    	Reporter.log("tc is success",true);
    	ITestListener.super.onTestSuccess(result);
    }
    @Override
    public void onTestSkipped(ITestResult result) {
    	Reporter.log("tc is skipped,please check dependant TC",true);
    	ITestListener.super.onTestSkipped(result);
    }

  }
