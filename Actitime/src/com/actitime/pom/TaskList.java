package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;

	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCustomerBtn;

	@FindBy(xpath="//input[@placeholder='Enter Customer Name' ][@class]")
	private WebElement customerNameTbx;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDesTbx;

	@FindBy(xpath="//div[.='- Select Customer -'][@class='emptySelection']")
	private WebElement selectCustomer;

	@FindBy(xpath="//div[.='Big Bang Company'][@class='text']")
	private WebElement bigBangCompany;

	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomerBtn;

	public TaskList(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getCustomerNameTbx() {
		return customerNameTbx;
	}

	public WebElement getCustomerDesTbx() {
		return customerDesTbx;
	}

	public WebElement getSelectCustomer() {
		return selectCustomer;
	}

	public WebElement getBigBangCompany() {
		return bigBangCompany;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public void setAddNewBtn(WebElement addNewBtn) {
		this.addNewBtn = addNewBtn;
	}

	public void setNewCustomerBtn(WebElement newCustomerBtn) {
		this.newCustomerBtn = newCustomerBtn;
	}

	public void setCustomerNameTbx(WebElement customerNameTbx) {
		this.customerNameTbx = customerNameTbx;
	}

	public void setCustomerDesTbx(WebElement customerDesTbx) {
		this.customerDesTbx = customerDesTbx;
	}

	public void setSelectCustomer(WebElement selectCustomer) {
		this.selectCustomer = selectCustomer;
	}

	public void setBigBangCompany(WebElement bigBangCompany) {
		this.bigBangCompany = bigBangCompany;
	}

	public void setCreateCustomerBtn(WebElement createCustomerBtn) {
		this.createCustomerBtn = createCustomerBtn;
	}
}
