package BancoInter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AutBancoInter {

	WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage() .window() .maximize();
		driver.get("https://inter.co/");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testaberturadecontabancointer() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button")).click();
			Thread.sleep(3000);
		driver.findElement(By.xpath("//input [1]")) .sendKeys("Welliton Dourado");
			Thread.sleep(3000);
		driver.findElement(By.id ("phone")) .sendKeys ("61993768127");
			Thread.sleep(3000);
		driver.findElement(By.id ("email"))	.sendKeys("dourado452@gmail.com");
			Thread.sleep(3000);
		driver.findElement(By.id("socialId")) .sendKeys("382.577.950-54");	
			Thread.sleep(3000);
		driver.findElement(By.id ("dateOfBirth")) .sendKeys("06071995");
			Thread.sleep(3000);
	//body > div.sc-dILkzW.jmczzn > div.sc-hUheUT.eReyjh > div > form > button
	driver.findElement(By.cssSelector("body > div.sc-dILkzW.jmczzn > div.sc-hUheUT.eReyjh > div > form > div.sc-jNDflC.RXypR > label")) .click();
	driver.findElement(By.xpath("(//button)[9]")) .click();
	String texto = driver.findElement(By.cssSelector("body > div.sc-dILkzW.jmczzn > div.sc-hUheUT.eReyjh > div > h2")) .getText();
	assertEquals("Abra agora sua Conta Digital", texto);
	System.out.println("valor da variavel texto : " + texto);
	
	}

}
