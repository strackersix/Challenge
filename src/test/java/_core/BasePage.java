package _core;

import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

public class BasePage extends DriverFactory implements  Constantes{

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	public BasePage() {

		PageFactory.initElements(driver, this);
	}

	public void click (WebElement element) {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(element)).click();
		}
	}
	
	public void sendKeys (WebElement element, String text) {
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
		}		
	}
	
	public String getText(WebElement element) {
		
		wait.until(ExpectedConditions.visibilityOf(element)).getText();
		return element.getText();
	}

	public String getTextAttribute(WebElement element, String text) {

		wait.until(ExpectedConditions.visibilityOf(element)).getAttribute(text);
		return element.getAttribute(text);
	}

	public void esperaExplicita(){

		try {
			Thread.sleep(milMilleSeconds);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public void takeScreenShot(){

		esperaExplicita();
		Allure.addAttachment("screenshotClick", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
	}
}
