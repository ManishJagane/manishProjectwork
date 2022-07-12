package listenerStudy;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.annotations.IListeners;

public class Listener1 implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Congratulation Your TC passed", true);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Screenshot is taken ", true);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TC not Run check depended TC", true);
		
	}
	
	

}
