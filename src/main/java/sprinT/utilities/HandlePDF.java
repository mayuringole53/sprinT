package sprinT.utilities;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import loggerlogall.DataLogger;

public class HandlePDF extends WebElementActions {
	static Logger l = DataLogger.l;

	/**
	 * get the total number of pages in the pdf document
	 * 
	 * @param doc
	 * @return
	 */
	private static int getPageCount(PDDocument doc) {
		int pageCount = doc.getNumberOfPages();
		return pageCount;

	}

	/**
	 * get the total number of pages in the pdf document using URL
	 * 
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public static int getPageCountUsingURL(String url) throws IOException {
		URL pdfUrl = new URL(url);
		InputStream in = pdfUrl.openStream();
		BufferedInputStream bf = new BufferedInputStream(in);
		PDDocument doc = PDDocument.load(bf);
		int numberOfPages = getPageCount(doc);
		l.info("The total number of pages " + numberOfPages);
		return numberOfPages;
	}

	public static void testVerifyPDFInURL() {
		String getURL = driver.getCurrentUrl();
		Assert.assertTrue(getURL.contains(".pdf"));
	}
	
	public static void setUpForDownload() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shalini\\Downloads\\Driver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.prompt_for_download", false);
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	}

	/**
	 * It is used to PDF file download.
	 * 
	 * @param url
	 * @param locatorType
	 * @param locatorValue
	 */
	public static void downloadPdf(String url, String locatorType, String locatorValue) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		WebElement element = Elements.getElement(locatorType, locatorValue);
		element.click();
	}
}
