package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {


    @Test
    public void HomePageLoginMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenGitHubUrl();
        //homepage.LoginHomePageMethod();
        //homepage.EnterLoginCredentials();
       //homepage.LearnMethod();
       //homepage.SearchBar();
        Thread.sleep(1000);
    }

    @Test
    public void Tuwaiq() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenGitHubUrl();
        //homepage.LoginHomePageMethod();
        //homepage.EnterLoginCredentials();
        //homepage.LearnMethod();
        homepage.ChangeLanguage();
        Thread.sleep(1000);
        homepage.ProgramsAndBootcamp();
        Thread.sleep(1000);
        homepage.SearchClick();
        Thread.sleep(1000);
        homepage.SearchData();
        Thread.sleep(1000);
        homepage.DataInSearch();
        Thread.sleep(1000);
        homepage.ScrollToPosition(0, 600);
        Thread.sleep(2000);
    }


    //public void TuwaiqTestMethod() throws InterruptedException {

    //  TestPages homepage = new TestPages (driver);
      // homepage.OpenGitHubUrl();
    //  homepage.ChangeLanguage();
     // Thread.sleep(2000);

    }



