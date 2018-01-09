package Solution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


    public class TestPermissions {
    WebDriver driver;
    void login(String a, String b) {
        driver.findElement(By.cssSelector("#Login")) .sendKeys(a);
        driver.findElement(By.cssSelector(".btn")) .click();
        driver.findElement(By.cssSelector("#Password")) .sendKeys(b);
        driver.findElement(By.cssSelector(".btn")) .click();
    }
    void logOut() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.col-xs-3:nth-child(1) > a:nth-child(1) > img:nth-child(1)")));
        driver.findElement(By.cssSelector("div.col-xs-3:nth-child(1) > a:nth-child(1) > img:nth-child(1)")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.dropdown-toggle")));
        driver.findElement(By.cssSelector("button.dropdown-toggle")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".dropdown-menu > li:nth-child(3) > a:nth-child(1)")));
        driver.findElement(By.cssSelector(".dropdown-menu > li:nth-child(3) > a:nth-child(1)")) .click();
        driver.findElement(By.cssSelector("div.media-body:nth-child(1)")) .click();
    }
    void setPermissions(String UserName, String download, String audit) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuRolesController > a:nth-child(1)")));
        driver.findElement(By.cssSelector("#menuRolesController > a:nth-child(1)")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#rolesContainer > div.col-xs-12.search-column > div > div.col-xs-12.results-container.table-fixed > div > div.panel-heading.clearfix > h4 > span")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".nav-stacked > li:nth-child(2) > a:nth-child(1)")));
        driver.findElement(By.cssSelector(".nav-stacked > li:nth-child(2) > a:nth-child(1)")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.form-control:nth-child(1)")));
        driver.findElement(By.cssSelector("input.form-control:nth-child(1)")) .sendKeys(UserName);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".list-group-item")));
        driver.findElement(By.cssSelector(".list-group-item")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-s-md")));
        driver.findElement(By.cssSelector(".btn-s-md")) .click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(26) > p > a")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(26) > p > a")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#rolesContainer > div.col-xs-12.search-column > div > div.results-container.table-fixed.col-xs-9 > div > div.panel-heading.clearfix > h4 > span")));
        driver.findElement(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(26) > p > a")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"editRoleForm\"]/div/div[2]/div[13]/div/div/label/span[2]")));
        if (download.equals("Y")) {
            String downloadPermission = driver.findElement(By.cssSelector("#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(13) > div > div > span")).getAttribute("textContent");
            if (downloadPermission.equals("N")) {
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(13) > div > div > label > span.check")));
                driver.findElement(By.cssSelector("#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(13) > div > div > label > span.check")).click();
            }
        }
        if (download.equals("N")) {
            String downloadPermission = driver.findElement(By.cssSelector("#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(13) > div > div > span")).getAttribute("textContent");
            if (downloadPermission.equals("Y")) {
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(13) > div > div > label > span.check")));
                driver.findElement(By.cssSelector("#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(13) > div > div > label > span.check")).click();
            }
        }
        if (audit.equals("Y")) {
            String auditPermission = driver.findElement(By.cssSelector("#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(18) > div > div > span")).getAttribute("textContent");
            if (auditPermission.equals("N")) {
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(18) > div > div > label > span.check")));
                driver.findElement(By.cssSelector("#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(18) > div > div > label > span.check")).click();
            }
        }
        if (audit.equals("N")) {
            String auditPermission = driver.findElement(By.cssSelector("#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(18) > div > div > span")).getAttribute("textContent");
            if (auditPermission.equals("Y")) {
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(18) > div > div > label > span.check")));
                driver.findElement(By.cssSelector("#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(18) > div > div > label > span.check")).click();
            }
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#editRoleModal > div.modal-dialog > div > div.modal-footer > button.btn.btn-primary.btn-lg")));
        driver.findElement(By.cssSelector("#editRoleModal > div.modal-dialog > div > div.modal-footer > button.btn.btn-primary.btn-lg")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div.modal-dialog > div > div.modal-header")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#message-button-ok")));
        driver.findElement(By.cssSelector("#message-button-ok")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector("#menuFilesController > a")) .click();
    }
    void shareVideoWithUser(String user, String video, String download, String audit) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")));
        driver.findElement(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")) .click();
        driver.findElement(By.cssSelector(".search-container > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")) .sendKeys(video);
        driver.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
        driver.findElement(By.cssSelector(".btn-s-md")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
        driver.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"vjs_video_3\"]/div[5]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")));
        driver.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));





        String shares = driver.findElement(By.cssSelector("div.results-container:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(2)")).getAttribute("innerText");








        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a")));
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(1) > a")));
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(1) > a")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#users-dropdown-multiple-edit")));
        driver.findElement(By.cssSelector("#users-dropdown-multiple-edit")) .sendKeys(user);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#list-group-item-0")));
        driver.findElement(By.cssSelector("#list-group-item-0")) .click();
        driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > textarea:nth-child(2)")) .sendKeys("Stas auto test");
        if (download.equals("Y")) {
            driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > span:nth-child(2)")) .click();
        }
        if (audit.equals("Y")) {
            driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > label:nth-child(1) > span:nth-child(2)")) .click();
        }
        driver.findElement(By.cssSelector("div.share-details:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")) .click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#message-button-ok")));
        driver.findElement(By.cssSelector("#message-button-ok")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.results-container:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > p:nth-child(1) > a:nth-child(1)")));
        driver.findElement(By.cssSelector("#sharedLinkModal > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")) .click();
    }
    void shareRedactedVideoWithUser(String user, String video, String download, String audit) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")));
        driver.findElement(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")) .click();
        driver.findElement(By.cssSelector(".search-container > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")) .sendKeys(video);
        driver.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
        driver.findElement(By.cssSelector(".btn-s-md")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
        driver.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"vjs_video_3\"]/div[5]")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(7) > a")));
        driver.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(7) > a")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#selected-redact-item > div.overflow-wrapper > div:nth-child(2) > div.col-xs-2 > div:nth-child(2) > a")));
        driver.findElement(By.cssSelector("#selected-redact-item > div.overflow-wrapper > div:nth-child(2) > div.col-xs-2 > div:nth-child(2) > a")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"sharedLinkModal\"]/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/div[3]/span[2]")));
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(1) > a")));
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(1) > a")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#users-dropdown-multiple-edit")));
        driver.findElement(By.cssSelector("#users-dropdown-multiple-edit")) .sendKeys(user);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#list-group-item-0")));
        driver.findElement(By.cssSelector("#list-group-item-0")) .click();
        driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > textarea:nth-child(2)")) .sendKeys("Stas auto test");
        if (download.equals("Y")) {
            driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > span:nth-child(2)")) .click();
        }
        if (audit.equals("Y")) {
            driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > label:nth-child(1) > span:nth-child(2)")) .click();
        }
        driver.findElement(By.cssSelector("div.share-details:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")) .click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#message-button-ok")));
        driver.findElement(By.cssSelector("#message-button-ok")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.results-container:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > p:nth-child(1) > a:nth-child(1)")));
        driver.findElement(By.cssSelector("#sharedLinkModal > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")) .click();
        driver.findElement(By.cssSelector("#redactVideoModal > div.modal-dialog > div > div > button > span:nth-child(1)")).click();
    }
    void shareRedactedClipWithUser(String user, String video, String download, String audit) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")));
        driver.findElement(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")) .click();
        driver.findElement(By.cssSelector(".search-container > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")) .sendKeys(video);
        driver.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
        driver.findElement(By.cssSelector(".btn-s-md")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
        driver.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"vjs_video_3\"]/div[5]")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(6) > a")));
        driver.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(6) > a")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#selected-redact-item > div.overflow-wrapper > div:nth-child(2) > div.col-xs-2 > div:nth-child(2) > a")));
        driver.findElement(By.cssSelector("#selected-redact-item > div.overflow-wrapper > div:nth-child(2) > div.col-xs-2 > div:nth-child(2) > a")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"sharedLinkModal\"]/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/div[3]/span[2]")));
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(1) > a")));
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(1) > a")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#users-dropdown-multiple-edit")));
        driver.findElement(By.cssSelector("#users-dropdown-multiple-edit")) .sendKeys(user);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#list-group-item-0")));
        driver.findElement(By.cssSelector("#list-group-item-0")) .click();
        driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > textarea:nth-child(2)")) .sendKeys("Stas auto test");
        if (download.equals("Y")) {
            driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > span:nth-child(2)")) .click();
        }
        if (audit.equals("Y")) {
            driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > label:nth-child(1) > span:nth-child(2)")) .click();
        }
        driver.findElement(By.cssSelector("div.share-details:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")) .click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#message-button-ok")));
        driver.findElement(By.cssSelector("#message-button-ok")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.results-container:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > p:nth-child(1) > a:nth-child(1)")));
        driver.findElement(By.cssSelector("#sharedLinkModal > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")) .click();
        driver.findElement(By.cssSelector("#redactVideoModal > div.modal-dialog > div > div > button > span:nth-child(1)")).click();
    }
    void shareFileWithUser(String user, String file, String download, String audit) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")));
        driver.findElement(By.cssSelector(".nav-stacked > li:nth-child(13) > a:nth-child(1)")) .click();
        driver.findElement(By.cssSelector(".search-container > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")) .sendKeys(file);
        driver.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
        driver.findElement(By.cssSelector("#search-panel-file-name-filter-template > div:nth-child(1) > div > div:nth-child(2) > div > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.cssSelector(".btn-s-md")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
        driver.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")));
        driver.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(2) > a")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a")));
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(1) > a")));
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(1) > a")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#users-dropdown-multiple-edit")));
        driver.findElement(By.cssSelector("#users-dropdown-multiple-edit")) .sendKeys(user);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#list-group-item-0")));
        driver.findElement(By.cssSelector("#list-group-item-0")) .click();
        driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > textarea:nth-child(2)")) .sendKeys("Stas auto test");
        if (download.equals("Y")) {
            driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > span:nth-child(2)")) .click();
        }
        if (audit.equals("Y")) {
            driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > label:nth-child(1) > span:nth-child(2)")) .click();
        }
        driver.findElement(By.cssSelector("div.share-details:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")) .click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#message-button-ok")));
        driver.findElement(By.cssSelector("#message-button-ok")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.results-container:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > p:nth-child(1) > a:nth-child(1)")));
        driver.findElement(By.cssSelector("#sharedLinkModal > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")) .click();
    }
    void checkShareVideoWithUser(String download, String audit){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#videosContainer > div.side-bar-column > div > ul > li:nth-child(15) > a")));
        driver.findElement(By.cssSelector("#videosContainer > div.side-bar-column > div > ul > li:nth-child(15) > a")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".chosen-single > span:nth-child(1)")));
        driver.findElement(By.cssSelector(".chosen-single > span:nth-child(1)")) .click();
        driver.findElement(By.cssSelector("li.active-result:nth-child(2)")) .click();
        driver.findElement(By.cssSelector("span.btn-rounded")) .click();
        driver.findElement(By.cssSelector(".btn-s-md")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
        driver.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".vjs-big-play-button")));
        if (download.equals("Y")) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#make-copy")));
            driver.findElement(By.cssSelector("#make-copy")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(1)")));
            driver.findElement(By.cssSelector("#makeCopyDescriptionModal > div.modal-dialog > div > div.modal-body > div:nth-child(2) > textarea")).sendKeys("Stas auto test");
            driver.findElement(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        }
        if (audit.equals("Y")) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#export-audit-log")));
            driver.findElement(By.cssSelector("#export-audit-log")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#confirmation-modal-popup > div.modal-dialog > div > div.modal-header")));
            driver.findElement(By.cssSelector("#confirmation-button-yes")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#export-audit-log")));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"print\"]/div[2]/div[2]/div[3]/a")));
        driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div[2]/div[3]/a")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(7) > p > a")));
        driver.findElement(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(7) > p > a")) .click();
        driver.findElement(By.cssSelector("#confirmation-button-yes")) .click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div.modal-dialog > div > div.modal-header")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#message-button-ok")));
        driver.findElement(By.cssSelector("#message-button-ok")).click();
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > button > span:nth-child(1)")) .click();
    }
    void checkShareRedactedVideoWithUser(String download, String audit) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#videosContainer > div.side-bar-column > div > ul > li:nth-child(15) > a")));
        driver.findElement(By.cssSelector("#videosContainer > div.side-bar-column > div > ul > li:nth-child(15) > a")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".chosen-single > span:nth-child(1)")));
        driver.findElement(By.cssSelector(".chosen-single > span:nth-child(1)")).click();
        driver.findElement(By.cssSelector("li.active-result:nth-child(2)")).click();
        driver.findElement(By.cssSelector("span.btn-rounded")).click();
        driver.findElement(By.cssSelector(".btn-s-md")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
        driver.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".vjs-big-play-button")));
        if (download.equals("Y")) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#make-copy")));
            driver.findElement(By.cssSelector("#make-copy")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(1)")));
            driver.findElement(By.cssSelector("#makeCopyDescriptionModal > div.modal-dialog > div > div.modal-body > div:nth-child(2) > textarea")).sendKeys("Stas auto test");
            driver.findElement(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        }
        if (audit.equals("Y")) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#export-audit-log")));
            driver.findElement(By.cssSelector("#export-audit-log")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#confirmation-modal-popup > div.modal-dialog > div > div.modal-header")));
            driver.findElement(By.cssSelector("#confirmation-button-yes")).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#export-audit-log")));
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(1) > a")));
        driver.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(1) > a")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(7) > p > a")));
        driver.findElement(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(7) > p > a")).click();
        driver.findElement(By.cssSelector("#confirmation-button-yes")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div.modal-dialog > div > div.modal-header")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#message-button-ok")));
        driver.findElement(By.cssSelector("#message-button-ok")).click();
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > button > span:nth-child(1)")).click();
    }
    void checkShareFileWithUser(String download, String audit){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#videosContainer > div.side-bar-column > div > ul > li:nth-child(15) > a")));
        driver.findElement(By.cssSelector("#videosContainer > div.side-bar-column > div > ul > li:nth-child(15) > a")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".chosen-single > span:nth-child(1)")));
        driver.findElement(By.cssSelector(".chosen-single > span:nth-child(1)")) .click();
        driver.findElement(By.cssSelector("li.active-result:nth-child(2)")) .click();
        driver.findElement(By.cssSelector("span.btn-rounded")) .click();
        driver.findElement(By.cssSelector("#videosContainer > div.col-xs-12.video-search-column > div > div.col-xs-3.search-container > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(2) > div > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.cssSelector(".btn-s-md")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
        driver.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        if (download.equals("Y")) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#make-copy")));
            driver.findElement(By.cssSelector("#make-copy")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(1)")));
            driver.findElement(By.cssSelector("#makeCopyDescriptionModal > div.modal-dialog > div > div.modal-body > div:nth-child(2) > textarea")).sendKeys("Stas auto test");
            driver.findElement(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        }
        if (audit.equals("Y")) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#export-audit-log")));
            driver.findElement(By.cssSelector("#export-audit-log")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#confirmation-modal-popup > div.modal-dialog > div > div.modal-header")));
            driver.findElement(By.cssSelector("#confirmation-button-yes")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#export-audit-log")));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(2) > a")));
        driver.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(2) > a")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(7) > p > a")));
        driver.findElement(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(7) > p > a")) .click();
        driver.findElement(By.cssSelector("#confirmation-button-yes")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div.modal-dialog > div > div.modal-header")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#message-button-ok")));
        driver.findElement(By.cssSelector("#message-button-ok")).click();
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > button > span:nth-child(1)")) .click();
    }
    void checkShareRedactedClipWithUser(String download, String audit){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#videosContainer > div.side-bar-column > div > ul > li:nth-child(15) > a")));
        driver.findElement(By.cssSelector("#videosContainer > div.side-bar-column > div > ul > li:nth-child(15) > a")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".chosen-single > span:nth-child(1)")));
        driver.findElement(By.cssSelector(".chosen-single > span:nth-child(1)")) .click();
        driver.findElement(By.cssSelector("li.active-result:nth-child(2)")) .click();
        driver.findElement(By.cssSelector("span.btn-rounded")) .click();
        driver.findElement(By.cssSelector(".btn-s-md")) .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")));
        driver.findElement(By.cssSelector(".list-group-item-delimiter > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")) .click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".vjs-big-play-button")));
        if (download.equals("Y")) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#make-copy")));
            driver.findElement(By.cssSelector("#make-copy")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(1)")));
            driver.findElement(By.cssSelector("#makeCopyDescriptionModal > div.modal-dialog > div > div.modal-body > div:nth-child(2) > textarea")).sendKeys("Stas auto test");
            driver.findElement(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        }
        if (audit.equals("Y")) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#export-audit-log")));
            driver.findElement(By.cssSelector("#export-audit-log")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#confirmation-modal-popup > div.modal-dialog > div > div.modal-header")));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            driver.findElement(By.cssSelector("#confirmation-button-yes")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menuCasesController > a")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#export-audit-log")));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(1) > a")));
        driver.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(1) > a")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(7) > p > a")));
        driver.findElement(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(7) > p > a")) .click();
        driver.findElement(By.cssSelector("#confirmation-button-yes")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#message-modal-popup > div.modal-dialog > div > div.modal-header")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#message-button-ok")));
        driver.findElement(By.cssSelector("#message-button-ok")).click();
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > button > span:nth-child(1)")) .click();
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://securitytest.vievusolution.com");
        driver.manage().window().maximize();
    }

   // @Test
    //public void test() {
        //login("Adam1", "vievu123");
        //setPermissions("Adam2", "Y", "N");
    //}

    //======================================================================================================================================================================
    @Test
    public void userNNsharedVideoNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "N", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("N", "N");
        logOut();
    }

    @Test
    public void userNNsharedVideoYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "Y", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userNNsharedVideoNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "N", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userNNsharedVideoYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "Y", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }
    //======================================================================================================================================================================
    @Test
    public void userYYsharedVideoNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "Y", "Y");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "N", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedVideoYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "Y", "Y");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "Y", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedVideoNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "Y", "Y");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "N", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedVideoYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "Y", "Y");
        shareVideoWithUser("Adam2", "autotestvideo1.AVI", "Y", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupNNsharedVideoNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "N", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("N", "N");
        logOut();
    }

    @Test
    public void groupNNsharedVideoYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "Y", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupNNsharedVideoNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "N", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupNNsharedVideoYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "N", "N");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "Y", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupYYsharedVideoNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "Y", "Y");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "N", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedVideoYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "Y", "Y");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "Y", "N");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedVideoNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "Y", "Y");
        shareVideoWithUser("Adam2g", "autotestvideo2.AVI", "N", "Y");
        logOut();
        login("Adam2", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedVideoYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam2", "Y", "Y");
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
        login("Adam1", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "N", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("N", "N");
        logOut();
    }

    @Test
    public void userNNsharedRedactedVideoYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "Y", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userNNsharedRedactedVideoNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "N", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userNNsharedRedactedVideoYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "Y", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("Y", "Y");
        logOut();
    }
    //======================================================================================================================================================================
    @Test
    public void userYYsharedRedactedVideoNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "Y", "Y");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "N", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedRedactedVideoYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "Y", "Y");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "Y", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedRedactedVideoNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "Y", "Y");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "N", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedRedactedVideoYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "Y", "Y");
        shareRedactedVideoWithUser("Adam3", "autotestvideo1.AVI", "Y", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupNNsharedRedactedVideoNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "N", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("N", "N");
        logOut();
    }

    @Test
    public void groupNNsharedRedactedVideoYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "Y", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupNNsharedRedactedVideoNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "N", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupNNsharedRedactedVideoYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "N", "N");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "Y", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupYYsharedRedactedVideoNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "Y", "Y");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "N", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedVideoYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "Y", "Y");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "Y", "N");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedVideoNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "Y", "Y");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "N", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedVideoYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam3", "Y", "Y");
        shareRedactedVideoWithUser("Adam3g", "autotestvideo2.AVI", "Y", "Y");
        logOut();
        login("Adam3", "vievu123");
        checkShareRedactedVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    //======================================================================================================================================================================
    @Test
    public void userNNsharedFileNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "N", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("N", "N");
        logOut();
    }

    @Test
    public void userNNsharedFileYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "Y", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userNNsharedFileNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "N", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userNNsharedFileYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "Y", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "Y");
        logOut();
    }
    //======================================================================================================================================================================
    @Test
    public void userYYsharedFileNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "Y", "Y");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "N", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedFileYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "Y", "Y");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "Y", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedFileNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "Y", "Y");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "N", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedFileYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "Y", "Y");
        shareFileWithUser("Adam4", "autotestfile1.TXT", "Y", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupNNsharedFileNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "N", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("N", "N");
        logOut();
    }

    @Test
    public void groupNNsharedFileYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "Y", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupNNsharedFileNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "N", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupNNsharedFileYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "N", "N");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "Y", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupYYsharedFileNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "Y", "Y");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "N", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedFileYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "Y", "Y");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "Y", "N");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedFileNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "Y", "Y");
        shareFileWithUser("Adam4g", "autotestfile2.TXT", "N", "Y");
        logOut();
        login("Adam4", "vievu123");
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedFileYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam4", "Y", "Y");
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
        login("Adam1", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("N", "N");
        logOut();
    }

    @Test
    public void userNNsharedClipYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userNNsharedClipNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userNNsharedClipYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }
    //======================================================================================================================================================================
    @Test
    public void userYYsharedClipNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "Y", "Y");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedClipYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "Y", "Y");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedClipNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "Y", "Y");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedClipYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "Y", "Y");
        shareVideoWithUser("Adam5", "autotestvideo1_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupNNsharedClipNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("N", "N");
        logOut();
    }

    @Test
    public void groupNNsharedClipYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupNNsharedClipNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupNNsharedClipYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "N", "N");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupYYsharedClipNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "Y", "Y");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedClipYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "Y", "Y");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedClipNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "Y", "Y");
        shareVideoWithUser("Adam5g", "autotestvideo2_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam5", "vievu123");
        checkShareVideoWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedClipYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam5", "Y", "Y");
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
        login("Adam1", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("N", "N");
        logOut();
    }

    @Test
    public void userNNsharedRedactedClipYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userNNsharedRedactedClipNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userNNsharedRedactedClipYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("Y", "Y");
        logOut();
    }
    //======================================================================================================================================================================
    @Test
    public void userYYsharedRedactedClipNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "Y", "Y");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedRedactedClipYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "Y", "Y");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedRedactedClipNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "Y", "Y");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedRedactedClipYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "Y", "Y");
        shareRedactedClipWithUser("Adam6", "autotestvideo1_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupNNsharedRedactedClipNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("N", "N");
        logOut();
    }

    @Test
    public void groupNNsharedRedactedClipYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupNNsharedRedactedClipNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupNNsharedRedactedClipYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "N", "N");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    @Test
    public void groupYYsharedRedactedClipNN() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "Y", "Y");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "N", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedClipYN() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "Y", "Y");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "Y", "N");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedClipNY() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "Y", "Y");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "N", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedClipYY() {
        login("Adam1", "vievu123");
        setPermissions("Adam6", "Y", "Y");
        shareRedactedClipWithUser("Adam6g", "autotestvideo2_CLIP-001.mp4", "Y", "Y");
        logOut();
        login("Adam6", "vievu123");
        checkShareRedactedClipWithUser("Y", "Y");
        logOut();
    }

    //======================================================================================================================================================================
    //======================================================================================================================================================================

    @After
    public void tearDown() {
        driver.quit();
    }
}
