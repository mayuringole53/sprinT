package sprinT.utilities;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class WebElementActions {
		public static WebDriver driver;

		public static WebDriver browsers(String browserName) {
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
			return driver;
		}

		public static void clickMe(String locatorType, String locatorValue) {
			Elements.getElement(locatorType, locatorValue).click();
		}

		public static void sendKeysHere(String locatorType, String locatorValue, String keys) {

			Elements.getElement(locatorType, locatorValue).sendKeys(keys);;
		}

}
