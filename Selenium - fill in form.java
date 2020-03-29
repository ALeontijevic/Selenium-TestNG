package DomaciZadaci;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Zadatak_01_0326 {

	public static void main(String[] args) {
		//Koristeci Selenium webdriver otici na sajt 
		//https://www.techlistic.com/p/selenium-practice-form.html i 
		//popuniti formu (idealno celu, ako ne ide onda probajte bar do kontinenta)

		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.techlistic.com/p/selenium-practice-form.html");
		wd.manage().window().maximize();
		WebElement elem = wd.findElement(By.xpath("//input[@name='firstname']"));
		elem.sendKeys("Aleksandra");
		elem = wd.findElement(By.xpath("//input[@type='text'][@name='lastname']"));
		elem.sendKeys("Leontijevic");
		elem = wd.findElement(By.id("sex-1"));
		elem.click();
		elem = wd.findElement(By.cssSelector("input#exp-0"));
		elem.click();
		elem = wd.findElement(By.id("datepicker"));
		elem.sendKeys("28-03-2020");
		elem = wd.findElement(By.id("profession-0"));
		elem.click();
		elem = wd.findElement(By.id("profession-1"));
		elem.click();
		elem=wd.findElement(By.xpath("//input[@id='tool-2']"));
		elem=wd.findElement(By.className("input-xlarge"));
		elem.click();
		elem = wd.findElement(By.xpath("//option[contains(text(),'Europe')]"));
		elem.click();
		elem = wd.findElement(By.xpath("//option[contains(text(),'WebElement Commands')]"));
		elem.click();
		elem = wd.findElement(By.partialLinkText("Click here to Download File"));
		elem.click();
		wd.navigate().back();
		elem = wd.findElement(By.className("button"));
		elem.click();
		
		
		

	}

}
