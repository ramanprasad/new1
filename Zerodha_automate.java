package automation_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha_automate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		String ExpectedResult = "Kite - Zerodha's fast and elegant ";
		
		String ACtualResult = driver.getTitle();
		
		if (ACtualResult.equals(ExpectedResult)) {
			System.out.println("Testcase Pass");
		}else {
			System.out.println("Test Case fail");
	}

}}
