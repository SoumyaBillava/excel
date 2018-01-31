import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex11 {
	public static void main(String args[])
	{
	System.setProperty("webdriver.firefox.marionette","C:\\Users\\soumya.billava\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	String url ="http://toolsqa.wpengine.com/automation-practice-form/";
	driver.get(url);
	WebElement mul = driver.findElement(By.name("selenium_commands"));
	try {
		Select sel = new Select(mul);
		sel.selectByIndex(10);
	}catch(Exception ex)
	{
		//System.out.println(ex);
	}finally {
		System.out.println("end of the program");
	}
}
}
