package co.com.sophos.pruebasophos.util;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll extends PageObject{

    public void scroll(WebElementFacade elemento) throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) getDriver());
        js.executeScript("arguments[0].scrollIntoView(true);", elemento);
    }
}
