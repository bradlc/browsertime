package net.browsertime.tool.webdriver;

import net.browsertime.tool.BrowserConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class InternetExplorerDriverProvider extends WebDriverProvider {
    public InternetExplorerDriverProvider(Map<BrowserConfig, String> browserConfiguration) {
        super(browserConfiguration);
    }

    @Override
    public WebDriver get() {
        DesiredCapabilities capabilities = createCapabilities();
        capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        return new InternetExplorerDriver(capabilities);
    }

    @Override
    protected DesiredCapabilities getBrowserCapabilities() {
        return DesiredCapabilities.internetExplorer();
    }
}