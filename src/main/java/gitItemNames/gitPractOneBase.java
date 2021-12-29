package gitItemNames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gitPractOneBase {


	public static void main(String[] args) {
		//git upload Amazon Files
		
		String text1="";
		String text2="";
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Apple Watch");
		
		WebElement searchClick = driver.findElement(By.xpath("//input[@type='submit']"));
		searchClick.click();
		
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
