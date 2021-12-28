package gitItemNames;

import java.util.concurrent.TimeUnit;

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
		
		gitPractLocator goTo = new gitPractLocator();
		
		String text1 = goTo.item1Loc.getText();
		System.out.println("Item Name : " + text1);
		
		String rate1 = goTo.itemRate1Loc.getText();
		System.out.println("Item Rate : " + rate1);
		
		String text2 = goTo.item2Loc.getText();
		System.out.println("Item Name : " + text2);
			
		String rate2 = goTo.itemRate2Loc.getText();	
		System.out.println("Item Rate : " + rate2);
		
		String text3 = goTo.item3Loc.getText();
		System.out.println("Item Name : " + text3);
			
		String rate3 = goTo.itemRate3Loc.getText();	
		System.out.println("Item Rate : " + rate3);
		
		String text4 = goTo.item4Loc.getText(); System.out.println("Item Name : " + text4);
	  
		String rate4 = goTo.itemRate4Loc.getText(); System.out.println("Item Rate : " + rate4);
		  
	  	String text5 = goTo.item5Loc.getText(); System.out.println("Item Name : " + text5);
		  
		String rate5 = goTo.itemRate5Loc.getText(); System.out.println("Item Rate : " + rate5);
		  
		String text6 = goTo.item6Loc.getText(); System.out.println("Item Name : " +  text6);
		  
		String rate6 = goTo.itemRate6Loc.getText(); System.out.println("Item Rate : "  + rate6);
		 
		
			
	}
	
}
