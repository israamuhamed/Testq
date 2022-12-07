/*
 * package stepdefinitions;
 * 
 * //import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * import io.cucumber.java.en.*;
 * 
 * import pages.loginbase;
 * 
 * public class login1 { WebDriver driver; loginbase login;
 * 
 * @Given("user in login page") public void user_in_login_page() {
 * System.out.println("you'r inside login page"); //String
 * projectPath=System.getProperty("user.dir");
 * System.setProperty("webdriver.gecko.driver",
 * "C:/Users/Dell/.eclipse/workspace/src/test/resources/Drivers/geckodriver.exe"
 * ); WebDriver driver= new FirefoxDriver() ;
 * driver.manage().window().maximize();
 * 
 * // driver.navigate().to(
 * "https://magento.softwaretestingboard.com/customer/account/login");
 * //driver.navigate().to("https://example.testproject.io/web/");
 * driver.navigate().to("https://practice.automationtesting.in/my-account/");
 * 
 * }
 * 
 * 
 * @When("user enters (.*) and (.*)$") public void
 * user_enters_username_and_password(String username, String password) throws
 * InterruptedException {
 * 
 * login=new loginbase(driver); login.enterusername(username);
 * login.enterPassword(password);
 * //driver.findElement(By.id("email")).sendKeys(username);
 * //driver.findElement(By.id("pass")).sendKeys(password); Thread.sleep(2000); }
 * 
 * @And("clicks on login button") public void clicks_on_login_button() throws
 * InterruptedException { login=new loginbase(driver); login.clickLogin();
 * //driver.findElement(By.id("send2")).click(); Thread.sleep(2000); }
 * 
 * @Then("user navigated into home page") public void
 * user_navigated_into_home_page() throws InterruptedException {
 * //driver.navigate().to(
 * "https://magento.softwaretestingboard.com/customer/account/");
 * driver.navigate().to("https://practice.automationtesting.in/shop/");
 * Thread.sleep(2000); driver.close(); driver.quit(); } }
 */