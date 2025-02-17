import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	String browser;
	public static void main(String args[])
	{
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdevalap\\OneDrive - Capgemini\\Selenium Java\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		System.out.println("Title is: " + driver.getTitle());
		System.out.println("URL is: " + driver.getCurrentUrl());
		driver.quit();
	}
}
