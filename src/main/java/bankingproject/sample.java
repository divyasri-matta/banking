package bankingproject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class sample {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		WebElement ele = driver.findElement(By.xpath("//button[text()='Bank Manager Login']"));
		ele.click();
		WebElement ele2= driver.findElement(By.xpath("//button[@ng-class=\"btnClass1\"]"));
		ele2.click();
		WebElement ele3=driver.findElement(By.xpath("//input[@ng-model='fName']"));
		ele3.sendKeys("Matta");
		WebElement ele4=driver.findElement(By.xpath("//input[@ng-model='lName']"));
		ele4.sendKeys("Divya");
		WebElement ele5=driver.findElement(By.xpath("//input[@ng-model='postCd']"));
		ele5.sendKeys("123456");
		WebElement ele6=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	    ele6.click();
	    driver.switchTo().alert().accept();
	    WebElement ele7=driver.findElement(By.xpath("//button[@ng-click='openAccount()']"));
	    ele7.click();
	    WebElement testDropdown=driver.findElement(By.id("userSelect"));
	    Select dropdown = new Select(testDropdown); 
	     dropdown.selectByIndex(6);
	     WebElement testDropdown1=driver.findElement(By.id("currency"));
	     Select dropdown1 =new Select(testDropdown1);
	     dropdown1.selectByIndex(1);
	     WebElement ele8=driver.findElement(By.xpath("//button[@type='submit']"));
	     ele8.click();
	     driver.switchTo().alert().accept();
	     WebElement testDropdown2=driver.findElement(By.id("userSelect"));
		    Select dropdown2 = new Select(testDropdown); 
		     dropdown.selectByIndex(6);
		     WebElement testDropdown3=driver.findElement(By.id("currency"));
		     Select dropdown3 =new Select(testDropdown1);
	     dropdown1.selectByIndex(2);
	     WebElement ele9=driver.findElement(By.xpath("//button[@type='submit']"));
	     ele9.click();
	     driver.switchTo().alert().accept();
	     WebElement testDropdown4=driver.findElement(By.id("userSelect"));
		    Select dropdown4 = new Select(testDropdown); 
		     dropdown.selectByIndex(6);
		     WebElement testDropdown5=driver.findElement(By.id("currency"));
		     Select dropdown5 =new Select(testDropdown1);
	     dropdown1.selectByIndex(3);
	     WebElement ele10=driver.findElement(By.xpath("//button[@type='submit']"));
	     ele10.click();
	     driver.switchTo().alert().accept();
	     WebElement ele11=driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
	     ele11.click();
	     Thread.sleep(1000);
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,800)","");
	     
		
	}


	
	
	
	}
	

