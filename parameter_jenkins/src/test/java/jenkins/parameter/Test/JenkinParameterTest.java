package jenkins.parameter.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinParameterTest 
{
@Test
	
	public void jenkinParameterTest() throws Throwable
	{
	   WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	String URL = System.getProperty("url");
	System.out.println(URL);
	driver.get(URL);
	System.out.println("welcome to jenkins");
	System.out.println("Good Evening");
	System.out.println("Welcome");

}
}
