package ch.ilv.crm.business.test.view;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;

public class ViewTest {
    @Test
    public void testCreateproduct() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/dev-tools/chromedriver_win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://localhost:7070/products");
        String title = driver.getTitle();

        WebElement description = driver.findElement(By.xpath("/html/body/form[1]/input[1]"));
        description.sendKeys("Brot");


        WebElement button = driver.findElement(By.xpath("/html/body/form[1]/p/input"));

        Thread.sleep(50);

        button.click();

        WebElement username = driver.findElement(By.xpath("/html/body/span"));

        assertTrue(username.getText().trim().contains("Brot"));
    }
    @Test
    public void testShowProduct() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/dev-tools/chromedriver_win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://localhost:7070/products");
        String title = driver.getTitle();

        WebElement description = driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
        description.sendKeys("0");


        WebElement button = driver.findElement(By.xpath("/html/body/form[1]/p/input"));

        Thread.sleep(50);

        button.click();

        WebElement username = driver.findElement(By.xpath("/html/body/span[2]"));

        assertTrue(username.getText().trim().contains("Brot"));
    }
}
