package week3.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/'");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("vignesh");
		driver.findElement(By.name("lastname")).sendKeys("p");
		driver.findElement(By.name("reg_email__")).sendKeys("vignesh.pg01@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Vignesh987@");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vignesh.pg01@gmail.com");
		WebElement date = driver.findElement(By.id("day"));
		Select dateDropDown=new Select(date);
		dateDropDown.selectByValue("16");
		WebElement month = driver.findElement(By.id("month"));
		Select monthDropDown=new Select(month);
		monthDropDown.selectByVisibleText("Dec");
		WebElement year = driver.findElement(By.id("year"));
		Select yearDropDown=new Select(year);
		yearDropDown.selectByValue("2022");
		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[2]")).click();		
		driver.close();
		
		
		
		
		
		

	}

}
