package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;

public class HomePageTest extends HomePage {

	@Test
	public void verifySamsungGalaxyS6() {
		h.clickOnPhones();
		h.clickOnSamsungGalaxyS6();
		util.clickOnAddToCart();
	}
	@Test
	public void verifyNokiaLumia1520() {
		h.clickOnPhones();
		h.clickOnNokiaLumia1520();
		util.clickOnAddToCart();
	}
	@Test
	public void verifyNexus6() {
		h.clickOnPhones();
		h.clickOnNexus6();
		util.clickOnAddToCart();
	}
}
