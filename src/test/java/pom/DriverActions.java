package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class DriverActions {
    public static void click(By element){
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.elementToBeClickable(element)

                )
        );

        DriverManager.getDriver().findElement(element).click();
    }

      public static void insertText(By element, String text){
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element)
                )
        );

        //Limpiamos el contenido del input
        DriverManager.getDriver().findElement(element).clear();

        //Ingresamos el texto en el input
        DriverManager.getDriver().findElement(element).sendKeys(text);
    }

    public static String getText(By element) {
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element)
                )
        );

        return DriverManager.getDriver().findElement(element).getText();
    }

    public static Boolean isVisible(By element) {
        return DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element)
                )
        );
    }

    public static Boolean isEnabled(By element) {
        return DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element),
                        ExpectedConditions.elementToBeClickable(element)
                )
        );
    }

    public static void selectValue(By element, String state){
        Select selectList = new Select(DriverManager.getDriver().findElement(element));
        selectList.selectByVisibleText(state);

    }

    public static void explicitWait(By element)  {

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20));
        DriverManager.getWait().until(
                ExpectedConditions.presenceOfElementLocated(element)
        );

    }

    public static void explicitWaitNoLoading()  {

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        DriverManager.getWait().until(
                ExpectedConditions.not(ExpectedConditions.elementToBeClickable(By.className("loading-mask") ))
        );

    }


    }
