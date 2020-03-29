package DomaciZadaci;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_01_0327 {

	public static void main(String[] args) {
		// Pomocu jave i selenijuma
		// 1) otici na sajt youtube
		// 2) u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
		// voditi racuna da ako postoje reklame da ih preskocite

		// Dodatni zadatak
		// Nakon sto je pustena pesma, iz liste sa desne strane (watch next) pustiti
		// drugi predlozen video

		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.navigate().to("https://www.youtube.com/");
		wd.manage().window().maximize();
		WebElement elem = wd.findElement(By.id("search"));
		elem.sendKeys("Rick Astley");
		elem = wd.findElement(By.cssSelector("button#search-icon-legacy"));
		elem.click();
		wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		elem = wd.findElement(By.xpath("//a[@href='/watch?v=dQw4w9WgXcQ']"));
		elem.click();
		sacekaj();
		stopAd();
		List<WebElement> lista = wd
				.findElements(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-compact-video-renderer']"));
		lista.get(0).click();

	}

	public static void sacekaj() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void stopAd() {
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		if ((wd.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")).isDisplayed())) {
			wd.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")).click();
		} else
			return;
	}

}
