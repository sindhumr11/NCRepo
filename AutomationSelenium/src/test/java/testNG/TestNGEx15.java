package testNG;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class TestNGEx15 implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test method started" + result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test method succesed"+ result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test method failed" + result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println( "test method skipped " + result.getName());
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName());
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test method finshed" + context.getName());
	}
}
