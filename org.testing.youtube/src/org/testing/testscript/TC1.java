package org.testing.testscript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.Click;

import net.bytebuddy.implementation.bind.DeclaringTypeResolver;

public class TC1 extends base
{
	ChromeDriver driver;
	@Test
      public void utube() throws InterruptedException
      {
    	  driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']")).click();
    	  driver.findElement(By.id("identifierId")).sendKeys("pankajengg.singh0@gmail.com");
    	  driver.findElement(By.xpath("//span[text()='Next']")).click();
    	  Thread.sleep(2000);
    	  driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("password");
    	  driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
    	  Thread.sleep(2000);
    	  driver.findElement(By.xpath("//span[text()='Trending']")).click();
    	  Thread.sleep(3000);
      }
      
}
