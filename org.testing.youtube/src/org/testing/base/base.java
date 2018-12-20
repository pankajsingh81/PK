package org.testing.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base 
{
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void init()
	{
		System.setProperty("webdriver.chrom.driver", "D:\\selenium\\jar_files\\chrome\\ChromeDriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		File file=new File("C:\\Use\\rs\\Pankaj Singh\\workspace\\org.testing.youtube\\NG.property");
		FileInputStream fi= new FileInputStream(f);
		pr= new Properties();
		pr.load(fi);
	}
	@AfterMethod
	public void tear_down()
	{
		
	}

}
