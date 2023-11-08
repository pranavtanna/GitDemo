package org.rahulshettyacademy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.rahulshettyacademy.TestUtils.IOSBaseTest;
import org.rahulshettyacademy.pageObjects.ios.AlertViews;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSBasics extends IOSBaseTest{

	
	@Test
	public void IOSBasicsTest()
	{
		//Xpath, classname, IOS, iosClassCHain, IOSPredicateString, accessibility id, id
		
		AlertViews alertViews = homePage.selectAlertViews();
		alertViews.fillTextLabel("hello");
		String actualMessage = alertViews.getConfirmMessage();
		AssertJUnit.assertEquals(actualMessage, "A message should be a short, complete sentence.");
	}
	
	//This code is for practicing Git commands
		public void GitDemo()
		{
			System.out.println("hi practicing git commands");
			System.out.println("Practice going good");
			System.out.println("Done with the practice");
		}
}
