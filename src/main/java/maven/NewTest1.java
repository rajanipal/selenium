package maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class NewTest1 {
	WebDriver driver = new ChromeDriver();
  @Test
  
	  public void getLogin()
	  {
		    driver.get("https://www.naukri.com/");
		    driver.manage().window().maximize();
	        driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
			
			driver.findElement(By.xpath("//*[@id=\"eLoginNew\"]")).sendKeys("rajani.1993pal@gmail.com");
		    driver.findElement(By.xpath("//*[@id=\"eLoginNew\"]")).sendKeys(Keys.ENTER);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    driver.findElement(By.xpath("//*[@id=\"pLogin\"]")).sendKeys("Rajanipal@1905");
		    driver.findElement(By.xpath("//*[@id=\"pLogin\"]")).sendKeys(Keys.ENTER);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @Test(priority=2)
  public void myNaukri()
    {
  	System.out.println(driver.getTitle());
	   
	    WebElement el = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[2]/a/div[2]"));
	    Actions act =new Actions(driver);
	    act.moveToElement(el).build().perform();
    }
  @Test(priority=3)
  public void editprofile()
  {
	 System.out.println(driver.getTitle());
	driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[2]/div/ul[1]/li[1]/a")).click();  

  }


@Test(priority=4)
public void edit()
{
	System.out.println(driver.getTitle());
	//resume headline
	driver.findElement(By.xpath("//*[@id=\"lazyResumeHead\"]/div/div/div/div[1]/span[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"resumeHeadlineTxt\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"resumeHeadlineTxt\"]")).sendKeys("Tech Civil Engineer seeking a career in Construction and Project Management");
	driver.findElement(By.xpath("/html/body/div[5]/div[5]/div[2]/form/div[3]/div/button")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Test(priority=5)
public void itskills(){
	System.out.println(driver.getTitle());

	
driver.findElement(By.xpath("//*[@id=\"lazyITSkills\"]/div/div[1]/div/div[1]/span[1]")).click();
driver.findElement(By.xpath("//*[@id=\"lazyITSkills\"]/div/div[1]/div/div[1]/span[2]")).click();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id=\"itSkillSugg\"]")).clear();
driver.findElement(By.xpath("//*[@id=\"itSkillSugg\"]")).sendKeys("java","selenium");
driver.findElement(By.xpath("//*[@id=\"saveITSkills\"]")).click();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}


  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
