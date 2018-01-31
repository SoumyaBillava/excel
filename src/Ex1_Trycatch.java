import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Ex1_Trycatch {
	public void printing() 
	{
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\soumya.billava\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		String url ="http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(url);
		WebElement mul = driver.findElement(By.name("selenium_commands"));
		Select sel = new Select(mul);
		sel.selectByIndex(0);
		System.out.println("Index 0 is selected");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sel.deselectByIndex(0);
		System.out.println("Index 0 is deselected");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sel.selectByVisibleText("Navigation Commands");
		System.out.println("Navigation command is selected");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sel.deselectByVisibleText("Navigation Commands");
		System.out.println("Navigation command is deselected");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> multi = sel.getOptions();
		int size = multi.size();
		System.out.println(size);
		
			for(int i=0;i<size;i++)
		{
			
			String svalue=sel.getOptions().get(i).getText();
			System.out.println(svalue);
			
		}
		}
}
