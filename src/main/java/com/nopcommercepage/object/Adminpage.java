package com.nopcommercepage.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminpage {
	public WebDriver ldriver;
	public Adminpage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	public Adminpage () {
		
	}
	
	@FindBy (xpath="//input[@id='Email']")
    WebElement Txtemail;
	
	@FindBy (xpath="//input[@id='Password']")
    WebElement Txtpassword;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement logbutton;
	
	public void setusername (String Uname){
		Txtemail.clear();
		Txtemail.sendKeys(Uname);
		
	}
public void setpassword (String upass) {
	
	Txtpassword.clear();
	Txtpassword.sendKeys(upass);
}

public void clicklogin () {
	logbutton.click();
}

}

