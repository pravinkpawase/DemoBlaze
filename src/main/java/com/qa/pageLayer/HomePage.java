package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase {
@FindBy(xpath="//a[contains(text(),'Phones')]")
private WebElement phones;
@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
private WebElement samsung_galaxy_s6;
@FindBy(xpath="//a[contains(text(),'Nokia lumia 1520')]")
private WebElement nokia_lumia_1520;
@FindBy(xpath="//abcd[contains(text(),'Nexus 6')]")
private WebElement nexus_6;

public HomePage() {
	PageFactory.initElements(driver,this);
}

public  void clickOnPhones() {
	phones.click();
}
public void clickOnSamsungGalaxyS6() {
	samsung_galaxy_s6.click();
}
public void clickOnNokiaLumia1520() {
	nokia_lumia_1520.click();
}
public void clickOnNexus6() {
	nexus_6.click();
}
}
