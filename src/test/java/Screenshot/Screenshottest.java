package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Screenshottest {
	public WebDriver WD;
    @org.testng.annotations.Test
    public void openbrowser(){
        WD=new FirefoxDriver();
        WD.manage().window().maximize();
        WD.get("https://www.google.co.in/");
            
    }
    @AfterMethod
    public void teardown() throws IOException {
        // TODO Auto-generated method stub
        File src=((TakesScreenshot)WD).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\Akash\\workspace\\Google\\src\\test\\java\\Screenshot"));
        

            }

}
