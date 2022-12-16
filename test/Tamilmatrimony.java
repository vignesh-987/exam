package week3.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tamilmatrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		WebElement profile = driver.findElement(By.id("REGISTERED_BY"));
		Select profileDropDown=new Select(profile);
		profileDropDown.selectByVisibleText("Myself");
		driver.findElement(By.id("NAME")).sendKeys("vignesh");
		driver.findElement(By.xpath("//dd[@class='paddt5']/label[1]")).click();
		WebElement dd = driver.findElement(By.id("DOBDAY"));
		Select ddDropDown =new Select(dd);
		ddDropDown.selectByValue("20");
		WebElement month = driver.findElement(By.id("DOBMONTH"));
		Select monthDropDown=new Select(month);
		monthDropDown.selectByVisibleText("June");
		WebElement year = driver.findElement(By.id("DOBYEAR"));
		Select yearDropDown=new Select(year);
		yearDropDown.selectByValue("2001");
		WebElement religion = driver.findElement(By.id("RELIGION"));
		Select religionDrop=new Select(religion);
		religionDrop.selectByVisibleText("Hindu");
		WebElement lan = driver.findElement(By.id("MOTHERTONGUE"));
		Select lanDrop=new Select(lan);
		lanDrop.selectByVisibleText("Tamil");
		WebElement coun = driver.findElement(By.id("COUNTRY"));
		Select counDrop=new Select(coun);
		counDrop.selectByVisibleText("India");
		WebElement co = driver.findElement(By.id("M_COUNTRYCODE"));
		Select coDrop=new Select(co);
		coDrop.selectByVisibleText("+91");
		driver.findElement(By.id("MOBILENO")).sendKeys("9003893172");
		driver.findElement(By.id("EMAIL")).sendKeys("vignesh.pg01@gmail.com");
		driver.close();
		
		
		
		
				
		
		

	}

}
