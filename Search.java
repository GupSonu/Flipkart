package AutoP;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Search{

	@Test
	
	public void Searching() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		Thread.sleep(1000);
		WebElement search =	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
		search.sendKeys("Saree for women");
		search.sendKeys(Keys.ENTER);
		if(driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[1]/div/div/span/span")).isDisplayed())
		{	
		System.out.println("Correct products appearing");
		}
		else
		{
			System.out.println("incorrect products appearing");
		}
	}
		
	
	@Test
	
	public void WrongSearch () throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		Thread.sleep(3000);
		String trueSearch = "Sharee";
		WebElement search =	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
		search.sendKeys("Sharee");
		search.sendKeys(Keys.ENTER);
		String exactSearch = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[1]/div/div/span[1]/span")).getText();
		
		System.out.println(exactSearch);
		Assert.assertNotEquals(trueSearch, exactSearch);
		System.out.println("Test case passed");	
	
	}
	
	@Test
	
	public void SearchwithFilters () throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		Thread.sleep(3000);
		WebElement search =	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
		search.sendKeys("Shirt");
		search.sendKeys(Keys.ENTER);
		
		WebElement filter = driver.findElement(By.xpath("//div[normalize-space()='Price -- High to Low']"));
		filter.click();
		if(filter.isDisplayed())
		{
			System.out.println("Correct filter is selected");
		}
		else
		{
			System.out.println("Incorrect filter is selected ");
		}
	}
	

}
