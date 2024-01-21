package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.HomePage;
import pageObject.ResultPage;
import pageObject.ScheduleVaccination;
import util.ConfigUtil;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import constant.FileName;
import constant.Key;

import java.time.Duration;

public class BaseClass {

    public static WebDriver driver; // or we can use protected type, otherwise it is default type
    ConfigUtil config;
    public WebDriverWait wait;
    public static JavascriptExecutor javascriptExecutor;
    
    public static HomePage homePage;
    public static ScheduleVaccination scheduleVaccination;
    public static ResultPage resultPage;
 

    public void setUp() {
        config = new ConfigUtil(FileName.CONFIG_PROPERTIES);
        driver = initDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(config.getPropertyValue(Key.URL));
        // How can we convert a String to Long type
        long pageLoadTime = Long.parseLong(config.getPropertyValue(Key.PAGELOAD_WAIT));
        long explicitlyWait =	Long.parseLong(config.getPropertyValue(Key.EXPLICIT_WAIT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(explicitlyWait));
        wait = new WebDriverWait(driver, Duration.ofSeconds(explicitlyWait));
        javascriptExecutor = (JavascriptExecutor)driver;
        initClasses(driver);
    }

    public WebDriver initDriver () {
        String browserName = config.getPropertyValue(Key.BROWSER);

        switch (browserName) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                options.merge(capabilities);
                
                return new ChromeDriver(options);
                
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case "edge":
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            default:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
        }
    }

    public void initClasses(WebDriver driver) {
    
    	scheduleVaccination = new ScheduleVaccination(driver);
    	resultPage = new ResultPage(driver);
    	homePage = new HomePage(driver);  
    }
    
    // After a test is done, what need to do
    public void tearUp(){
        driver.quit();
    }
}