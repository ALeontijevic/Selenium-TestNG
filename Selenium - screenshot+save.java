package DomaciZadaci;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_02_0309 {

	public static void main(String[] args) throws Exception{
		/* Koristeci selenijum, napravi screenshot svog okacenog domaceg zadatka na
		 * drajvu. Okaciti ovaj zadatak i kao .java (kod sa selenijumom) i
		 * sliku(screenshot).
		 */
		
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.wikipedia.org/");
		dr.manage().window().maximize();
		
		File scrFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\T460\\Desktop\\Screenshot\\Zadatak_02_0309.png"));
		}
		catch(IOException e){
			e.printStackTrace();
			}
		dr.close();
		}
		
	


}
