package Curs12;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		Log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Log.info("++++++ End of test case : +++++++++" +result.getMethod().getMethodName() + "++++++++++++++++++++++");
		Log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		String timeStamp =  new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("End time : " + timeStamp);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Log.error("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Log.error("++++++ Failed test case : +++++++++" +result.getMethod().getMethodName() + "++++++++++++++++++++++");
		Log.error("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		String timeStamp =  new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.error("Fail time : " + timeStamp);
		Log.error(result.getThrowable().toString());
	}

	@Override
	public void onTestStart(ITestResult result) {
		Log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Log.info("++++++ Start of test case : +++++++++" +result.getMethod().getMethodName() + "++++++++++++++++++++++");
		Log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		String timeStamp =  new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("Start time : " + timeStamp);
	}
	
	

}
