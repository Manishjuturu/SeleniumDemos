package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
driver.get("http://demowebshop.tricentis.com/login");
driver.findElement(By.id("Email")).sendKeys("manishjuturu@gmail.com");
driver.findElement(By.name("Password")).sendKeys("manish");
driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

String expectedresult="Webshop";
String actualresult=driver.getTitle();
System.out.println(actualresult);
  
   if(expectedresult.equals(actualresult))
   {
	   System.out.println("correct page");
   }
   else
   {
	   System.out.println("incorrect page");
   }
   driver.findElement(By.linkText("Log out")).click();
   driver.close();
	}

}
