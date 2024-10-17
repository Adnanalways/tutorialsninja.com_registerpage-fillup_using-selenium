package tutorialsninja.register;

import java.time.Duration;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_RF_001 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Adnan");
		driver.findElement(By.id("input-lastname")).sendKeys("joy");
		driver.findElement(By.id("input-email")).sendKeys("randomEmail");
		driver.findElement(By.id("input-telephone")).sendKeys("01752243984");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.id("input-confirm")).sendKeys("12345");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
	}
	public static String generateRandomEmail() {
		Random rand=new Random();
		int randomNum=rand.nextInt(1000);
		return "user"+randomNum +"@example.com";
		
		
	}

}
