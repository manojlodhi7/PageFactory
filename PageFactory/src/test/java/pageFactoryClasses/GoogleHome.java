package pageFactoryClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GoogleHome {
	
	public GoogleHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")
	static
	WebElement searchInput;

	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")
	static
	WebElement googleSearchBtn;
	
	
	public void clearSearchInput() {
		searchInput.clear();
	}
	
	public void enterSearchValue(String input) {
		searchInput.sendKeys(input);
	}
	
	public void clickSearchBtn() {
		googleSearchBtn.click();
	}


	
	}
