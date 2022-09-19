import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class FirstTest {

    @Test
    void checkMinSum() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);


        By phoneNumber =  By.xpath("//input[@data-qa-node=\"phone-number\"]");
        By amount =  By.xpath("//input[@data-qa-node=\"amount\"]");
        By cartNumber =  By.xpath("//input[@data-qa-node=\"numberdebitSource\"]");
        By expDay =  By.xpath("//input[@data-qa-node=\"expiredebitSource\"]");
        By cvvCode =  By.xpath("//input[@data-qa-node=\"cvvdebitSource\"]");
        By name =  By.xpath("//input[@data-qa-node=\"firstNamedebitSource\"]");
        By lastName =  By.xpath("//input[@data-qa-node=\"lastNamedebitSource\"]");
        By addtoBasket =  By.xpath("//button[@data-qa-node=\"submit\"]");
        By pay =  By.xpath("//button[text()=\"Сплатити\"]");
        By confirm =  By.xpath("//button[text()=\"Підтвердити\"]");
        By notification =  By.xpath("//*[text()=\"Ваш банк вiдхилив операцiю\"]");




        driver.get("https://next.privat24.ua/mobile");
        driver.findElement(phoneNumber).sendKeys("674724115");
        driver.findElement(amount).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        driver.findElement(amount).sendKeys("20");
        driver.findElement(cartNumber).sendKeys("4004159115449003");
        driver.findElement(expDay).sendKeys("1223");
        driver.findElement(cvvCode).sendKeys("111");
        driver.findElement(name).sendKeys("Petro");
        driver.findElement(lastName).sendKeys("Petrenko");
        driver.findElement(addtoBasket).click();
        driver.findElement(pay).click();
        driver.findElement(confirm).click();



    }
}
