package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StepDefForHw {


    WebDriver driver;
    @Given("I open the browser")
    public void i_open_the_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Given("I am on the simple dynamic page")
    public void i_am_on_the_simple_dynamic_page(){
        driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
    }


    @When("I am start click")
    public void i_am_start_click() {
        driver.findElement(By.xpath("//button[@id='button00']")).click();
    }

    @When("I am first click")
    public void i_am_first_click() {
        driver.findElement(By.xpath("//button[@id='button01']")).click();
    }

    @When("I am second click")
    public void i_am_second_click() {
        driver.findElement(By.xpath("//button[@id='button02']")).click();
    }

    @When("I am third click")
    public void i_am_third_click() {
        driver.findElement(By.xpath("//button[@id='button03']")).click();
    }


    @Then("I should see All Buttons Clicked on the results")
    public void i_should_see_All_Buttons_Clicked_on_the_results(){
        driver.findElement(By.xpath("//p[@id='buttonmessage']"));
    }
}
