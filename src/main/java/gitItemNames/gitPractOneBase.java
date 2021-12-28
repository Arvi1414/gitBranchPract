package gitItemNames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gitPractOneBase {

	static WebDriver driver;
	
	public static WebDriver browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void searchItem() {
		
		gitPractLocator goTo = new gitPractLocator();
		
		goTo.search.sendKeys("Apple Watch");
		
		goTo.submit.click();

	}
	
	public static void getNames() {
		
		List<WebElement> itemNames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		List<WebElement> itemPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
			
		System.out.println(itemNames.size());
		System.out.println(itemPrice.size());
			
		for(int i=0;i<itemNames.size();i++) {
			
			WebElement Name = itemNames.get(i);
			String name = Name.getText();
			
			WebElement Price = itemPrice.get(i);
			String price = Price.getText();
			System.out.println("Item Name : " + name);
			System.out.println("Item Price : " + price);
		}

		 
		
			
	}
	
}
