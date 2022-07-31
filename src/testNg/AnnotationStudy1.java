package testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy1
{
  @Test
  public void MyTest1()
  {
	  Reporter.log("Test method is running ", true);
  }
  @Test
  public void MyTest2()
  {
	  Reporter.log("Test Method is runnning ", true);
  }
  @BeforeMethod
  public void login()
  {
	  Reporter.log("Befor Method is running ", true);
  }
  @AfterMethod
  public void logout()
  {
	  Reporter.log("After Method is running ", true);
  }
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Befor Class is running ", true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("After Class is running ", true);
  }
}
