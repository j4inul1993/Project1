package GenericCode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pagefactory.MainPageFact;

public class Highlighter {

	public static void gethighlighter(WebDriver driver) {
		
		MainPageFact obj = new MainPageFact(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement user=obj.getGetusername();
		js.executeScript("arguments[0].style.border='5px solid yellow'", user);
		
		WebElement password=obj.getGetpassword();
		js.executeScript("arguments[0].style.border='5px solid yellow'", password);
		
		WebElement button=obj.getGetbutton();
		js.executeScript("arguments[0].style.border='5px solid red'", button);
		
	}
}
