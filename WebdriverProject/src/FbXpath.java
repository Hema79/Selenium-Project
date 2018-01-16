import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbXpath {
	 public static void main(String[] args) {
		
		 
		 System.setProperty("webDriver.gecko.driver","geckoDriver.exe" );
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("//input[@id='u_0_b']"));
		
	}

}
