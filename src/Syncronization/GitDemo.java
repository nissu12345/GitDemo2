package Syncronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitDemo {

	public static void main(String[] args) {



System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
driver.get("htpps://fb.com");

System.out.println("hii there");
	}

}
