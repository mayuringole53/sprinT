package sprinT.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
	
public static WebElement getElement(String locatorType, String locatorValue ) {
	WebElement element = null;
	WebDriver driver = WebElementActions.driver;
	if (locatorType.equalsIgnoreCase("css"))
		element = driver.findElement(By.cssSelector(locatorValue));
	else if (locatorType.equalsIgnoreCase("xpath"))
		element = driver.findElement(By.xpath(locatorValue));
	else if (locatorType.equalsIgnoreCase("class"))
		element = driver.findElement(By.className(locatorValue));
	else if (locatorType.equalsIgnoreCase("name"))
		element = driver.findElement(By.name(locatorValue));
	else if (locatorType.equalsIgnoreCase("id"))
		element = driver.findElement(By.id(locatorValue));
	return element;
}
}
