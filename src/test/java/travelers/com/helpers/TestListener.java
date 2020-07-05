package travelers.com.helpers;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static travelers.com.helpers.DriverFactory.getDriver;

public class TestListener implements ITestListener {


        @Override
        public void onTestStart(ITestResult result){
            System.out.println("On test start");
        }

        @Override
        public void onTestSuccess(ITestResult result){
            System.out.println("On test success");
        }

        @Override
        public void onTestFailure(ITestResult result) {

            try {
                System.out.println("On test failure");
                SeleniumHelper.takeScreenShot(DriverFactory.getDriver(DriverType.CHROME));
            } catch (IOException | NoSuchDriverExeption e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onTestSkipped(ITestResult result) {
            System.out.println("On test skipped");
        }

        @Override
        public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
            System.out.println("on Test Failed But Within Success Percentage ");
        }

        @Override
        public void onStart(ITestContext context) {
            System.out.println("On start");
        }

        @Override
        public void onFinish(ITestContext context) {
            System.out.println("On finish");
        }




}
