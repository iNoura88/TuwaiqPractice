package ObjectsPath;

// Import necessary classes from Selenium
import org.openqa.selenium.By;


// Define the TestHome class
public class TestHome {

    public static final By language = By.xpath("/html/body/main/div/nav[2]/div[2]/button[1]");
    public static final By programs = By.xpath("/html/body/main/div/nav[2]/div[1]/div/div/ul/li[2]/a");
    public static final By SearchElement = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[1]/button/img");
    public static final By SearchDataElement = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[2]/div/div/div[3]/input");
    public static final By Data = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[2]/div/div/div[3]/input");
    public static final By location = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[2]/div/div/div[3]/input");


    // Locator for the login button in the home page
  //  public static final By loginBtnInHomePage = By.xpath("//*[@");
//
    // Locator for the email address input field in the login form
    public static final By emailAddressLogin = By.xpath("//*[@id='login_field']");

    // Locator for the password input field in the login form
    public static final By passwordLogin = By.xpath("//*[@id='password']");

    // Locator for the sign in button in the login form
    public static final By signInBtn = By.xpath("//*[@id='login']/div[4]/form/div/input[13]");

    // Locator for an element to assert upon successful login
    public static final By assertionUponLogin = By.xpath("//*[@id='dashboard']/div/feed-container/div[1]/div/a");

    // Locator for an element to assert upon successful login
    public static final By LearnMethod = By.xpath("//*[@id=\"popover-trigger-:R1l669l5t6H1:\"]");

//

}
