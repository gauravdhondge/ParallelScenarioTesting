package parallel;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTelecomAddTariffPlanStepDefinition {
	
 WebDriver driver;	
	
 @Given("^user is already present on login page$")
 public void user_is_already_present_on_login_page()

{
	    
 System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayesh.Kulkarni\\Downloads\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("http://demo.guru99.com/V1/index.php");
 
}

 
 @Given("^title of loginpage is GTPL Bank Home Page$")
 public void title_of_loginpage_is_gtpl_bank_home_page() 
 
 {
	    
 String title = driver.getTitle();
 System.out.println(title);
	
 }
	
 
 @When("^user enter userID and password$")
 public void user_enter_user_id_and_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException
 
 {
	
 List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class); 
	 
 for(Map<String,String> e : userlist)
 {
	 
 WebElement userID = driver.findElement(By.xpath("//input[@name='uid']"));
 WebElement enterpassword = driver.findElement(By.xpath("//input[@name='password']"));
			   	  
 userID.sendKeys(e.get("userID"));
 Thread.sleep(2000);
 enterpassword.sendKeys(e.get("password"));
 Thread.sleep(2000);

 }	 
 }
 
 
 @When("^user click on login button$")
 public void user_click_on_login_button() 
 
 {
 
 WebElement loginbutton = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		
 Actions act = new Actions(driver);
 act.moveToElement(loginbutton).click().build().perform();
	
 }
 
 
 @Then("^user is on homepage$")
 public void user_is_on_homepage() 
 
 {
	    
 String title = driver.getTitle();
 System.out.println(title);	 
	 
 }
 
 
 @Then("^user click on telecom project$")
 public void user_click_on_telecom_project() throws InterruptedException 
 
 {
	   
 WebElement telecomproject = driver.findElement(By.xpath("//a[text()='Telecom Project']"));
		
 Actions act = new Actions(driver);
 act.moveToElement(telecomproject).click().build().perform();
	 
 Thread.sleep(2000);
	 
 WebElement closebutton = driver.findElement(By.xpath("//a[text()='Telecom Project']"));
 Actions act1 = new Actions(driver);
 act1.moveToElement(closebutton).click().build().perform();	 
	 
 }
 
	
 @Then("^user clicks on add tariff plan$")
 public void user_clicks_on_add_tariff_plan() throws InterruptedException 
 
 {
	 
 WebElement iframe = driver.findElement(By.xpath("//iframe[@name='__uspapiLocator']"));
 driver.switchTo().frame(iframe);
		 
 Thread.sleep(2000); 
	 
WebElement AddTariffPlan = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
		
 Actions act = new Actions(driver);
 act.moveToElement(AddTariffPlan).click().build().perform(); 
	 
 }
 
 
 @When("^user enters add tariff plan details and clicks on submit button$")
 public void user_enters_add_tariff_plan_details_and_clicks_on_submit_button(io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
 
 {
	   
 List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class);       
     
 for (Map<String, String> e : userlist)
		    
 {

 WebElement MonthlyRental               = driver.findElement(By.xpath("//input[@id='rental1']"));	 
 WebElement FreeLocalMin                = driver.findElement(By.xpath("//input[@id='local_minutes']"));
 WebElement FreeInternationalMin        = driver.findElement(By.xpath("//input[@id='inter_minutes']"));
 WebElement FreeSMSPack                 = driver.findElement(By.xpath("//input[@id='sms_pack']"));
 WebElement LocalPerMinCharges          = driver.findElement(By.xpath("//input[@id='minutes_charges']"));	
 WebElement InternationalPerMinCharges  = driver.findElement(By.xpath("//input[@id='inter_charges']"));
 WebElement SMSPerCharges               =  driver.findElement(By.xpath("//input[@id='sms_charges']"));	 
	
	 
 MonthlyRental.sendKeys(e.get("monthly rental"));
 Thread.sleep(2000);
 
 FreeLocalMin.sendKeys(e.get("free local min"));
 Thread.sleep(2000);
	 
 FreeInternationalMin .sendKeys(e.get("free international min")); 
 Thread.sleep(2000);
	 
 FreeSMSPack .sendKeys(e.get("free sms pack"));  
 Thread.sleep(2000);
	 
 LocalPerMinCharges.sendKeys(e.get("local per min charges"));  
 Thread.sleep(2000);	
 
 InternationalPerMinCharges.sendKeys(e.get("international per min charges"));  
 Thread.sleep(2000);	
 
 SMSPerCharges.sendKeys(e.get("sms per charges"));  
 Thread.sleep(2000);	
 
 WebElement SubmitButton = driver.findElement(By.xpath("//input[@value='submit']"));
	
 Actions act1 = new Actions(driver);
 act1.moveToElement(SubmitButton).click().build().perform(); 
 
 Thread.sleep(2000);
 
 WebElement HomeButton = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
	
 Actions act2 = new Actions(driver);
 act2.moveToElement(HomeButton).click().build().perform(); 
	 
 Thread.sleep(2000);
 
 WebElement AddTariffPlan = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
	
 Actions act = new Actions(driver);
 act.moveToElement(AddTariffPlan).click().build().perform(); 
 
 
 }	
 }
 
 
 @Then("^user again comes to telecom projects homepage by clicking on telecom project$")
 public void user_again_comes_to_telecom_projects_homepage_by_clicking_on_homebutton()
 
 {
	 
 WebElement telecomproject = driver.findElement(By.xpath("//a[text()='Telecom Project']"));
		
 Actions act = new Actions(driver);
 act.moveToElement(telecomproject).click().build().perform();
	 
 }
	

}
