import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.Assert.assertEquals;

public class Main
{
    public static void main(String[] args) {
        //Establecer la propiedad webdriver.chrome.driver
        //Con la ubicación del chromedriver que descargamos

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\danie\\Desktop\\chromedriver.exe");

        //Creamos una nueva instancia de Chrome Driver
        WebDriver driver = new ChromeDriver();

        //Hacemos una llamada a esta página
        driver.get("https://www.spotify.com/mx/signup/");


        driver.findElement(By.id("email")).sendKeys("daniela@prueba.com");
        driver.findElement(By.id("confirm")).sendKeys("daniela@prueba.com");
        driver.findElement(By.id("password")).sendKeys("pruebaprueba2");
        driver.findElement(By.id("displayname")).sendKeys("dani");
        driver.findElement(By.id("day")).sendKeys("04");
        driver.findElement(By.cssSelector("#month > option:nth-child(4)")).click();
        driver.findElement(By.id("year")).sendKeys("1998");
        driver.findElement(By.cssSelector("#__next > main > div.signuppage__Signup-sof6g5-0.cnXhNZ > form > div:nth-child(6) > div.GenderSelect__FlexRow-v1a8zn-0.eHAjfo > label:nth-child(2) > span.Indicator-sc-16vj7o8-0.kSKYRE")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/form/div[8]")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/form/div[9]/div/button")).click();



       /* //subir archivo
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
        String alertText = alert.getText();
        assertEquals("The form was successfully submitted!", alertText);

        driver.quit();*/

    }
    public static void waitForAlertBanner(WebDriver driver)
    {
        WebDriverWait wait= new WebDriverWait(driver, 10);
        WebElement alert=
                wait.until((ExpectedConditions.visibilityOfElementLocated(By.className
                        ("alert"))));
    }
    public static String getAlertBannerText(WebDriver driver)
    {
        return driver.findElement(By.className("alert")).getText();
    }


}



