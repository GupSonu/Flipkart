package AutoP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Add_cart extends Search{
	
	@Test
	
	public void Cart () throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		Thread.sleep(3000);
		WebElement search =	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
		search.sendKeys("Shirt");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    Thread.sleep(1000);
	    //selecting the size
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/ul/li[1]")).click();
	// driver.close();
	  //  driver.switchTo().window(tabs.get(0));	
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#container > div > div._2c7YLP.UtUXW0._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div._1YokD2._3Mn1Gg.col-5-12._78xt5Y > div:nth-child(2) > div > ul > li:nth-child(1) > button")).click();
	}    
	    
	
	@Test 
	public void MultiCart() throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		Thread.sleep(3000);
		WebElement search =	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
		search.sendKeys("Trousers");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		//selecting the product
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
		Thread.sleep(1000);
		
		//ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String>it=tabs.iterator();//for()if
		String mainwindow=it.next();
		String childwindow=it.next();
		//String newwindow=it.next();
	
	//	driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(childwindow);
		
		Thread.sleep(500);
	    //selecting the size
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/ul/li[1]")).click();
	    Thread.sleep(1000);

	    //adding to cart
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
	    Thread.sleep(5000);
	   // driver.switchTo().window(tabs.get(2));
	  driver.close();
	  Thread.sleep(1000);
	   //    driver.switchTo().window(tabs.get(0));
	    driver.switchTo().window(mainwindow);
	    //selecting one more product 
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[4]/div/a/div[1]/div/div/div/img")).click();
	//    driver.switchTo().window(tabs.get(1));
	   driver.switchTo().window(childwindow);
	  
	   driver.switchTo().window(childwindow);
  
	
	
	   Thread.sleep(1000);
	  //selecting the size
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/ul/li[2]/a")).click();
	    Thread.sleep(1000);
	   
	    //adding to cart 
	    driver.findElement(By.xpath("<button class=\"_2KpZ6l _2U9uOA _3v1-ww\"><svg class=\"_1KOMV2\" width=\"16\" height=\"16\" viewBox=\"0 0 16 15\" xmlns=\"http://www.w3.org/2000/svg\"><path class=\"\" d=\"M15.32 2.405H4.887C3 2.405 2.46.805 2.46.805L2.257.21C2.208.085 2.083 0 1.946 0H.336C.1 0-.064.24.024.46l.644 1.945L3.11 9.767c.047.137.175.23.32.23h8.418l-.493 1.958H3.768l.002.003c-.017 0-.033-.003-.05-.003-1.06 0-1.92.86-1.92 1.92s.86 1.92 1.92 1.92c.99 0 1.805-.75 1.91-1.712l5.55.076c.12.922.91 1.636 1.867 1.636 1.04 0 1.885-.844 1.885-1.885 0-.866-.584-1.593-1.38-1.814l2.423-8.832c.12-.433-.206-.86-.655-.86\" fill=\"#fff\"></path></svg> Add to cart</button>")).click();
	    Thread.sleep(500);
	    
	  
	    
	    
	
	    
	    
	    
	    
	}
	    
	    
		
		     }
	

