package omayo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class omayoWebsite {

	public static void main(String[] args) throws InterruptedException {
		Select s;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\OneDrive\\Documents\\Software Automation Testing\\Browser Extension\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
				
		//URL
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		//Home
		driver.findElement(By.id("home")).click();
		Thread.sleep(2000);
		
		//Blogs
		driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[1]/a/span")).click();
		Thread.sleep(2000);
		
		//navigate back to home page
		driver.navigate().back();
				
		//hyperlink
		driver.findElement(By.id("selenium143")).click();
		Thread.sleep(2000);
		
		String MainWindow=driver.getWindowHandle();
		 //TO handle all new opened window
		 Set<String> s1=driver.getWindowHandles();
		 Iterator<String> i1=s1.iterator();
		 
		 while(i1.hasNext()) {
			 String ChildWindow=i1.next();
			 if(!MainWindow.equalsIgnoreCase(ChildWindow))
			 {
				 //switching to Child window
				 driver.switchTo().window(ChildWindow);
				 				 
				 //closing the child window.
				 driver.close();
			 }
			 }
		 //Switching to Parent Window i.e., Main window.
		 driver.switchTo().window(MainWindow);
		 Thread.sleep(2000);
		 
		 //Multi Selection Box
		 driver.findElement(By.id("multiselect1")).click();
		 Thread.sleep(2000);
		 
		 //Old Letters- dropdown
		 s= new Select(driver.findElement(By.id("drop1")));
		 s.selectByValue("def");
		 Thread.sleep(2000);
		 
		 //Page One
		 driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div/div/div/h3/a")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
		 //home hyperlink
		 driver.findElement(By.xpath("//*[@id=\"blog-pager\"]/a")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
		 //Posts (atom)
		 driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[4]/div/a")).click();
		 Thread.sleep(2000);
		 String MainWindow1=driver.getWindowHandle();
		 //TO handle all new opened window
		 Set<String> s2=driver.getWindowHandles();
		 Iterator<String> i2=s2.iterator();
		 
		 while(i1.hasNext()) {
			 String ChildWindow=i2.next();
			 if(!MainWindow1.equalsIgnoreCase(ChildWindow))
			 {
				 //switching to Child window
				 driver.switchTo().window(ChildWindow);
				 				 
				 //closing the child window.
				 driver.close();
			 }
			 }
		 //Switching to Parent Window i.e., Main window.
		 driver.switchTo().window(MainWindow1);
		 Thread.sleep(2000);
		 
		 //Text Area field
		 driver.findElement(By.id("ta1")).sendKeys("This is a sample text in Page One");
		 Thread.sleep(2000);
		 
		 //Search this blog
		 driver.findElement(By.name("q")).sendKeys("Selenium143");
		 Thread.sleep(2000);
		 
		 //Search
		 driver.findElement(By.xpath("//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[2]/input")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
		//Scroll
		//Step1:Create object of JavaScriptExecutor
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		Thread.sleep(2000);
		//Scrolling by pixel
		js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(2000);
	    
	    //Selenium143
	    driver.findElement(By.id("link1")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    //Text box with pre loaded text
	    driver.findElement(By.name("fname")).clear();
	    driver.findElement(By.name("fname")).sendKeys("Dayana");
	    Thread.sleep(2000);
	    
	    //Selenium Tutorial
	    driver.findElement(By.id("link2")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    //Enabled Button
	    driver.findElement(By.id("but2")).click();
	    Thread.sleep(2000);
	    
	    //Buttons with same name attribute values
	    driver.findElement(By.name("samename")).click();
	    Thread.sleep(2000);
	    
	    //Text area field two
	    driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[1]/textarea")).sendKeys("This is text area field two, which is displaying, cat is playing in the garden.");
	    Thread.sleep(2000);
	    
	    //Radio Options
	    driver.findElement(By.id("radio1")).click();
	    Thread.sleep(2000);
	    
	    //Alert Demo
	    driver.findElement(By.id("alert1")).click();
	    Thread.sleep(2000);
	    //simple alert
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    
	    
	    //By default selected check box option
	    driver.findElement(By.id("checkbox2")).click();
	    Thread.sleep(2000);
	    
	    //Read only text box
	    driver.findElement(By.id("rotb")).click();
	    Thread.sleep(2000);
	    
	    //Get Prompt
	    driver.findElement(By.id("prompt")).click();
	    Thread.sleep(2000);
	     Alert alert=driver.switchTo().alert();
	     Thread.sleep(2000);
	     alert.sendKeys("Dayana");
	     Thread.sleep(2000);
	     alert.accept();
	     Thread.sleep(2000);
	     	     
	     //Confirmation Dialog
	     driver.findElement(By.id("confirm")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().dismiss();
		 Thread.sleep(2000);
	    
	    //HTML form
	    //username
	    driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[1]")).sendKeys("Dayana");
	    Thread.sleep(2000);
	    //password
	    driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[2]")).sendKeys("******");
	    Thread.sleep(2000);
	    //login button
	    driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/button")).click();
	    Thread.sleep(2000);
	    
	    //Locate using Name Attribute
	    driver.findElement(By.name("textboxn")).sendKeys("Prompt");
	    Thread.sleep(2000);
	    
	    //Other sites to Practice Automation
	    driver.findElement(By.xpath("//*[@id=\"LinkList1\"]/div/ul/li[1]")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    //Having same id and name attribute values
	    driver.findElement(By.id("sa")).click();
	    Thread.sleep(2000);
	    
	    //Locate Using Class
	    driver.findElement(By.xpath("//*[@id=\"HTML24\"]/div[1]/input")).sendKeys("Class");
	    Thread.sleep(2000);
	    
	    //element having same class name of above field
	    driver.findElement(By.xpath("//*[@id=\"HTML28\"]/div[1]/input")).sendKeys("Class");
	    Thread.sleep(2000);
	    
	    //Select a vehicle
	    driver.findElement(By.name("vehicle")).click();
	    Thread.sleep(2000);
	    
	    //Display for time and disappear
	    driver.findElement(By.id("alert2")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    
	    //PopUp Window
	    driver.findElement(By.xpath("//*[@id=\"HTML37\"]/div[1]/p/a")).click();
	    Thread.sleep(2000);
	    String MainWindow2=driver.getWindowHandle();
		 
		 //TO handle all new opened window
		 Set<String> s3=driver.getWindowHandles();
		 Iterator<String> i3=s3.iterator();
		 
		 while(i1.hasNext()) {
			 String ChildWindow=i3.next();
			 if(!MainWindow.equalsIgnoreCase(ChildWindow))
			 {
				 //switching to Child window
				 driver.switchTo().window(ChildWindow);
				 
				 //closing the child window.
				 driver.close();
			 }
			 }
		 //Switching to Parent Window i.e., Main window.
		 driver.switchTo().window(MainWindow2);
		 Thread.sleep(2000);
	    
		 //Time enable button
		 driver.findElement(By.id("timerButton")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept(); 
		 Thread.sleep(2000);
		 
		 //Disable enabled button
		 driver.findElement(By.xpath("//*[@id=\"HTML44\"]/div[1]")).click();
		 Thread.sleep(2000);
		 
		 //Try it button
		 driver.findElement(By.xpath("//*[@id=\"HTML44\"]/div[1]/button[2]")).click();
		 Thread.sleep(2000);
		
		 //Double click here button
		 Actions a=new Actions(driver);
		 WebElement ele= driver.findElement(By.xpath("//*[@id=\"HTML46\"]/div[1]/button"));
		 a.doubleClick(ele).perform();
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000); 
		 
		 //Check this button
		 driver.findElement(By.xpath("//*[@id=\"HTML47\"]/div[1]/button")).click();
		 Thread.sleep(10000);
		 
		 //Mr.option check box
		 driver.findElement(By.xpath("//*[@id=\"dte\"]")).click();
		 Thread.sleep(2000);
		 
		 //Simple Login Page
		 //Username
		 driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[1]")).sendKeys("Abc");
		 Thread.sleep(2000);
		 
		 //Password
		 driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[2]")).sendKeys("******");
		 Thread.sleep(2000);
		 
		 //Login button
		 driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[3]")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 
		 //Cancel Button
		 driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[4]")).click();
		 Thread.sleep(2000);
		 
		 //Select Multiple options
		 driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[3]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[4]")).click();
		 Thread.sleep(2000);
		 
		 //Test double click
		 Actions b=new Actions(driver);
		 WebElement elem= driver.findElement(By.xpath("//*[@id=\"HTML46\"]/div[1]/button"));
		 b.doubleClick(elem).perform();
		 Thread.sleep(2000);
		 
		  
	}

}
