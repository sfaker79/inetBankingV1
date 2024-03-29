package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	WebElement lnkAddNewCustomer;

	@CacheLookup
	@FindBy(how = How.NAME, using = "name")
	WebElement txtCustomerName;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "rad1")
	WebElement rdGender;

	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	WebElement txtdob;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "addr")
	WebElement txtaddress;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "city")
	WebElement txtcity;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "state")
	WebElement txtstate;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "pinno")
	WebElement txtpinno;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement txttelephoneno;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "emailid")
	WebElement txtemailid;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "password")
	WebElement txtpassword;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "sub")
	WebElement btnSubmit;
	
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
	}
	
	public void custname(String cname) {
		txtCustomerName.sendKeys(cname);
	}
	
	public void custgender(String cgender) {
		rdGender.click();
	}
	
	public void custdob(String mm, String dd, String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}
	
	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}
	
	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}
	
	public void custpinno(String cpinno) {
		txtpinno.sendKeys(String.valueOf(cpinno));
	}
	
	public void custtelephoneno(String ctelephoneno) {
		txttelephoneno.sendKeys(String.valueOf(ctelephoneno));
	}
	
	public void custemailid(String cemailid) {
		txtemailid.sendKeys(cemailid);
	}
	
	public void custpassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}
	
	public void custsubmit() {
		btnSubmit.click();
	}
}
