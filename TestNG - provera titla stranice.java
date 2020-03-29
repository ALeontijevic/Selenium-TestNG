import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Zadatak_01_0316 {
	@Test
	public void f() {
		/*
		 * Napraviti testNG klasu koja ce testirati da li se zeljena web stranica
		 * otvorila. Proveru izvrsiti na osnovu Title-a.
		 */
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.youtube.com/");
		String title = wd.getTitle();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title, "YouTube");
		sa.assertAll();
	}
}
