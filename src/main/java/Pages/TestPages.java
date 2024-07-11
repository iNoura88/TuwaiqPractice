package Pages;

// Import necessary classes from Selenium and TestNG
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.sql.Driver;

import static ObjectsPath.TestHome.*; // Import all static fields (locators) from TestHome class

// Define the TestPages class
public class TestPages {
    WebDriver driver = null; // Declare WebDriver instance variable

    // Constructor to initialize WebDriver instance
    public TestPages(WebDriver driver) {
        this.driver = driver; // Assign WebDriver instance from parameter to local driver variable
    }

    // Method to open GitHub homepage
    public void OpenGitHubUrl (){
        driver.get("https://tuwaiq.edu.sa/"); // Navigate to GitHub URL
    }

    // Method to click on the login button on the home page
    public void ChangeLanguage() {
        WebElement english = driver.findElement(language); // Find login button element
        english.click(); // Click on the login button
    }
    // Method to click on the login button on the home page
    public void ProgramsAndBootcamp() {
        WebElement ProBot = driver.findElement(programs); // Find login button element
        ProBot.click(); // Click on the login button
    }
    // Method to click on the login button on the home page
    public void SearchClick() {
        WebElement ClickSearch = driver.findElement(SearchElement); // Find login button element
        ClickSearch.click(); // Click on the login button
    }

    public void SearchData() {
        WebElement EnterSearch = driver.findElement(SearchDataElement); // Find login button element
        EnterSearch.click(); // Click on the login button
    }

    public void DataInSearch() {
        WebElement EnterData = driver.findElement(Data); // Find login button element
        EnterData.click(); // Click on the login button
        driver.findElement(Data).sendKeys("data");
    }



    //public void LocationRy() {
       // WebElement ClickLoc = driver.findElement(location); // Find login button element
        //ClickLoc.click(); // Click on the login button
public void ScrollToPosition(int x, int y) {
   JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript( "window.scrollTo(arguments[0], arguments[1] );" , x, y);
}





    // Method to click on the login button on the home page
    //public void LoginHomePageMethod() {
       // WebElement loginPage = driver.findElement(loginBtnInHomePageMethod); // Find login button element
      //  loginPage.click(); // Click on the login button
  //  }

    //public void LearnMethod() {
       // WebElement LMethod = driver.findElement(LearnMethod) ;
       // LMethod.click();
    //}

    // Method to enter login credentials and verify login
    //public void EnterLoginCredentials () throws InterruptedException {
     //   driver.findElement(emailAddressLogin).sendKeys("inoura8@gmail.com"); // Find email address field and enter email
      //  Thread.sleep(3000); // Pause execution for 3000 milliseconds (not recommended; use explicit waits instead)
       // driver.findElement(passwordLogin).sendKeys("122NNo122*"); // Find password field and enter password
       // driver.findElement(signInBtn).click(); // Click on sign-in button

       // boolean homepageview = driver.findElement(assertionUponLogin).isDisplayed(); // Check if assertion element is displayed
      //  Assert.assertTrue(homepageview, "home page is not displayed!"); // Assert that homepageview is true
   // }
}