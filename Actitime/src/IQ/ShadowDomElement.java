package IQ;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("chrome://settings/appearance");
		SearchContext p1 = driver.findElement(By.tagName("settings-ui")).getShadowRoot();
		 SearchContext p2 = p1.findElement(By.id("main")).getShadowRoot();
		 p2.findElement(by.)
	}

}

}
