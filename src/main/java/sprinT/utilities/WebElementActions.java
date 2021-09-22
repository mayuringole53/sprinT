package sprinT.utilities;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class WebElementActions {
	public static WebDriver driver;

	/**
	 * This method will open a specified browser Please give browser name as :
	 * "Chrome" , "Firefox"
	 * 
	 * @param browserName
	 * @return driver
	 */
	public static void browsers(String browserName, String url) {
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		default:
			break;
		}
		driver.manage().window().maximize();
		driver.get(url);
	}

	/**
	 * This method will click on Weblement
	 * 
	 * @param locatorType
	 * @param locatorValue
	 */
	public static void clickMe(String locatorType, String locatorValue) {
		Elements.getElement(locatorType, locatorValue).click();
	}

	/**
	 * This method will give input to text fields
	 * 
	 * @param locatorType
	 * @param locatorValue
	 * @param keys
	 */
	public static void sendKeysHere(String locatorType, String locatorValue, String keys) {
		Elements.getElement(locatorType, locatorValue).sendKeys(keys);
	}

	private void saveScreenShot(BufferedImage image) throws IOException {
		String dir = System.getProperty("user.dir");
		SimpleDateFormat simpleDate = new SimpleDateFormat("DDMMYY_hhmmss");
		String dateTime = simpleDate.format(new Date());
		String screenShotPath = dir + "/ScreenShots/screenshot.jpg" + dateTime;
		ImageIO.write(image, "jpg", new File(screenShotPath));
	}

	/**
	 * This method will take Full page ScreenShot
	 * 
	 * @throws IOException
	 */
	public void takeFullPageScreenShot() throws IOException {
		AShot ss = new AShot();
		BufferedImage img = ss.shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(driver)
				.getImage();
		saveScreenShot(img);
	}

	/**
	 * This method will take ScreenShot
	 * 
	 * @throws IOException
	 */
	public void takeScreenShot() throws IOException {
		AShot ss = new AShot();
		BufferedImage img = ss.takeScreenshot(driver).getImage();
		saveScreenShot(img);
	}

	/**
	 * This method will take ScreenShot of a given WebElement
	 * 
	 * @param element
	 * @throws IOException
	 */
	public void takeScreenShotOfElement(WebElement element) throws IOException {
		AShot ss = new AShot();
		BufferedImage img = ss.shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(driver)
				.getImage();
		ss.takeScreenshot(driver, element);
		saveScreenShot(img);
	}

	/**
	 * This method will take ScreenShot of a given WebElement
	 * 
	 * @param element
	 * @throws IOException
	 */
	public void takeScreenShotOfElement(String locatorType, String locatorValue) throws IOException {
		WebElement element = Elements.getElement(locatorType, locatorValue);
		AShot ss = new AShot();
		BufferedImage img = ss.shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(driver)
				.getImage();
		ss.takeScreenshot(driver, element);
		saveScreenShot(img);
	}

	/**
	 * This method will select a value from a DropDownList
	 * 
	 * @param element
	 * @param value
	 */
	public void selectValueFromDropDownList(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * This method will select a value from a DropDownList
	 * 
	 * @param locatorType
	 * @param locatorValue
	 * @param value
	 */
	public void selectValueFromDropDownList(String locatorType, String locatorValue, String value) {
		WebElement element = Elements.getElement(locatorType, locatorValue);
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void verifyTitle(String expectedTitle) {
		Assert.assertEquals(driver.getTitle(), expectedTitle, "Title not matched !");
	}

}