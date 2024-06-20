package com.example.locators.java;

import com.example.locators.FindBy;
import com.example.locators.WebElement;

public class HomePageLocators {

	  @FindBy(xpath = "//*[@class='oxd-topbar-header-breadcrumb']/h6")
	  public  WebElement homePageUserName;

}
