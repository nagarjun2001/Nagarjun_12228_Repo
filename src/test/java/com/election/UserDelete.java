package com.election;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class UserDelete {

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
	void testUserDelete() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("uname")).sendKeys("gowthams");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.id("logbtn")).submit();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("ucrud")).click();
		driver.findElement(By.id("uview")).click();
		
		driver.findElement(By.xpath("//*[@id=\"viewall\"]/div[2]/table/tbody/tr[3]/td[6]/button")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();		
		System.out.println("Delete Test Success!!!");
	}

}
