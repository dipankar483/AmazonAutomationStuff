package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepDefinition {
	
    public static WebDriver driver;
    String baseURL = "https://www.amazon.com";
	
	
	@Given("user is on Amazon website")
	public void user_is_on_Amazon_website() throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhaskar\\Dipankar-workspace\\AmazonAutomation\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseURL);
	}

	@When("user enters delivery zip code")
	public void user_enters_delivery_zip_code() {
    
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//*[@id='nav-packard-glow-loc-icon']")).click();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//*[@id='GLUXZipUpdateInput']")).sendKeys("98201");
	driver.findElement(By.xpath("//*[@id='GLUXZipUpdate']"))
	.click();
	driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/span/span/input")).click();
}

	@Then("user search for {string}")
	public void user_search_for(String string) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iPhone 11 pro max");
	    
		
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).submit();
	}

	@Then("user verifies results as {string} or {string} on page {int}")
	public void user_verifies_results_as_or_on_page(String silver, String midNightGreen, Integer page1) {
	    
//		 silver = driver.findElement(By.xpath("//img[contains(@src,'https://m.media-amazon.com/images/I/81j2j9x-KWL._AC_UY218_.jpg')]"))
//				 .getText();
//		 
//		 midNightGreen = driver.findElement(By.xpath("//img[contains(@src,'https://m.media-amazon.com/images/I/81hA4nb-+qL._AC_UY218_.jpg')]"))
//				 .getText();
//		 
//		 System.out.println("The silver(replacement of white) variant is present" + silver);
//		 System.out.println("The midnight green variant is present" + midNightGreen);

	}

	 @Then("^user selects \"([^\"]*)\" and moves to the product details page$")
	    public void user_selects_something_and_moves_to_the_product_details_page(String strArg1) throws Throwable {
		 
		 //Midnight green xpath
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61GggH1hAaL._AC_UY218_.jpg']"))
		 .click(); 
	 }

	@Then("user add product to the cart")
	public void user_add_product_to_the_cart() {
		
		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		
	}

	@Then("users ignores suggestions and proceed to cart")
	public void users_ignores_suggestions_and_proceed_to_cart() {
	    
//		driver.findElement(By.xpath("//*[@id='attachSiNoCoverage-announce']")).click();
//		driver.findElement(By.xpath("//*[@id='attach-sidesheet-checkout-button']")).click();
		
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='hlb-ptc-btn-native']")).click();
		driver.quit();
	}
	
}
