package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class Utility extends TestBase {
@FindBy(xpath="//a[contains(text(),'Add to cart')]")
private WebElement add_to_cart;

public Utility() {
	PageFactory.initElements(driver, this);
}
public void clickOnAddToCart() {
	add_to_cart.click();
}

public void takeScreenshot() {
	File dest=new File("F:\\Automation\\Eclipse_IDE_2021_12\\Eclipse_Workspace"
			+ "\\MyNewMavenProject\\ScreenShots\\"+System.currentTimeMillis()+".png");
	File sr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(sr, dest);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
}
}
