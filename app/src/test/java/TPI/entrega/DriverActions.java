package TPI.entrega;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class DriverActions {
    public static void click(By element){
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.visibilityOfElementLocated(element),
                        ExpectedConditions.elementToBeClickable(element),
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element),
                        ExpectedConditions.elementToBeClickable(element)
                )
        );
        ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", DriverManager.getDriver().findElement(element));
        
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

    public static Boolean isSelect(By element) {
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element),
                        ExpectedConditions.elementToBeClickable(element)
                )
        );
        return DriverManager.getDriver().findElement(element).isSelected();
    }

    public static void selectOption(By element, String value){
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element)
                )
        );
        Select select = new Select(DriverManager.getDriver().findElement(element));
        select.selectByValue(value);
    }
}
