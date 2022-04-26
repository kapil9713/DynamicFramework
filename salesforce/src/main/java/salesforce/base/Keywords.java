package salesforce.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keywords {
	WebDriver driver;
	FileInputStream file;
	Properties prop;

	public  void open()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\kapil\\chromedriver.exe");
		 driver = new ChromeDriver();
		 try {
			 file=new FileInputStream("F:\\RSSB\\salesforce\\src\\main\\java\\salesforce\\base\\ObjectRepository.properties");
			prop=new Properties();
			prop.load(file);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		

	}

	public void url(String httpUrl) {
		driver.get(httpUrl);
		
	
		
	}

	public void input(String testData, String objectName) {
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(testData);
		
		
		
	}

	public void button(String clickOn) {
		driver.findElement(By.xpath(prop.getProperty(clickOn))).click();
		
		
	}

}
