package kiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class UtilityProp 
{
	public static String getDataFromPropertyfile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myfile= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\my_Selenium_project\\MyProperties.properties");
		prop.load(myfile);
		String value = prop.getProperty(key);
		return value;
		
	}
	public static void captureScreenshot(WebDriver driver, String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Selenium\\ScreenshotBySelenium\\myScreenshot"+TCID+".png");
		FileHandler.copy(src, dest);
	}

}
