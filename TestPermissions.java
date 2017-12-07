package Solution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


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
public void setPermissions (String UserName, String a, String b) {
    Firefox.findElement(By.cssSelector("#menuRolesController > a:nth-child(1)")) .click();
    WebElement dynamicElement9 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#gridTemplateTable > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(26) > p:nth-child(1) > a:nth-child(1)")));
    WebElement dynamicElement1 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nav-stacked > li:nth-child(2) > a:nth-child(1)")));
    Firefox.findElement(By.cssSelector(".nav-stacked > li:nth-child(2) > a:nth-child(1)")) .click();
    WebElement dynamicElement2 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.form-control:nth-child(1)")));
    Firefox.findElement(By.cssSelector("input.form-control:nth-child(1)")) .sendKeys(UserName);
    WebElement dynamicElement3 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".list-group-item")));
    Firefox.findElement(By.cssSelector(".list-group-item")) .click();
    WebElement dynamicElement6 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".btn-s-md")));
    Firefox.findElement(By.cssSelector(".btn-s-md")) .click();
    WebElement dynamicElement7 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"gridTemplateTable\"]/tbody/tr/td[26]/p/a")));
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    Firefox.findElement(By.xpath("//*[@id=\"gridTemplateTable\"]/tbody/tr/td[26]/p/a")) .click();
    WebElement dyn1 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#editRoleForm > div > div.nopadding.col-xs-4 > div:nth-child(1) > h3")));
    if (a == "N") {
        Firefox.findElement(By.xpath("//*[@id=\"editRoleForm\"]/div/div[2]/div[13]/div/div/label/span[2]")).click();
    }
    if (b == "N") {
        Firefox.findElement(By.xpath("//*[@id=\"editRoleForm\"]/div/div[2]/div[18]/div/div/label/span[2]")).click();
    }
    try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    Firefox.findElement(By.cssSelector("#editRoleModal > div.modal-dialog > div > div.modal-footer > button.btn.btn-primary.btn-lg")) .click();
    WebElement dynamicElement10 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div:nth-child(2) > div:nth-child(1)")));
    WebElement dynamicElement8 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-button-ok")));
    Firefox.findElement(By.cssSelector("#message-button-ok")) .click();
    WebElement dynamicElement25 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#gridTemplateTable > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(26) > p:nth-child(1) > a:nth-child(1)")));
    }
    public void shareVideoWithUser (String user, String video, String a, String b) {
        try {
        Thread.sleep(500);
        }catch (InterruptedException e) {
        e.printStackTrace();
        }
    WebElement dynamicElement6 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#menuFilesController > a:nth-child(1)")));
    Firefox.findElement(By.cssSelector("#menuFilesController > a:nth-child(1)")) .click();
    WebElement dynamicElement11 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")));
    Firefox.findElement(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")) .click();
    Firefox.findElement(By.cssSelector(".search-container > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")) .sendKeys(video);
    Firefox.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
    Firefox.findElement(By.cssSelector(".btn-s-md")) .click();
    WebElement dynamicElement12 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
    Firefox.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
    WebElement dynamicElement13 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".vjs-big-play-button")));
    Firefox.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
    WebElement myDynamicElement = Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div.row.shared-link-wrapper > div > div > div > div.row.pager-container > div.fromto > div:nth-child(3) > span:nth-child(2)"));
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a")) .click();
    Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(1) > a")) .click();
    WebElement dynamicElement15 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#users-dropdown-multiple-edit")));
    Firefox.findElement(By.cssSelector("#users-dropdown-multiple-edit")) .sendKeys(user);
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
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    Firefox.findElement(By.cssSelector("#sharedLinkModal > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")) .click();
}
    public void shareRedactedVideoWithUser (String user, String video, String a, String b) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement dynamicElement6 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#menuFilesController > a:nth-child(1)")));
        Firefox.findElement(By.cssSelector("#menuFilesController > a:nth-child(1)")) .click();
        WebElement dynamicElement11 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")));
        Firefox.findElement(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")) .click();
        Firefox.findElement(By.cssSelector(".search-container > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")) .sendKeys(video);
        Firefox.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
        Firefox.findElement(By.cssSelector(".btn-s-md")) .click();
        WebElement dynamicElement12 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
        Firefox.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
        WebElement dynamicElement13 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".vjs-big-play-button")));
        Firefox.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(7) > a")).click();
        WebElement dynamicElement31 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#selected-redact-item > div.overflow-wrapper > div:nth-child(2) > div.col-xs-2 > div:nth-child(2) > a")));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Firefox.findElement(By.cssSelector("#selected-redact-item > div.overflow-wrapper > div:nth-child(2) > div.col-xs-2 > div:nth-child(2) > a")) .click(); //кнопка шаре
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a")) .click(); //кнопка +
        Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(1) > a")) .click(); //with user
        WebElement dynamicElement15 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#users-dropdown-multiple-edit"))); //ожидание поля шаре вих юзер
        Firefox.findElement(By.cssSelector("#users-dropdown-multiple-edit")) .sendKeys(user);
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Firefox.findElement(By.cssSelector("#sharedLinkModal > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")) .click();
        Firefox.findElement(By.cssSelector("#redactVideoModal > div.modal-dialog > div > div > button > span:nth-child(1)")).click();
    }
    public void shareRedactedClipWithUser (String user, String video, String a, String b) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement dynamicElement6 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#menuFilesController > a:nth-child(1)")));
        Firefox.findElement(By.cssSelector("#menuFilesController > a:nth-child(1)")) .click();
        WebElement dynamicElement11 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")));
        Firefox.findElement(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")) .click();
        Firefox.findElement(By.cssSelector(".search-container > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")) .sendKeys(video);
        Firefox.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
        Firefox.findElement(By.cssSelector(".btn-s-md")) .click();
        WebElement dynamicElement12 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
        Firefox.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
        WebElement dynamicElement13 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".vjs-big-play-button")));
        Firefox.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(6) > a")).click();
        WebElement dynamicElement31 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#selected-redact-item > div.overflow-wrapper > div:nth-child(2) > div.col-xs-2 > div:nth-child(2) > a")));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Firefox.findElement(By.cssSelector("#selected-redact-item > div.overflow-wrapper > div:nth-child(2) > div.col-xs-2 > div:nth-child(2) > a")) .click(); //кнопка шаре
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a")) .click(); //кнопка +
        Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(1) > a")) .click(); //with user
        WebElement dynamicElement15 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#users-dropdown-multiple-edit"))); //ожидание поля шаре вих юзер
        Firefox.findElement(By.cssSelector("#users-dropdown-multiple-edit")) .sendKeys(user);
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Firefox.findElement(By.cssSelector("#sharedLinkModal > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")) .click();
        Firefox.findElement(By.cssSelector("#redactVideoModal > div.modal-dialog > div > div > button > span:nth-child(1)")).click();
    }
    public void shareFileWithUser (String user, String file, String a, String b) {
        try {
            Thread.sleep(500);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement dynamicElement6 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#menuFilesController > a:nth-child(1)")));
        Firefox.findElement(By.cssSelector("#menuFilesController > a:nth-child(1)")) .click();
        WebElement dynamicElement11 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")));
        Firefox.findElement(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")) .click();
        Firefox.findElement(By.cssSelector("#search-panel-file-name-filter-template > div:nth-child(1) > div > div:nth-child(2) > div > ul > li:nth-child(3) > a")).click();
        Firefox.findElement(By.cssSelector(".search-container > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")) .sendKeys(file);
        Firefox.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
        Firefox.findElement(By.cssSelector(".btn-s-md")) .click();
        WebElement dynamicElement12 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
        Firefox.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Firefox.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(2) > a")) .click();
        WebElement myDynamicElement = Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div.row.shared-link-wrapper > div > div > div > div.row.pager-container > div.fromto > div:nth-child(3) > span:nth-child(2)"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a")) .click();
        Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(1) > a")) .click();
        WebElement dynamicElement15 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#users-dropdown-multiple-edit")));
        Firefox.findElement(By.cssSelector("#users-dropdown-multiple-edit")) .sendKeys(user);
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Firefox.findElement(By.cssSelector("#sharedLinkModal > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")) .click();
    }
    public void shareVideoByEmail (String email, String video, String a, String b) {
        try {
            Thread.sleep(500);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement dynamicElement6 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#menuFilesController > a:nth-child(1)")));
        Firefox.findElement(By.cssSelector("#menuFilesController > a:nth-child(1)")) .click();
        WebElement dynamicElement11 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")));
        Firefox.findElement(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")) .click();
        Firefox.findElement(By.cssSelector(".search-container > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")) .sendKeys(video);
        Firefox.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
        Firefox.findElement(By.cssSelector(".btn-s-md")) .click();
        WebElement dynamicElement12 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
        Firefox.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
        WebElement dynamicElement13 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".vjs-big-play-button")));
        Firefox.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
        WebElement myDynamicElement = Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div.row.shared-link-wrapper > div > div > div > div.row.pager-container > div.fromto > div:nth-child(3) > span:nth-child(2)"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a")) .click();
        Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(2) > a")) .click();
        WebElement dynamicElement15 = (new WebDriverWait(Firefox, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#editSharedCasePopup > div.modal-dialog.share-details > div > div.modal-body.edit-shared-case-popup-body > div:nth-child(1) > div.col-xs-5 > div > div:nth-child(2) > div > div > div > span > input")));
        Firefox.findElement(By.cssSelector("#editSharedCasePopup > div.modal-dialog.share-details > div > div.modal-body.edit-shared-case-popup-body > div:nth-child(1) > div.col-xs-5 > div > div:nth-child(2) > div > div > div > span > input")) .sendKeys(email);
        Firefox.findElement(By.cssSelector("#editSharedCasePopup > div.modal-dialog.share-details > div > div.modal-body.edit-shared-case-popup-body > div:nth-child(1) > div.col-xs-5 > div > div:nth-child(2) > div > div > div > span > button")) .click();
        Firefox.findElement(By.cssSelector("#editSharedCasePopup > div.modal-dialog.share-details > div > div.modal-body.edit-shared-case-popup-body > div:nth-child(2) > div.col-xs-7 > div > div > div > textarea")) .sendKeys("Stas auto test");
        if (a == "Y") {
            Firefox.findElement(By.cssSelector("#editSharedCasePopup > div.modal-dialog.share-details > div > div.modal-body.edit-shared-case-popup-body > div:nth-child(3) > div.col-xs-5 > div:nth-child(1) > div > div.input-control.switch.pull-left > label > span")) .click();
        } else {}
        if (b == "Y") {
            Firefox.findElement(By.cssSelector("#editSharedCasePopup > div.modal-dialog.share-details > div > div.modal-body.edit-shared-case-popup-body > div:nth-child(3) > div.col-xs-5 > div:nth-child(2) > div.clearfix.metro > div > label > span")) .click();
        } else {}
        Firefox.findElement(By.cssSelector("#editSharedCasePopup > div.modal-dialog.share-details > div > div.modal-footer > button.btn.btn-primary")) .click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement dynamicElement17 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div.modal-dialog > div > div.modal-header")));
        WebElement dynamicElement18 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"message-button-ok\"]")));
        Firefox.findElement(By.xpath("//*[@id=\"message-button-ok\"]")).click();
        WebElement dynamicElement19 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.results-container:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > p:nth-child(1) > a:nth-child(1)")));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Firefox.findElement(By.cssSelector("#sharedLinkModal > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")) .click();
    }
