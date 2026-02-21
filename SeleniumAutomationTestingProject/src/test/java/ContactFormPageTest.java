import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactFormPageTest {
    WebDriver driver;

    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.kafeville.com/");
        driver.manage().window().maximize();
    }
    @Test
    void ValidateContactFormFirstNameInputFieldPlaceholderTextDisplayed(){
        ContactFormPage FirstNameField = new ContactFormPage(driver);
        FirstNameField.firstNameInputFieldPlaceholderTextDisplayed();
    }
    @Test
    void ValidateContactFormLastNameInputFieldPlaceholderTextDisplayed(){
        ContactFormPage LastNameField = new ContactFormPage(driver);
        LastNameField.lastNameInputFieldPlaceholderTextDisplayed();
    }
    @Test
    void ValidateContactFormEmailInputFieldPlaceholderTextDisplayed(){
        ContactFormPage EmailField = new ContactFormPage(driver);
        EmailField.emailInputFieldPlaceholderTextDisplayed();
    }
    @Test
    void ValidateContactFormMessageTextareaFieldPlaceholderTextDisplayed(){
        ContactFormPage MessageTextareaField = new ContactFormPage(driver);
        MessageTextareaField.messageTextareaFieldPlaceholderTextDisplayed();
    }
    @AfterClass
    void closeWebPage(){
        driver.quit();
    }
}
