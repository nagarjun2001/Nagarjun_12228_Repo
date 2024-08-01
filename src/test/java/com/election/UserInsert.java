package com.election;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class UserInsert {
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
		driver.get("http://localhost:3000/Home");
		driver.findElement(By.id("ucrud")).click();
		driver.findElement(By.id("uadd")).click();
		driver.findElement(By.name("uname")).sendKeys("Prince");
		driver.findElement(By.name("wardno")).sendKeys("55");
		driver.findElement(By.name("voterid")).sendKeys("OIUYT87");
		driver.findElement(By.name("cid")).click();
		driver.findElement(By.xpath("//*[@id=\"viewall\"]/div/form/div[4]/select/option[3]")).click();
		driver.findElement(By.id("sub")).submit();
		driver.switchTo().alert().accept();
		System.out.println("Positive Test Case Passed");
	}

	@Test
	void testInsertFail() throws InterruptedException {
		driver.get("http://localhost:3000/Home");
		driver.findElement(By.id("ucrud")).click();
		driver.findElement(By.id("uadd")).click();
		driver.findElement(By.name("uname")).sendKeys("");
		driver.findElement(By.name("wardno")).sendKeys("55");
		driver.findElement(By.name("voterid")).sendKeys("OIUYT87");
		driver.findElement(By.name("cid")).click();
		driver.findElement(By.xpath("//*[@id=\"viewall\"]/div/form/div[4]/select/option[3]")).click();
		driver.findElement(By.id("sub")).submit();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		System.out.println("Negative Test Case Passed");
	}
}
