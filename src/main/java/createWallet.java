import Util.Util;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static Util.Constant.MAIN_ACTIVITY;
import static Util.TestManager.getDriver;

public class createWallet{
    private AndroidDriver mDriver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        mDriver = getDriver();
    }

    @AfterClass
    public void tearDown() {
        mDriver.quit();
    }

    @Test
    public void wallet(){
        Util.waitActivity(MAIN_ACTIVITY, 30, mDriver);
        Util.sleep(1);
        MobileElement el1 = (MobileElement) mDriver.findElementByXPath("");
        el1.click();
        MobileElement el2 = (MobileElement) mDriver.findElementByXPath("");
        el2.click();
    }
}