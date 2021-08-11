package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageFact{

	public MainPageFact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy (xpath="//*[contains(@class,'input')]")
private WebElement getusername;

@FindBy (xpath="(//*[contains(@class,'input')])[2]")
private WebElement getpassword;

@FindBy (xpath="(//*[contains(@class,'button')])[2]")
private WebElement getbutton;

@FindBy (xpath="//*[contains(text(),'Transfer Funds')]")
private WebElement getfundtransfer;

@FindBy (xpath="//*[contains(@id,'amount')]")
private WebElement getamount;

@FindBy (xpath="//*[contains(@type,'submit')]")
private WebElement getsubmit;

public WebElement getGetusername() {
	return getusername;
}

public WebElement getGetpassword() {
	return getpassword;
}

public WebElement getGetbutton() {
	return getbutton;
}

public WebElement getGetfundtransfer() {
	return getfundtransfer;
}

public WebElement getGetamount() {
	return getamount;
}

public WebElement getGetsubmit() {
	return getsubmit;
}
}




