package com.election;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ConInsert {
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
		driver.findElement(By.id("conadd")).click();
		driver.findElement(By.name("cname")).sendKeys("Kohli");
		driver.findElement(By.name("partyname")).sendKeys("INDIA");
		driver.findElement(By.id("btn")).click();
		driver.switchTo().alert().accept();
		driver.navigate().to("http://localhost:3000/Home");
		System.out.println("Positive Case Success");
	}

}
