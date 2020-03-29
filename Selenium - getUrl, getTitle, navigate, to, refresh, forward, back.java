package DomaciZadaci;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_01_0227 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://itbootcamp.rs/");
		Dimension d = new Dimension(480, 529);
		dr.manage().window().maximize();
		System.out.println(dr.getTitle());
		System.out.println(dr.getTitle().length());
		WebElement elem = dr.findElement(By.className("open-search"));
		elem.click();
		elem = dr.findElement(By.className("form-control"));
		elem.click();
		elem.sendKeys("kurs beograd");
		elem.sendKeys(Keys.ENTER);
		System.out.println(dr.getCurrentUrl());
		dr.navigate().back();
		dr.navigate().refresh();
		dr.navigate().forward();
		dr.manage().window().setSize(d);
		dr.close();
	}
}
