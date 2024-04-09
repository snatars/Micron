package pack1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class basic {
	
	static Logger log = LogManager.getLogger(basic.class);
@Test
void test1() throws InterruptedException
{
	String Path_of_Firefox_Driver="C:\\Users\\DELL\\qtree\\ignite\\CSM certification\\QA group\\geckodriver.exe";
	System.setProperty("webdriver.gecko.driver",Path_of_Firefox_Driver);
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://www.aa.com");
	log.info("opening website");
	driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm.originAirport\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm.originAirport\"]")).sendKeys("DEN");
	driver.findElement(By.xpath("//*[@id=\"aa-leavingOn\"]")).sendKeys("03/28/2025");
	driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm.destinationAirport\"]")).sendKeys("BOI");
	driver.findElement(By.xpath("//*[@id=\"aa-returningFrom\"]")).sendKeys("03/29/2025");
	log.warn("input sent");
	Thread.sleep(3000);
	driver.findElement(By.id("flightSearchForm.button.reSubmit")).submit();
	log.debug("submitted");
	/*ChromeDriver cd = new ChromeDriver();
	cd.get("http://www.aa.com");*/
}
}
