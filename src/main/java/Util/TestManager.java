package Util;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class TestManager {
    private static volatile AndroidDriver sDriver;

    public static boolean hasInit() {
        return sDriver != null;
    }

    public static synchronized AndroidDriver getDriver() throws MalformedURLException {
        if (sDriver == null) {
            sDriver = new AndroidDriver(new URL(Config.REMOTE_URL), Util.getDesiredCapabilities());
        }
        return sDriver;
    }

    public static void setAndroidDriver(AndroidDriver driver) {
        sDriver = driver;
    }


    public static void reset() {
        if (sDriver != null) {
            sDriver.quit();
        }
        setAndroidDriver(null);
    }


}
