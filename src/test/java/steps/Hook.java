package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.concurrent.TimeUnit;
import java.util.Properties;


public class Hook extends BaseUtil{

    public static Properties prop = new Properties();
    static InputStream input = null;
    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() throws Exception {
        String localDir = System.getProperty("user.dir");
        input = new FileInputStream(localDir + "/config.properties");
        prop.load(input);
        String browser = prop.getProperty("BROWSER_TYPE");
        //System.out.println("Opening the browser : Chrome");
        /*System.setProperty("webdriver.firefox.marionette", "D:\\Libs\\geckodriver.exe");
        base.Driver = new FirefoxDriver();*/

        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Opening the browser :"+ browser);
            String Path = localDir + "/" + getChromeDriverPath();
            System.setProperty("webdriver.chrome.driver",Path);
            base.Driver = new ChromeDriver();
            base.Driver.manage().window().maximize();
            base.Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        else {
            throw new Exception("Browser is not supported");
        }
/*
        try{
            //Chrome driver
            System.setProperty("webdriver.chrome.driver", localDir + "/chromedriver");
            base.Driver = new ChromeDriver();
            base.Driver.manage().window().maximize();
            base.Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        } catch(Exception e){
            e.printStackTrace();
        } */

    }

    public static String getChromeDriverPath() {
        String OS = System.getProperty("os.name");
        if (OS.contains("Window")) {
            return "libs/chromedriver_windows.exe";
        } else if (OS.contains("Mac")) {
            return "libs/chromedriver_mac";
        } else {
            return "libs/chromedriver";
        }
    }


    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser");
        base.Driver.quit();
    }

}
