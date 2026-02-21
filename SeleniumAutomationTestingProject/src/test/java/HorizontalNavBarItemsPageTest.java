import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HorizontalNavBarItemsPageTest {
    WebDriver driver;
    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.kafeville.com/");
        driver.manage().window().maximize();
    }

    @Test
    void OnClickHomeNavBarItemNavigateToHomepage(){
        HorizontalNavBarItemsPage homeNavBarItem = new HorizontalNavBarItemsPage(driver);
        homeNavBarItem.clickAboutUsHorizontalNavBarItem();
        homeNavBarItem.validateAboutUsPageDisplayed();
        homeNavBarItem.clickHomeNavBarItem();
        homeNavBarItem.validateHomePageDisplayed();
    }
    @Test
    void OnClickAboutUsNavBarItemNavigateToAboutUsPage(){
        HorizontalNavBarItemsPage aboutUsNavBarItem = new HorizontalNavBarItemsPage(driver);
        aboutUsNavBarItem.clickAboutUsHorizontalNavBarItem();
        aboutUsNavBarItem.validateAboutUsPageDisplayed();
        aboutUsNavBarItem.clickKafevilleTopLogo();
    }
    @Test
    void OnClickOurTeamNavBarItemNavigateToOurTeamPage(){
        HorizontalNavBarItemsPage ourTeamNavBarItem = new HorizontalNavBarItemsPage(driver);
        ourTeamNavBarItem.clickOurTeamHorizontalNavBarItem();
        ourTeamNavBarItem.validateOurTeamPageDisplayed();
        ourTeamNavBarItem.clickKafevilleTopLogo();
    }
    @Test
    void OnClickOurBrothersNavBarItemNavigateToOurBrothersPage(){
        HorizontalNavBarItemsPage ourBrothersNavBarItem = new HorizontalNavBarItemsPage(driver);
        ourBrothersNavBarItem.clickOurBrothersHorizontalNavBarItem();
        ourBrothersNavBarItem.validateOurBrothersPageDisplayed();
        ourBrothersNavBarItem.clickKafevilleTopLogo();
    }
    @Test
    void OnClickMenuNavBarItemNavigateToMenuPage(){
        HorizontalNavBarItemsPage menuNavBarItem = new HorizontalNavBarItemsPage(driver);
        menuNavBarItem.clickMenuHorizontalNavBarItem();
        menuNavBarItem.validateMenuPageDisplayed();
        menuNavBarItem.clickKafevilleTopLogo();
    }
    @Test
    void OnClickBlogNavBarItemNavigateToBlogPage(){
        HorizontalNavBarItemsPage blogNavBarItem = new HorizontalNavBarItemsPage(driver);
        blogNavBarItem.clickBlogHorizontalNavBarItem();
        blogNavBarItem.validateBlogPageDisplayed();
        blogNavBarItem.clickKafevilleTopLogo();
    }
    @Test
    void OnClickShopNavBarItemNavigateToShopPage(){
        HorizontalNavBarItemsPage shopNavBarItem = new HorizontalNavBarItemsPage(driver);
        shopNavBarItem.clickShopHorizontalNavBarItem();
        shopNavBarItem.validateShopPageDisplayed();
        shopNavBarItem.clickKafevilleTopLogo();
    }
    @AfterClass
    void closeWebPage(){
        driver.quit();
    }
}
