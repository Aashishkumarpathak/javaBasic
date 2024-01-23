import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenGoogle {
    public static void main(String[] args) throws Exception {
		 // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Learn\\Learn\\selenium-java-4.16.1\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the web page
        driver.get("https://www.google.com"); // Replace with the URL of the web page you want to scrape

        // Find all the anchor elements on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Iterate over each link and print its address
        for (WebElement link : links) {
            String href = link.getAttribute("href");
            if (href != null && href.contains("angler_construction/job")) {
                System.out.println(href);
            }
        }

        // Close the browser
        driver.quit();
	}
}
