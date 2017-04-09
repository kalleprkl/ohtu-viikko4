package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/perkoila/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:4567");

        sleep(2);

        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));

        sleep(2);
        element.submit();

        sleep(3);

        //oikea tunnus väärä salasana
        
        driver.get("http://localhost:4567");

        sleep(2);

        element = driver.findElement(By.linkText("login"));
        element.click();

        sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("kakka");
        element = driver.findElement(By.name("login"));

        sleep(2);
        element.submit();

        sleep(3);

        //tunnus ei olemassa
        
        driver.get("http://localhost:4567");

        sleep(2);

        element = driver.findElement(By.linkText("login"));
        element.click();

        sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys("kekkonen");
        element = driver.findElement(By.name("password"));
        element.sendKeys("nenokkek");
        element = driver.findElement(By.name("login"));

        sleep(2);
        element.submit();

        sleep(3);

        //uuden käyttäjätunnuksen luominen
        
        driver.get("http://localhost:4567");

        sleep(2);

        element = driver.findElement(By.linkText("register new user"));
        element.click();

        sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys("nakkeli");
        element = driver.findElement(By.name("password"));
        element.sendKeys("pohje");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("pohje");
        element = driver.findElement(By.name("signup"));

        sleep(2);
        element.submit();

        sleep(3);
        
        //

        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();
        
        element = driver.findElement(By.linkText("logout"));
        element.click();

        driver.quit();
    }

    private static void sleep(int n) {
        try {
            Thread.sleep(n * 1000);
        } catch (Exception e) {
        }
    }
}
