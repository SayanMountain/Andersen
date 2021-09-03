import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson_10 {
    public static void main(String[] args)
    {
        System.setProperty(
                "webdriver.chrome.driver", "src/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com");
        driver.findElement(By.name("Sign"));
        Lesson_10 signInputField = null;
        signInputField.click();
        signInputField.sendKeys("tchimitov2013@ya.ru");
    }

    private void click() {
    }

    private void sendKeys(String s) {
    }

}
