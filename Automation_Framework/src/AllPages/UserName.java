package AllPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserName {
	
	@FindBy (xpath = "//*[@id='Email']")
	
			//@findBy (how = How.xpath, using = "//*[@id='Email'])"
		public WebElement userNameInputField;
	
	
	@FindBy (xpath = "//*[@id='next']")
	public WebElement nextButton;
	
	
	
public WebElement getuserNameInputField(){
		
		return userNameInputField;
	}
	
	
	
	public WebElement getNexButton(){
		
		return nextButton;
	}
			
			

	
	
	
	

}
