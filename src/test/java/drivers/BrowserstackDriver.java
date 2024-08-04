package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.AuthConfig;
import config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {

    public AuthConfig authConfig = ConfigFactory.create(AuthConfig.class, System.getProperties());
    public BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class);

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities caps = new MutableCapabilities();

        caps.setCapability("browserstack.user", authConfig.username());
        caps.setCapability("browserstack.key", authConfig.password());

        caps.setCapability("app", config.browserstackApp());

        caps.setCapability("device", config.browserstackDevice());
        caps.setCapability("os_version", config.browserstackPlatform());

        caps.setCapability("project", config.browserstackProject());
        caps.setCapability("build", config.browserstackBuild());
        caps.setCapability("name", config.browserstackName());
        caps.setCapability("language", config.browserstackLanguage());
        caps.setCapability("locale", config.browserstackLocale());

        try {
            return new RemoteWebDriver(
                    new URL(config.browserstackUrl()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}