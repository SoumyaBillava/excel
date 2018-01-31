import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterDemo {
	@Test
    public void testReport(){
        
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\soumya.billava\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        boolean bolConsole;
        bolConsole=true;
        
        Reporter.log("Browser Opened",bolConsole);
        
        driver.manage().window().maximize();
        
        Reporter.log("Browser Maximized"+driver.getCurrentUrl(),bolConsole);
        driver.get("http://www.google.com");
        
        Reporter.log("Application started",bolConsole);
        
        driver.quit();
	}
	@Test
	public void newReport() {

        boolean bolConsole;
        bolConsole=true;
        Reporter.log("Application closed",bolConsole);
        
    }
}
