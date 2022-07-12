package kiteUtility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import net.bytebuddy.implementation.attribute.AnnotationAppender.Target.OnMethod;


public class listener2 extends UtilityPropListener implements ITestListener 
{
	@Override
	public void onTestSuccess(ITestResult result) {
	Reporter.log("TC is Passed name of TC is "+ result.getName(),true);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String TCname = result.getName();
		Reporter.log("Failed TC Name is "+result.getName(), true);
		try {
			captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
