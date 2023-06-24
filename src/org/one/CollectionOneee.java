package org.one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionOneee {
	public static WebDriver driver;
	public static void setup(String application) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\Collections\\Driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get(application);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void locate(String xpath) {
		System.out.println("list examples");
		List<WebElement> findElements = driver.findElements(By.xpath("//*[contains(text(),'Valencia Nutrition L')]/parent::td/ancestor::tr/preceding-sibling::tr"));
		Iterator<WebElement> itr = findElements.iterator();
		String value="";
//		int i=1;
//		HashMap<String,String> ElementValues= new HashMap<String,String>();
		while(itr.hasNext())
		{
			WebElement element = itr.next();
			 value = element.getText();
			System.out.println("Element getText: "+value);
//			ElementValues.put("Element"+i, value);
//			i++;
		}
//		dispHashMapValues(ElementValues);
		
		
	}
	public static void dropdownlist(String xpathdropdown) {
		System.out.println("Dropdown elements list usage examples");
		List<WebElement> dropdownist = driver.findElements(By.xpath(xpathdropdown));
		Iterator<WebElement> ite = dropdownist.iterator();
		int i=1;
		String value="";
		while(ite.hasNext())
		{
			WebElement element = ite.next();
			 value = element.getText();
			System.out.println("Element getText: "+value);
		}
	}
	public void windowhandlenew() {
		System.out.println("Windowhandle usage examples");
		
		

	}
	public static void main(String[] args) {
		String application="https://money.rediff.com/gainers/bse/daily/groupall";
		String application2="https://www.globalsqa.com/demo-site/select-dropdown-menu/"; 
		String application3="";
		String	xpath="//*[contains(text(),'Valencia Nutrition L')]/parent::td/ancestor::tr/preceding-sibling::tr";
		
		String xpathdropdown="//div [@class='information closable']/following-sibling::p/child::select";
		setup(application);
		locate(xpath); 
		setup(application2);
		dropdownlist(xpathdropdown);
		
		
		
	}
}
