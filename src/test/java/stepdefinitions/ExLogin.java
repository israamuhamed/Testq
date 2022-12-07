
  package stepdefinitions;
  
  import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.firefox.FirefoxDriver;
  
  import io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
  io.cucumber.java.en.Then; import io.cucumber.java.en.When;
  
  
  public class ExLogin { WebDriver driver=null;
  
  @Given("user in login page") public void user_in_login_page() {
  System.out.println("you'r inside login page");
  System.setProperty("webdriver.gecko.driver",
  "C:/Users/Dell/.eclipse/workspace/src/test/resources/Drivers/geckodriver.exe"
  ); driver= new FirefoxDriver() ; driver.manage().window().maximize();
  driver.navigate().to("https://practice.automationtesting.in/my-account/"); }
  
  @When("user enters username and password")
  public void user_enters_username_and_password() {
  driver.findElement(By.id("username")).sendKeys("israa");
  driver.findElement(By.id("password")).sendKeys("12345");
  
  
  }
  
  @And("clicks on login button") public void clicks_on_login_button() {
  //driver.findElement(By.name("login")).click();
	  driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
  
  }
  
  @Then("user navigated into home page") public void
  user_navigated_into_home_page() { 
	  driver.navigate().to("https://practice.automationtesting.in");
	  driver.close(); driver.quit();
  
  }
  
  
  
  }
 