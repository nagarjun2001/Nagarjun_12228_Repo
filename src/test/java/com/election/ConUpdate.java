package com.election;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ConUpdate {
	private WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void testInsert() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("uname")).sendKeys("gowthams");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.id("logbtn")).submit();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("ccrud")).click();
		driver.findElement(By.id("cview")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/table/tbody/tr[2]/td[4]/a")).click();
		driver.findElement(By.name("cname")).sendKeys("Modi");
		driver.findElement(By.name("partyname")).sendKeys("BJP");
		driver.findElement(By.id("ubt")).click();
		driver.switchTo().alert().accept();
		System.out.println("Contestant View Test Case Success");
	}
}
