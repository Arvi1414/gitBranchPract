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
	


}
