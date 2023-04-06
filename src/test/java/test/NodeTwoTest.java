package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class NodeTwoTest extends Base {
    private WebDriver driver;
    private String toSendTest = "Hello DD2482! This is NODE 2. This node is testing Firefox";

    @Test
    public void testTwo() {
        this.driver.manage().deleteAllCookies();
        this.driver.manage().window().maximize();
        this.driver.get("http://www.amazon.se");
        final WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));

        searchBar.click();
        searchBar.sendKeys(toSendTest);

    }

    @BeforeMethod
    public void setup() {
        try {
            this.driver = initializeBrowser("firefox", "http://192.168.0.11:5555");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
