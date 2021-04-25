package Demo1;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
				
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		WebElement newFrame=driver.findElementById("iframeResult");
		
		driver.switchTo().frame(newFrame);
		
	driver.findElementByXPath("/html/body/button").click();
		
		
	driver.switchTo().alert().sendKeys("Liberty");
	
	String mgs=driver.switchTo().alert().getText();
	
	System.out.println(mgs);
	
	driver.switchTo().alert().dismiss();
	
	driver.switchTo().defaultContent();
	
	String winIdBeforeClick=driver.getWindowHandle();
	
	System.out.println(winIdBeforeClick);
	
	Set<String> allWinIDbeforeClick=driver.getWindowHandles();
	
	System.out.println(allWinIDbeforeClick);
	
	driver.findElementById("tryhome").click();
	
	String winIdAfterClick=driver.getWindowHandle();
	
	System.out.println(winIdAfterClick);
	
	Set<String> allWinidAfterClick= driver.getWindowHandles();
	
	System.out.println(allWinidAfterClick);
	
	
	for(String eachId : allWinidAfterClick){
		System.out.println(eachId);
		driver.switchTo().window(eachId);
	}
	
 	driver.findElementByLinkText("LEARN HTML").click();
	
 	for(String eachId : allWinidAfterClick){
		System.out.println(eachId);			
		driver.switchTo().window(eachId);
		String title=driver.getTitle();
		if(title.equals("")){
		break;
		}
	}
 	
 	
 	driver.findElementByXPath("/html/body/div[5]/div/a[4]").click();
 	

		
	}

}
