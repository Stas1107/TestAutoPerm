package Solution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPermissions {
WebDriver Firefox;
public void login (String a, String b) {
    Firefox.findElement(By.cssSelector("#Login")) .sendKeys(a);
    Firefox.findElement(By.cssSelector(".btn")) .click();
    Firefox.findElement(By.cssSelector("#Password")) .sendKeys(b);
    Firefox.findElement(By.cssSelector(".btn")) .click();
}
public void logOut() {
    Firefox.findElement(By.cssSelector("div.col-xs-3:nth-child(1) > a:nth-child(1) > img:nth-child(1)")) .click();
    WebElement dynamicElement4 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.dropdown-toggle")));
    Firefox.findElement(By.cssSelector("button.dropdown-toggle")) .click();
    WebElement dynamicElement5 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".dropdown-menu > li:nth-child(3) > a:nth-child(1)")));
    Firefox.findElement(By.cssSelector(".dropdown-menu > li:nth-child(3) > a:nth-child(1)")) .click();
    Firefox.findElement(By.cssSelector("div.media-body:nth-child(1)")) .click();
    }
public void setPermissions (String a, String b) {
    Firefox.findElement(By.cssSelector("#menuRolesController > a:nth-child(1)")) .click();
    WebElement dynamicElement9 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#gridTemplateTable > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(26) > p:nth-child(1) > a:nth-child(1)")));
    WebElement dynamicElement1 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nav-stacked > li:nth-child(2) > a:nth-child(1)")));
    Firefox.findElement(By.cssSelector(".nav-stacked > li:nth-child(2) > a:nth-child(1)")) .click();
    WebElement dynamicElement2 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.form-control:nth-child(1)")));
    Firefox.findElement(By.cssSelector("input.form-control:nth-child(1)")) .sendKeys("Adams");
    WebElement dynamicElement3 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".list-group-item")));
    Firefox.findElement(By.cssSelector(".list-group-item")) .click();
    WebElement dynamicElement6 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".btn-s-md")));
    Firefox.findElement(By.cssSelector(".btn-s-md")) .click();
    WebElement dynamicElement7 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".fa-edit")));
    Firefox.findElement(By.cssSelector(".fa-edit")) .click();
    if (a == "Y") {
    } else {
        Firefox.findElement(By.cssSelector("div.form-group:nth-child(13) > div:nth-child(2) > div:nth-child(1) > label:nth-child(1) > span:nth-child(3)")) .click();
    }
    if (b == "Y") {
    } else {
        Firefox.findElement(By.cssSelector("div.form-group:nth-child(18) > div:nth-child(2) > div:nth-child(1) > label:nth-child(1) > span:nth-child(3)")) .click();
    }
    Firefox.findElement(By.cssSelector("button.btn-lg:nth-child(2)")) .click();
    WebElement dynamicElement10 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div:nth-child(2) > div:nth-child(1)")));
    WebElement dynamicElement8 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-button-ok")));
    Firefox.findElement(By.cssSelector("#message-button-ok")) .click();
    WebElement dynamicElement25 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#gridTemplateTable > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(26) > p:nth-child(1) > a:nth-child(1)")));
    }
public void shareVideoWithUser (String a, String b) {
    WebElement dynamicElement6 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#menuFilesController > a:nth-child(1)")));
    Firefox.findElement(By.cssSelector("#menuFilesController > a:nth-child(1)")) .click();
    WebElement dynamicElement11 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")));
    Firefox.findElement(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")) .click();
    Firefox.findElement(By.cssSelector(".search-container > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")) .sendKeys("autotestvideo1.AVI");
    Firefox.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
    Firefox.findElement(By.cssSelector(".btn-s-md")) .click();
    WebElement dynamicElement12 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
    Firefox.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
    WebElement dynamicElement13 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".vjs-big-play-button")));
    Firefox.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
    WebElement dynamicElement14 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[7]/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/div[3]/span[2]")));
    Firefox.findElement(By.cssSelector("div.col-xs-2:nth-child(2) > a:nth-child(1)")) .click();
    Firefox.findElement(By.cssSelector("div.col-xs-2:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")) .click();
    WebElement dynamicElement15 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#users-dropdown-multiple-edit")));
    Firefox.findElement(By.cssSelector("#users-dropdown-multiple-edit")) .sendKeys("Adam2");
    WebElement dynamicElement16 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#list-group-item-0")));
    Firefox.findElement(By.cssSelector("#list-group-item-0")) .click();
    Firefox.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > textarea:nth-child(2)")) .sendKeys("Stas auto test");
    if (a == "Y") {
        Firefox.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > span:nth-child(2)")) .click();
    } else {}
    if (b == "Y") {
        Firefox.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > label:nth-child(1) > span:nth-child(2)")) .click();
    } else {}
    Firefox.findElement(By.cssSelector("div.share-details:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")) .click();
    WebElement dynamicElement17 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")));
    WebElement dynamicElement18 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-button-ok")));
    Firefox.findElement(By.cssSelector("#message-button-ok")) .click();
    WebElement dynamicElement19 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.results-container:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > p:nth-child(1) > a:nth-child(1)")));
    Firefox.findElement(By.cssSelector("#sharedLinkModal > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")) .click();
}
public void checkShareVideoWithUser (){
    Firefox.findElement(By.cssSelector("#menuFilesController > a:nth-child(1)")) .click();
    WebElement dynamicElement20 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nav-stacked > li:nth-child(15) > a:nth-child(1)")));
    Firefox.findElement(By.cssSelector(".nav-stacked > li:nth-child(15) > a:nth-child(1)")) .click();
    WebElement dynamicElement21 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".chosen-single > span:nth-child(1)")));
    Firefox.findElement(By.cssSelector(".chosen-single > span:nth-child(1)")) .click();
    Firefox.findElement(By.cssSelector("li.active-result:nth-child(2)")) .click();
    Firefox.findElement(By.cssSelector("span.btn-rounded")) .click();
    Firefox.findElement(By.cssSelector(".btn-s-md")) .click();
    WebElement dynamicElement22 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
    Firefox.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
    WebElement dynamicElement23 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".vjs-big-play-button")));
    Firefox.findElement(By.cssSelector("#make-copy")) .click();
    WebElement dynamicElement24 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(1)")));
    Firefox.findElement(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > textarea:nth-child(1)")) .sendKeys("Stas auto test");
    Firefox.findElement(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")) .click();
    WebElement dynamicElement26 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".vjs-big-play-button")));
}

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        Firefox = new ChromeDriver();
        Firefox.get ("https://securitytest.vievusolution.com");
    }

    @Test
    public void test() {
    login("Adam2", "vievu123");
    shareVideoWithUser("Y", "Y");
    checkShareVideoWithUser();
    logOut();
    }

    //@After
    //public void tearDown() {
            //Firefox.quit();
    //}
}
