package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class stepDefHw_2 {

    WebDriver driver;
    @Given("I open the browser")
    public void i_open_the_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @And("I am on the input Validation Examples page")
    public void iAmOnTheInputValidationExamplesPage() {
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
    }




    @When("I am click dropdown")
    public void iAmClickDropdown() {
        WebElement element = driver.findElement(By.xpath("//select[@id='country']"));
        Select select = new Select(element);
        select.selectByValue("Saudi Arabia");
    }

    @Then("I am click on button")
    public void iAmClickOnButton() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @When("I am click first name")
    public void iAmClickFirstName() {
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("abdullah");

    }

    @When("I am click second name")
    public void iAmClickSecondName() {

        driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("alshaker");
    }

    @When("I am click age")
    public void iAmClickAge() {
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys("24");
    }
}
