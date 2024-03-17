package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {
public static WebDriver driver;
@BeforeClass
public void openBrowser() throws IOException {
	driver=new ChromeDriver();
	Reporter.log("openBrowser",true);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}@AfterClass
public void closeBrowser() {
	Reporter.log("closeBrowser",true);
	driver.close();
}@BeforeMethod
public void login() throws IOException{
	Reporter.log("login",true);
LoginPage l=new LoginPage(driver);
FileLib f=new FileLib();
String url = f.getPropertyData("url");
String un = f.getPropertyData("username");
String pw = f.getPropertyData("password");
driver.get(url);
l.setLogin(un, pw);
}@AfterMethod
public void logout() {
	Reporter.log("logout",true);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setLogOutbtn();
}
}
