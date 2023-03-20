package stepDefinitions;


import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrangeHRMsteps {
    WebDriver driver;
    @Given("I Launch Chrome Browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "/Users/Munib Hassan/IdeaProjects/Driver/chromedriver.exe");

        // Create a new instance of the Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }
    @When("I Open orange hrm homepage")
    public void i_open_orange_hrm_homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
       boolean isdisplayed= driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]")).isDisplayed();
       //this is test commit
    }
    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }

}