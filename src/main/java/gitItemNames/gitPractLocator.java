package gitItemNames;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class gitPractLocator extends gitPractOneBase{
	
	public gitPractLocator() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement search;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath="(//span[text()='New Apple Watch SE (GPS, 44mm) - Space Grey Aluminium Case with Black Sport Band'])[1]")
	public WebElement item1Loc;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[2]")
	public WebElement itemRate1Loc;
		
	@FindBy(xpath="//span[contains(text(),'Graphite Stainless Steel Case with Black Sport Band')]")
	public WebElement item2Loc;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[3]")
	public WebElement itemRate2Loc;
	
	@FindBy(xpath="(//span[text()='New Apple Watch SE (GPS, 44mm) - Space Grey Aluminium Case with Black Sport Band'])[2]")
	public WebElement item3Loc;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[4]")
	public WebElement itemRate3Loc;
	
	@FindBy(xpath="(//span[contains(text(),'Gold Aluminium Case with Pink Sand Sport Band')])[2]")
	public WebElement item4Loc;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[5]")
	public WebElement itemRate4Loc;
	
	@FindBy(xpath="//span[text()='New Apple Watch SE (GPS, 44mm) - Gold Aluminium Case with Pink Sand Sport Band']")
	public WebElement item5Loc;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[5]")
	public WebElement itemRate5Loc;
	
	@FindBy(xpath="(//span[contains(text(),'Midnight Aluminium Case with Midnight Sport Band - Regular')])[1]")
	public WebElement item6Loc;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[6]")
	public WebElement itemRate6Loc;
	
	@FindBy(xpath="(//span[contains(text(),'Blue Aluminium Case with Abyss Blue Sport Band - Regular')])[1]")
	public WebElement item7Loc;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[7]")
	public WebElement itemRate7Loc;
	
	@FindBy(xpath="(//span[contains(text(),'Space Grey Aluminium Case with Black Sport Band')])[1]")
	public WebElement item8Loc;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[8]")
	public WebElement itemRate8Loc;
	
	@FindBy(xpath="//span[contains(text(),'Silver Aluminium Case with White Sport Band')]")
	public WebElement item9Loc;
	
	@FindBy(xpath="(//span[contains(text(),'Midnight Aluminium Case with Midnight Sport Band - Regular')])[2]")
	public WebElement item10Loc;

}
