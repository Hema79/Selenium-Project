import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbXpath {
	 public static void main(String[] args) {
		
		 
		 System.setProperty("webDriver.gecko.driver","geckoDriver.exe" );
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			
			/* Adding comments for creating new branch in github*/
			
			driver.findElement(By.xpath("//input[@id='u_0_b']"));
		
	}

}