public void checkShareVideoWithUser (String a, String b){
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
    if (a == "Y") {
        Firefox.findElement(By.cssSelector("#make-copy")).click();
        WebElement dynamicElement24 = (new WebDriverWait(Firefox, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(1)")));
        Firefox.findElement(By.cssSelector("#makeCopyDescriptionModal > div.modal-dialog > div > div.modal-body > div:nth-child(2) > textarea")).sendKeys("Stas auto test");
        Firefox.findElement(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
        WebElement dynamicElement26 = (new WebDriverWait(Firefox, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".vjs-big-play-button")));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    if (b == "Y") {
        Firefox.findElement(By.cssSelector("#export-audit-log")).click();
        WebElement dynamicElement = Firefox.findElement(By.cssSelector("#confirmation-modal-popup > div.modal-dialog > div > div.modal-header"));
        Firefox.findElement(By.cssSelector("#confirmation-button-yes")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    Firefox.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    Firefox.findElement(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(7) > p > a")) .click();
    Firefox.findElement(By.cssSelector("#confirmation-button-yes")) .click();
    WebElement myDynamicElement = Firefox.findElement(By.cssSelector("#message-modal-popup > div.modal-dialog > div > div.modal-header"));
    WebElement dynamicElement25 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div.modal-dialog > div > div.modal-header")));
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    Firefox.findElement(By.cssSelector("#message-modal-popup > div.modal-dialog > div > div.modal-header > button > span:nth-child(1)")).click();
    Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > button > span:nth-child(1)")) .click();
}
    public void checkShareFileWithUser (String a, String b){
        Firefox.findElement(By.cssSelector("#menuFilesController > a:nth-child(1)")) .click();
        WebElement dynamicElement20 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nav-stacked > li:nth-child(15) > a:nth-child(1)")));
        Firefox.findElement(By.cssSelector(".nav-stacked > li:nth-child(15) > a:nth-child(1)")) .click();
        WebElement dynamicElement21 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".chosen-single > span:nth-child(1)")));
        Firefox.findElement(By.cssSelector(".chosen-single > span:nth-child(1)")) .click();
        Firefox.findElement(By.cssSelector("li.active-result:nth-child(2)")) .click();
        Firefox.findElement(By.cssSelector("span.btn-rounded")) .click();
        Firefox.findElement(By.cssSelector("#videosContainer > div.col-xs-12.video-search-column > div > div.col-xs-3.search-container > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(2) > div > ul > li:nth-child(2) > a")).click();
        Firefox.findElement(By.cssSelector(".btn-s-md")) .click();
        WebElement dynamicElement22 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#videosContainer > div.col-xs-12.video-search-column > div > div.col-xs-6.results-container > div > div.panel-body > div:nth-child(1) > div > a > div")));
        Firefox.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (a == "Y") {
            Firefox.findElement(By.cssSelector("#make-copy")).click();
            WebElement dynamicElement24 = (new WebDriverWait(Firefox, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(1)")));
            Firefox.findElement(By.cssSelector("#makeCopyDescriptionModal > div.modal-dialog > div > div.modal-body > div:nth-child(2) > textarea")).sendKeys("Stas auto test");
            Firefox.findElement(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (b == "Y") {
            Firefox.findElement(By.cssSelector("#export-audit-log")).click();
            WebElement dynamicElement = Firefox.findElement(By.cssSelector("#confirmation-modal-popup > div.modal-dialog > div > div.modal-header"));
            Firefox.findElement(By.cssSelector("#confirmation-button-yes")).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Firefox.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(2) > a")) .click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Firefox.findElement(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(7) > p > a")) .click();
        Firefox.findElement(By.cssSelector("#confirmation-button-yes")) .click();
        WebElement myDynamicElement = Firefox.findElement(By.cssSelector("#message-modal-popup > div.modal-dialog > div > div.modal-header"));
        WebElement dynamicElement25 = (new WebDriverWait(Firefox, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div.modal-dialog > div > div.modal-header")));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Firefox.findElement(By.cssSelector("#message-modal-popup > div.modal-dialog > div > div.modal-header > button > span:nth-child(1)")).click();
        Firefox.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > button > span:nth-child(1)")) .click();
    }
    public void checkShareVideoByEmail (String email, String a, String b) {
        Firefox.get("https://temp-mail.ru/");
        WebDriverWait wait = new WebDriverWait(Firefox, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#click-to-change")));
        Firefox.findElement(By.cssSelector("#click-to-change")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mail")));
        Firefox.findElement(By.className("form-control")).sendKeys("adam2");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#postbut")));
        Firefox.findElement(By.cssSelector("#postbut")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#click-to-refresh")));
        Firefox.findElement(By.cssSelector("#click-to-refresh")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mails > tbody > tr > td:nth-child(2) > a")));
        Firefox.findElement(By.cssSelector("#mails > tbody > tr > td:nth-child(2) > a")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div.page-content > div > div > div.col-sm-8 > div > div > div.pm-text > div > div > a")));
        Firefox.findElement(By.cssSelector("body > div.page-content > div > div > div.col-sm-8 > div > div > div.pm-text > div > div > a")).click();



        //Попытка написать что то толковое
        //WebElement previousTime = Firefox.findElement(By.cssSelector("#nbmail"));
        //previousTime.getAttribute("value");
        //WebElement newTime;
        //do {
            //try {
                //Thread.sleep(10000);
            //} catch (InterruptedException e) {
                //e.printStackTrace();
            //}
            //Firefox.findElement(By.cssSelector("#lrefr > span")).click();
            //WebElement dynamicElemen32 = (new WebDriverWait(Firefox, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#nbmail")));
            //newTime = Firefox.findElement(By.cssSelector("#nbmail"));
            //newTime.getAttribute("value");
            //System.out.println (newTime);
        //} while (previousTime == newTime);





        //try {
        //    Thread.sleep(60000);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}

    }


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        Firefox = new ChromeDriver();
        Firefox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Firefox.get ("https://securitytest.vievusolution.com");
        Firefox.manage().window().maximize();
    }

    @Test
    public void test () {
        //login("s.vasilyev", "vievu123");
        //shareVideoByEmail("adam2@p33.org", "autotestvideo1.AVI", "Y", "Y");
        checkShareVideoByEmail("vievuadam2@yopmail.com", "Y", "Y");
    }




    //======================================================================================================================================================================
    @Test
    public void userNNsharedVideoNN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "N", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("N", "N");
        setPermissions("Adam2", "N", "N");
    }

    @Test
    public void userNNsharedVideoYN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "Y", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "N");
        setPermissions("Adam2", "N", "N");
    }

    @Test
    public void userNNsharedVideoNY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "N", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("N", "Y");
        setPermissions("Adam2", "N", "N");
    }

    @Test
    public void userNNsharedVideoYY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "Y", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        setPermissions("Adam2", "N", "N");
    }
    //======================================================================================================================================================================
    @Test
    public void userYYsharedVideoNN() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "N", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("N", "N");
        logOut();
    }

    @Test
    public void userYYsharedVideoYN() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "Y", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userYYsharedVideoNY() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "N", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userYYsharedVideoYY() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "Y", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupNNsharedVideoNN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "N", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("N", "N");
        setPermissions("Adam2", "N", "N");
    }

    @Test
    public void groupNNsharedVideoYN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "Y", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "N");
        setPermissions("Adam2", "N", "N");
    }

    @Test
    public void groupNNsharedVideoNY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "N", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("N", "Y");
        setPermissions("Adam2", "N", "N");
    }

    @Test
    public void groupNNsharedVideoYY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "Y", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        setPermissions("Adam2", "N", "N");
    }

    //======================================================================================================================================================================
    @Test
    public void groupYYsharedVideoNN() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "N", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("N", "N");
        logOut();
    }

    @Test
    public void groupYYsharedVideoYN() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "Y", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupYYsharedVideoNY() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "N", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedVideoYY() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "Y", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    //======================================================================================================================================================================
    @Test
    public void userNNsharedRedactedVideoNN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "N", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("N", "N");
        setPermissions("Adam3", "N", "N");
    }

    @Test
    public void userNNsharedRedactedVideoYN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "Y", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("Y", "N");
        setPermissions("Adam3", "N", "N");
    }

    @Test
    public void userNNsharedRedactedVideoNY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "N", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("N", "Y");
        setPermissions("Adam3", "N", "N");
    }

    @Test
    public void userNNsharedRedactedVideoYY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "Y", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        setPermissions("Adam3", "N", "N");
    }
    //======================================================================================================================================================================
    @Test
    public void userYYsharedRedactedVideoNN() {
        login("s.vasilyev", "vievu123");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "N", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("N", "N");
        logOut();
    }

    @Test
    public void userYYsharedRedactedVideoYN() {
        login("s.vasilyev", "vievu123");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "Y", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userYYsharedRedactedVideoNY() {
        login("s.vasilyev", "vievu123");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "N", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userYYsharedRedactedVideoYY() {
        login("s.vasilyev", "vievu123");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "Y", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupNNsharedRedactedVideoNN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "N", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("N", "N");
        setPermissions("Adam3", "N", "N");
    }

    @Test
    public void groupNNsharedRedactedVideoYN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "Y", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("Y", "N");
        setPermissions("Adam3", "N", "N");
    }

    @Test
    public void groupNNsharedRedactedVideoNY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "N", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("N", "Y");
        setPermissions("Adam3", "N", "N");
    }

    @Test
    public void groupNNsharedRedactedVideoYY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "Y", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        setPermissions("Adam3", "N", "N");
    }

    //======================================================================================================================================================================
    @Test
    public void groupYYsharedRedactedVideoNN() {
        login("s.vasilyev", "vievu123");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "N", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("N", "N");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedVideoYN() {
        login("s.vasilyev", "vievu123");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "Y", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedVideoNY() {
        login("s.vasilyev", "vievu123");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "N", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedVideoYY() {
        login("s.vasilyev", "vievu123");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "Y", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    //======================================================================================================================================================================
    @Test
    public void userNNsharedFileNN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "N", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("N", "N");
        setPermissions("Adam4", "N", "N");
    }

    @Test
    public void userNNsharedFileYN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "Y", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "N");
        setPermissions("Adam4", "N", "N");
    }

    @Test
    public void userNNsharedFileNY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "N", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("N", "Y");
        setPermissions("Adam4", "N", "N");
    }

    @Test
    public void userNNsharedFileYY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "Y", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "Y");
        setPermissions("Adam4", "N", "N");
    }
    //======================================================================================================================================================================
    @Test
    public void userYYsharedFileNN() {
        login("s.vasilyev", "vievu123");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "N", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("N", "N");
        logOut();
    }

    @Test
    public void userYYsharedFileYN() {
        login("s.vasilyev", "vievu123");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "Y", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userYYsharedFileNY() {
        login("s.vasilyev", "vievu123");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "N", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userYYsharedFileYY() {
        login("s.vasilyev", "vievu123");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "Y", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupNNsharedFileNN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "N", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("N", "N");
        setPermissions("Adam4", "N", "N");
    }

    @Test
    public void groupNNsharedFileYN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "Y", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "N");
        setPermissions("Adam4", "N", "N");
    }

    @Test
    public void groupNNsharedFileNY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "N", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("N", "Y");
        setPermissions("Adam4", "N", "N");
    }

    @Test
    public void groupNNsharedFileYY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "Y", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "Y");
        setPermissions("Adam4", "N", "N");
    }

    //======================================================================================================================================================================
    @Test
    public void groupYYsharedFileNN() {
        login("s.vasilyev", "vievu123");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "N", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("N", "N");
        logOut();
    }

    @Test
    public void groupYYsharedFileYN() {
        login("s.vasilyev", "vievu123");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "Y", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupYYsharedFileNY() {
        login("s.vasilyev", "vievu123");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "N", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedFileYY() {
        login("s.vasilyev", "vievu123");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "Y", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    //======================================================================================================================================================================
    @Test
    public void userNNsharedClipNN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("N", "N");
        setPermissions("Adam5", "N", "N");
    }

    @Test
    public void userNNsharedClipYN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "N");
        setPermissions("Adam5", "N", "N");
    }

    @Test
    public void userNNsharedClipNY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("N", "Y");
        setPermissions("Adam5", "N", "N");
    }

    @Test
    public void userNNsharedClipYY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        setPermissions("Adam5", "N", "N");
    }
    //======================================================================================================================================================================
    @Test
    public void userYYsharedClipNN() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("N", "N");
        logOut();
    }

    @Test
    public void userYYsharedClipYN() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userYYsharedClipNY() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userYYsharedClipYY() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupNNsharedClipNN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("N", "N");
        setPermissions("Adam5", "N", "N");
    }

    @Test
    public void groupNNsharedClipYN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "N");
        setPermissions("Adam5", "N", "N");
    }

    @Test
    public void groupNNsharedClipNY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("N", "Y");
        setPermissions("Adam5", "N", "N");
    }

    @Test
    public void groupNNsharedClipYY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        setPermissions("Adam5", "N", "N");
    }

    //======================================================================================================================================================================
    @Test
    public void groupYYsharedClipNN() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("N", "N");
        logOut();
    }

    @Test
    public void groupYYsharedClipYN() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupYYsharedClipNY() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedClipYY() {
        login("s.vasilyev", "vievu123");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    //======================================================================================================================================================================
    @Test
    public void userNNsharedRedactedClipNN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("N", "N");
        setPermissions("Adam6", "N", "N");
    }

    @Test
    public void userNNsharedRedactedClipYN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("Y", "N");
        setPermissions("Adam6", "N", "N");
    }

    @Test
    public void userNNsharedRedactedClipNY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("N", "Y");
        setPermissions("Adam6", "N", "N");
    }

    @Test
    public void userNNsharedRedactedClipYY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        setPermissions("Adam6", "N", "N");
    }
    //======================================================================================================================================================================
    @Test
    public void userYYsharedRedactedClipNN() {
        login("s.vasilyev", "vievu123");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("N", "N");
        logOut();
    }

    @Test
    public void userYYsharedRedactedClipYN() {
        login("s.vasilyev", "vievu123");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userYYsharedRedactedClipNY() {
        login("s.vasilyev", "vievu123");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userYYsharedRedactedClipYY() {
        login("s.vasilyev", "vievu123");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupNNsharedRedactedClipNN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("N", "N");
        setPermissions("Adam6", "N", "N");
    }

    @Test
    public void groupNNsharedRedactedClipYN() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("Y", "N");
        setPermissions("Adam6", "N", "N");
    }

    @Test
    public void groupNNsharedRedactedClipNY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("N", "Y");
        setPermissions("Adam6", "N", "N");
    }

    @Test
    public void groupNNsharedRedactedClipYY() {
        login("s.vasilyev", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        setPermissions("Adam6", "N", "N");
    }

    //======================================================================================================================================================================
    @Test
    public void groupYYsharedRedactedClipNN() {
        login("s.vasilyev", "vievu123");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("N", "N");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedClipYN() {
        login("s.vasilyev", "vievu123");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedClipNY() {
        login("s.vasilyev", "vievu123");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedClipYY() {
        login("s.vasilyev", "vievu123");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    //======================================================================================================================================================================

    //@After
    //public void tearDown() {
           // Firefox.quit();
    //}
}
