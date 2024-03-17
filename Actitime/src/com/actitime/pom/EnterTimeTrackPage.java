package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(id="logoutLink")
	private WebElement logOutbtn;

	@FindBy(id="container_tasks")
	private WebElement taskTab;


	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getLogOutbtn() {
		return logOutbtn;
	}


	public WebElement getTaskTab() {
		return taskTab;
	}


	public void setLogOutbtn() {
		logOutbtn .click();
	}


	public void setTaskTab() {
		taskTab.click();
	}


}
