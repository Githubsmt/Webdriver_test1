import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript{
           public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
               WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.in/");
            driver.manage().window().maximize();
            String title = driver.getTitle();
            if (title.equals("amazon")){
                System.out.println("Title is correct");
            }
            else {
                System.out.println("Title is incorrect");
            }
           //driver.quit();
        }

    }