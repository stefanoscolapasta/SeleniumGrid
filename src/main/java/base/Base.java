package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {
    public WebDriver initializeBrowser(final String browserName, final String nodeUrl) throws Exception, MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        Set<String> acceptedBrowsers = new HashSet<String>(Arrays.asList("chrome", "firefox", "edge"));

        if (acceptedBrowsers.contains(browserName)) {
            desiredCapabilities.setBrowserName(browserName);
            desiredCapabilities.setPlatform(Platform.WIN11);
        } else {
            throw new Exception("Browser not supported");
        }

        return new RemoteWebDriver(new URL(nodeUrl), desiredCapabilities);
    }
}
