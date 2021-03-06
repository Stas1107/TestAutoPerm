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
    private WebDriver driver;
    //Videos&Files Tab selectors
    private String videosFilesTabButton = "#menuFilesController > a";

    //Roles Tab selectors
    private String rolesTabButton = "#menuRolesController > a:nth-child(1)";
    private String rolesEditButton = "#gridTemplateTable > tbody > tr > td:nth-child(28) > p > a";
    private String rolesPopupDownloadText = "#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(14) > div > div > span";
    private String rolesPopupDownloadSwitch = "#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(14) > div > div > label > span.check";
    private String rolesPopupAuditText = "#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(19) > div > div > span";
    private String rolesPopupAuditSwitch = "#editRoleForm > div > div.nopadding.col-xs-8 > div:nth-child(19) > div > div > label > span.check";
    private String rolesPopupSaveButton = "#editRoleModal > div.modal-dialog > div > div.modal-footer > button.btn.btn-primary.btn-lg";

    //Filer List selectors
    private String filtersFileName = "#videosContainer > div.side-bar-column > div > ul > li:nth-child(15) > a";
    private String filtersShared = "#videosContainer > div.side-bar-column > div > ul > li:nth-child(17) > a";
    private String filtersName = "#rolesContainer > div.side-bar-column > div > ul > li:nth-child(2) > a";

    //Search Pannel selectors
    private String searchPanelAllButton = "#search-panel-file-name-filter-template > div:nth-child(1) > div > div:nth-child(2) > div > ul > li:nth-child(3) > a";
    private String searchPanelTextField = ".search-container > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)";
    private String searchPanelPlusButton = "div.clearfix:nth-child(3) > a:nth-child(1)";
    private String searchPanelSearchButton = ".btn-s-md";
    private String searchPanelTextSearchField = "input.form-control:nth-child(1)";
    private String searchPanelListUsers = ".list-group-item";
    private String searchPanelSharedDropdown = ".chosen-single > span:nth-child(1)";
    private String searchPanelSharedWithMe = "li.active-result:nth-child(2)";
    private String searchPanelSharedPlusButton = "span.btn-rounded";

    //Filter Results selectors
    private String filterResultsFirstRow = "#videosContainer > div.col-xs-12.video-search-column > div > div.col-xs-6.results-container.col-xl-5 > div > div.panel-body > div:nth-child(1) > div > a:nth-child(1)";

    //Popup selectors
    private String okButton = "#message-button-ok";
    private String yesButton = "#confirmation-button-yes";

    //Control Selectors
    private String downloadButton = "#make-copy";
    private String auditButton = "#export-audit-log";

    //Download Popup selectors
    private String downloadPopupPurposeField = "#makeCopyDescriptionModal > div.modal-dialog > div > div.modal-body > div:nth-child(2) > textarea";
    private String downloadPopupDownloadButton = "div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)";

    //Share Popup selectors
    private String sharePopupNumberOfRows = "div.results-container:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(2)";
    private String sharePopupDeleteShareButton = "#gridTemplateTable > tbody > tr:nth-child(1) > td:nth-child(7) > p > a";
    private String sharePopupPlusButton = "#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a";
    private String sharePopupUserButton = "#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(1) > a";
    private String sharePopupUserField = "#users-dropdown-multiple-edit";
    private String sharePopupListOfUsers = "#list-group-item-0";
    private String sharePopupPurposeField = ".edit-shared-case-popup-body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > textarea:nth-child(2)";
    private String sharePopupDownloadSwitch = ".edit-shared-case-popup-body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > span:nth-child(2)";
    private String sharePopupAuditSwitch = ".edit-shared-case-popup-body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > label:nth-child(1) > span:nth-child(2)";
    private String sharePopupShareButton = "div.share-details:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)";
    private String sharePopupCloseButton = "#sharedLinkModal > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)";





        private void login(String login, String pass) {
        driver.findElement(By.cssSelector("#Login")) .sendKeys(login);
        driver.findElement(By.cssSelector(".btn")) .click();
        driver.findElement(By.cssSelector("#Password")) .sendKeys(pass);
        driver.findElement(By.cssSelector(".btn")) .click();
    }
    private void logOut() {
        driver.findElement(By.cssSelector("button.dropdown-toggle")) .click();
        driver.findElement(By.cssSelector(".dropdown-menu > li:nth-child(3) > a:nth-child(1)")) .click();
        driver.findElement(By.cssSelector("div.media-body:nth-child(1)")) .click();
    }
    private void setPermissions(String UserName, String download, String audit) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(rolesTabButton)));
        driver.findElement(By.cssSelector(rolesTabButton)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(filtersName)).click();
        driver.findElement(By.cssSelector(searchPanelTextSearchField)).sendKeys(UserName);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(searchPanelListUsers)) .click();
        driver.findElement(By.cssSelector(searchPanelSearchButton)) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(rolesEditButton)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        if (download.equals("Y")) {
            String downloadPermission = driver.findElement(By.cssSelector(rolesPopupDownloadText)).getAttribute("textContent");
            if (downloadPermission.equals("N")) {
                driver.findElement(By.cssSelector(rolesPopupDownloadSwitch)).click();
            }
        }
        if (download.equals("N")) {
            String downloadPermission = driver.findElement(By.cssSelector(rolesPopupDownloadText)).getAttribute("textContent");
            if (downloadPermission.equals("Y")) {
                driver.findElement(By.cssSelector(rolesPopupDownloadSwitch)).click();
            }
        }
        if (audit.equals("Y")) {
            String auditPermission = driver.findElement(By.cssSelector(rolesPopupAuditText)).getAttribute("textContent");
            if (auditPermission.equals("N")) {
                driver.findElement(By.cssSelector(rolesPopupAuditSwitch)).click();
            }
        }
        if (audit.equals("N")) {
            String auditPermission = driver.findElement(By.cssSelector(rolesPopupAuditText)).getAttribute("textContent");
            if (auditPermission.equals("Y")) {
                driver.findElement(By.cssSelector(rolesPopupAuditSwitch)).click();
            }
        }
        driver.findElement(By.cssSelector(rolesPopupSaveButton)) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(okButton)) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(videosFilesTabButton)) .click();
    }
    private void shareWithUser(String user, String what, String download, String audit) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.cssSelector(filtersFileName)) .click();
        driver.findElement(By.cssSelector(searchPanelAllButton)).click();
        driver.findElement(By.cssSelector(searchPanelTextField)) .sendKeys(what);
        driver.findElement(By.cssSelector(searchPanelPlusButton)) .click();
        driver.findElement(By.cssSelector(searchPanelSearchButton)) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(filterResultsFirstRow)) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        if (what.equals(Data.video)|what.equals(Data.clip)) {
            driver.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")).click();
        }
        if (what.equals(Data.file)) {
            driver.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(2) > a")).click();
        }
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        String shares = driver.findElement(By.cssSelector(sharePopupNumberOfRows)).getAttribute("innerText");
        int sharesint = Integer.parseInt(shares);
        for (int i = 0; i < sharesint; i++) {
            driver.findElement(By.cssSelector(sharePopupDeleteShareButton)).click();
            driver.findElement(By.cssSelector(yesButton)).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            driver.findElement(By.cssSelector(okButton)).click();
        }
        driver.findElement(By.cssSelector(sharePopupPlusButton)).click();
        driver.findElement(By.cssSelector(sharePopupUserButton)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(sharePopupUserField)).sendKeys(user);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(sharePopupListOfUsers)).click();
        driver.findElement(By.cssSelector(sharePopupPurposeField)).sendKeys("Stas auto test");
        if (download.equals("Y")) {
            driver.findElement(By.cssSelector(sharePopupDownloadSwitch)).click();
        }
        if (audit.equals("Y")) {
            driver.findElement(By.cssSelector(sharePopupAuditSwitch)).click();
        }
        driver.findElement(By.cssSelector(sharePopupShareButton)) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(okButton)) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(sharePopupCloseButton)) .click();
    }
    //This method will be merged with "shareWithUser" method
    private void shareRedactionWithUser(String user, String what, String download, String audit) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.cssSelector(filtersFileName)) .click();
        driver.findElement(By.cssSelector(".search-container > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")) .sendKeys(what);
        driver.findElement(By.cssSelector("div.clearfix:nth-child(3) > a:nth-child(1)")) .click();
        driver.findElement(By.cssSelector(".btn-s-md")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector("#videosContainer > div.col-xs-12.video-search-column > div > div.col-xs-6.results-container.col-xl-5 > div > div.panel-body > div:nth-child(1) > div > a:nth-child(1)")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        if (what.equals(Data.video)){
            driver.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(7) > a")).click();
        }
        if (what.equals(Data.clip)){
            driver.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(6) > a")).click();
        }
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector("#selected-redact-item > div.overflow-wrapper > div:nth-child(2) > div.col-xs-2 > div:nth-child(2) > a")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        String shares = driver.findElement(By.cssSelector("div.results-container:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(2)")).getAttribute("innerText");
        int sharesint = Integer.parseInt(shares);
        for (int i = 0; i < sharesint; i++) {
            driver.findElement(By.cssSelector("#gridTemplateTable > tbody > tr:nth-child(1) > td:nth-child(7) > p > a")).click();
            driver.findElement(By.cssSelector("#confirmation-button-yes")).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            driver.findElement(By.cssSelector("#message-button-ok")).click();
        }
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2 > a")) .click();
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > div:nth-child(2) > div > div.col-xs-2.open > ul > li:nth-child(1) > a")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector("#users-dropdown-multiple-edit")) .sendKeys(user);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector("#list-group-item-0")) .click();
        driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > textarea:nth-child(2)")) .sendKeys("Stas auto test");
        if (download.equals("Y")) {
            driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > span:nth-child(2)")) .click();
        }
        if (audit.equals("Y")) {
            driver.findElement(By.cssSelector(".edit-shared-case-popup-body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > label:nth-child(1) > span:nth-child(2)")) .click();
        }
        driver.findElement(By.cssSelector("div.share-details:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector("#message-button-ok")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector("#sharedLinkModal > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")) .click();
        driver.findElement(By.cssSelector("#redactVideoModal > div.modal-dialog > div > div > button > span:nth-child(1)")).click();
    }
    private void checkShareWithUser(String download, String audit){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.cssSelector(filtersShared)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(searchPanelSharedDropdown)) .click();
        driver.findElement(By.cssSelector(searchPanelSharedWithMe)) .click();
        driver.findElement(By.cssSelector(searchPanelSharedPlusButton)) .click();
        driver.findElement(By.cssSelector(searchPanelSearchButton)) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(filterResultsFirstRow)) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        if (download.equals("Y")) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(downloadButton)));
            driver.findElement(By.cssSelector(downloadButton)).click();
            driver.findElement(By.cssSelector(downloadPopupPurposeField)).sendKeys("Stas auto test");
            driver.findElement(By.cssSelector(downloadPopupDownloadButton)).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        }
        if (audit.equals("Y")) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(auditButton)));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(auditButton)));
            driver.findElement(By.cssSelector(auditButton)).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(yesButton)));
            driver.findElement(By.cssSelector(yesButton)).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(3) > a")));
        driver.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(3) > a")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(sharePopupDeleteShareButton)) .click();
        driver.findElement(By.cssSelector(yesButton)) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(okButton)).click();
        driver.findElement(By.cssSelector(sharePopupCloseButton)) .click();
    }
    //This method will be merged with "checkShareWithUser" method
    private void checkShareFileWithUser(String download, String audit){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.cssSelector(filtersShared)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector("#videosContainer > div.col-xs-12.video-search-column > div > div.col-xs-3.search-container > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(2) > div > ul > li:nth-child(3) > a")).click();
        driver.findElement(By.cssSelector(".chosen-single > span:nth-child(1)")) .click();
        driver.findElement(By.cssSelector("li.active-result:nth-child(2)")) .click();
        driver.findElement(By.cssSelector("span.btn-rounded")) .click();
        driver.findElement(By.cssSelector(".btn-s-md")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector("#videosContainer > div.col-xs-12.video-search-column > div > div.col-xs-6.results-container.col-xl-5 > div > div.panel-body > div:nth-child(1) > div > a > div > div > div.media-body.media-middle")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        if (download.equals("Y")) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#make-copy")));
            driver.findElement(By.cssSelector("#make-copy")).click();
            driver.findElement(By.cssSelector("#makeCopyDescriptionModal > div.modal-dialog > div > div.modal-body > div:nth-child(2) > textarea")).sendKeys("Stas auto test");
            driver.findElement(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        }
        if (audit.equals("Y")) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#export-audit-log")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#export-audit-log")));
            driver.findElement(By.cssSelector("#export-audit-log")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#confirmation-button-yes")));
            driver.findElement(By.cssSelector("#confirmation-button-yes")).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(2) > a")));
        driver.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(2) > a")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(7) > p > a")) .click();
        driver.findElement(By.cssSelector("#confirmation-button-yes")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector("#message-button-ok")).click();
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > button > span:nth-child(1)")) .click();
        }
    //This method will be merged with "checkShareWithUser" method
    private void checkShareRedactionWithUser(String download, String audit) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.cssSelector(filtersShared)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector(".chosen-single > span:nth-child(1)")) .click();
        driver.findElement(By.cssSelector("li.active-result:nth-child(2)")) .click();
        driver.findElement(By.cssSelector("span.btn-rounded")) .click();
        driver.findElement(By.cssSelector(".btn-s-md")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector("#videosContainer > div.col-xs-12.video-search-column > div > div.col-xs-6.results-container.col-xl-5 > div > div.panel-body > div:nth-child(1) > div > a > div > div > div.media-body.media-middle")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        if (download.equals("Y")) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#make-copy")));
            driver.findElement(By.cssSelector("#make-copy")).click();
            driver.findElement(By.cssSelector("#makeCopyDescriptionModal > div.modal-dialog > div > div.modal-body > div:nth-child(2) > textarea")).sendKeys("Stas auto test");
            driver.findElement(By.cssSelector("div.modal-dialog:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        }
        if (audit.equals("Y")) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#export-audit-log")));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#export-audit-log")));
            driver.findElement(By.cssSelector("#export-audit-log")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#confirmation-button-yes")));
            driver.findElement(By.cssSelector("#confirmation-button-yes")).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(1) > a")));
        driver.findElement(By.cssSelector("#print > div.row.file-info > div.col-xs-1 > div:nth-child(1) > a")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector("#gridTemplateTable > tbody > tr > td:nth-child(7) > p > a")) .click();
        driver.findElement(By.cssSelector("#confirmation-button-yes")) .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading-overlay")));
        driver.findElement(By.cssSelector("#message-button-ok")).click();
        driver.findElement(By.cssSelector("#sharedLinkModal > div.modal-dialog > div > div > button > span:nth-child(1)")) .click();
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Data.subscription);
        driver.manage().window().maximize();
    }

    //Video Sharing with user: User permissions: Download-N; Audit-N ======================================================================================================================================================================
    /*@Test Not implemented yet
    public void userNNsharedVideoNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2,"N", "N");
        shareWithUser(Data.user2, Data.video, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("N", "N");
        logOut();
    } */

    @Test
    public void userNNsharedVideoYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.user2, Data.video, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userNNsharedVideoNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.user2, Data.video, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userNNsharedVideoYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.user2, Data.video, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }
    //Video Sharing with user: User permissions: Download-Y; Audit-Y======================================================================================================================================================================
    @Test
    public void userYYsharedVideoNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.user2, Data.video, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedVideoYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.user2, Data.video, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedVideoNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.user2, Data.video, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedVideoYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.user2, Data.video, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    //Video Sharing with Group of Users: User permissions: Download-N; Audit-N======================================================================================================================================================================
    /*@Test Not implemented yet
    public void groupNNsharedVideoNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.group2, Data.video, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("N", "N");
        logOut();
    } */

    @Test
    public void groupNNsharedVideoYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.group2, Data.video, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupNNsharedVideoNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.group2, Data.video, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupNNsharedVideoYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.group2, Data.video, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    //Video Sharing with Group of Users: User permissions: Download-Y; Audit-Y======================================================================================================================================================================
    @Test
    public void groupYYsharedVideoNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.group2, Data.video, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedVideoYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.group2, Data.video, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedVideoNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.group2, Data.video, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedVideoYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.group2, Data.video, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    //===============================================================================================================================================================================================================================
    //Redacted Video Sharing with user: User Download-N; Audit-N======================================================================================================================================================================
    /*@Test Not implemented yet
    public void userNNsharedRedactedVideoNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.user2, Data.video, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("N", "N");
        logOut();
    } */

    @Test
    public void userNNsharedRedactedVideoYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.user2, Data.video, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userNNsharedRedactedVideoNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.user2, Data.video, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userNNsharedRedactedVideoYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.user2, Data.video, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }
    //Redacted Video Sharing with user: User Download-Y; Audit-Y======================================================================================================================================================================
    @Test
    public void userYYsharedRedactedVideoNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.user2, Data.video, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedRedactedVideoYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.user2, Data.video, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedRedactedVideoNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.user2, Data.video, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedRedactedVideoYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.user2, Data.video, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    //Redacted Video Sharing with Group: User permissions: Download-N; Audit-N======================================================================================================================================================================
    /*@Test Not implemented yet
    public void groupNNsharedRedactedVideoNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.group2, Data.video, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("N", "N");
        logOut();
    } */

    @Test
    public void groupNNsharedRedactedVideoYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.group2, Data.video, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupNNsharedRedactedVideoNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.group2, Data.video, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupNNsharedRedactedVideoYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.group2, Data.video, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    //Redacted Video Sharing with Group: User permissions: Download-Y; Audit-Y======================================================================================================================================================================
    @Test
    public void groupYYsharedRedactedVideoNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.group2, Data.video, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedVideoYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.group2, Data.video, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedVideoNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.group2, Data.video, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedVideoYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.group2, Data.video, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    //===============================================================================================================================================================================================================================
    //File Sharing with user: User permissions: Download-N; Audit-N======================================================================================================================================================================
    /*@Test Not implemented yet
    public void userNNsharedFileNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.user2, Data.file, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("N", "N");
        logOut();
    } */

    @Test
    public void userNNsharedFileYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.user2, Data.file, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userNNsharedFileNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.user2, Data.file, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userNNsharedFileYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.user2, Data.file, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("Y", "Y");
        logOut();
    }
    //File Sharing with user: User permissions: Download-Y; Audit-Y======================================================================================================================================================================
    @Test
    public void userYYsharedFileNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.user2, Data.file, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedFileYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.user2, Data.file, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedFileNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.user2, Data.file, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedFileYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.user2, Data.file, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    //File Sharing with Group of users: User permissions: Download-N; Audit-N======================================================================================================================================================================
    /*@Test Not implemented yet
    public void groupNNsharedFileNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.group2, Data.file, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("N", "N");
        logOut();
    } */

    @Test
    public void groupNNsharedFileYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.group2, Data.file, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupNNsharedFileNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.group2, Data.file, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupNNsharedFileYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.group2, Data.file, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    //File Sharing with Group of users: User permissions: Download-Y; Audit-Y======================================================================================================================================================================
    @Test
    public void groupYYsharedFileNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.group2, Data.file, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedFileYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.group2, Data.file, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedFileNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.group2, Data.file, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedFileYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.group2, Data.file, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareFileWithUser("Y", "Y");
        logOut();
    }

    //===============================================================================================================================================================================================================================
    //Clip Sharing with user: User permissions: Download-N; Audit-N======================================================================================================================================================================
    /*@Test Not implemented yet
    public void userNNsharedClipNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.user2, Data.clip, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("N", "N");
        logOut();
    } */

    @Test
    public void userNNsharedClipYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.user2, Data.clip, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userNNsharedClipNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.user2, Data.clip, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userNNsharedClipYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.user2, Data.clip, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }
    //Clip Sharing with user: User permissions: Download-Y; Audit-Y======================================================================================================================================================================
    @Test
    public void userYYsharedClipNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.user2, Data.clip, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedClipYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.user2, Data.clip, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedClipNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.user2, Data.clip, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedClipYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.user2, Data.clip, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    //Clip Sharing with Group of Users: User permissions: Download-N; Audit-N======================================================================================================================================================================
    /*@Test Not implemented yet
    public void groupNNsharedClipNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.group2, Data.clip, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("N", "N");
        logOut();
    } */

    @Test
    public void groupNNsharedClipYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.group2, Data.clip, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupNNsharedClipNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.group2, Data.clip, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupNNsharedClipYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareWithUser(Data.group2, Data.clip, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    //Clip Sharing with Group of Users: User permissions: Download-Y; Audit-Y======================================================================================================================================================================
    @Test
    public void groupYYsharedClipNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.group2, Data.clip, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedClipYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.group2, Data.clip, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedClipNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.group2, Data.clip, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedClipYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareWithUser(Data.group2, Data.clip, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareWithUser("Y", "Y");
        logOut();
    }

    //===============================================================================================================================================================================================================================
    //Redacted Clip Sharing with user: User Download-N; Audit-N======================================================================================================================================================================
    /*@Test Not implemented yet
    public void userNNsharedRedactedClipNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.user2, Data.clip, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("N", "N");
        logOut();
    } */

    @Test
    public void userNNsharedRedactedClipYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.user2, Data.clip, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "N");
        logOut();
    }

    @Test
    public void userNNsharedRedactedClipNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.user2, Data.clip, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("N", "Y");
        logOut();
    }

    @Test
    public void userNNsharedRedactedClipYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.user2, Data.clip, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }
    //Redacted Clip Sharing with user: User Download-Y; Audit-Y======================================================================================================================================================================
    @Test
    public void userYYsharedRedactedClipNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.user2, Data.clip, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedRedactedClipYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.user2, Data.clip, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedRedactedClipNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.user2, Data.clip, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void userYYsharedRedactedClipYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.user2, Data.clip, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    //Redacted Clip Sharing with Group of Users: User permissions: Download-N; Audit-N======================================================================================================================================================================
    /*@Test Not implemented yet
    public void groupNNsharedRedactedClipNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.group2, Data.clip, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("N", "N");
        logOut();
    } */

    @Test
    public void groupNNsharedRedactedClipYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.group2, Data.clip, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "N");
        logOut();
    }

    @Test
    public void groupNNsharedRedactedClipNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.group2, Data.clip, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("N", "Y");
        logOut();
    }

    @Test
    public void groupNNsharedRedactedClipYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "N", "N");
        shareRedactionWithUser(Data.group2, Data.clip, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    //Redacted Clip Sharing with Group of Users: User permissions: Download-Y; Audit-Y======================================================================================================================================================================
    @Test
    public void groupYYsharedRedactedClipNN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.group2, Data.clip, "N", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedClipYN() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.group2, Data.clip, "Y", "N");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedClipNY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.group2, Data.clip, "N", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    @Test
    public void groupYYsharedRedactedClipYY() {
        login(Data.user1, Data.pass1);
        setPermissions(Data.user2, "Y", "Y");
        shareRedactionWithUser(Data.group2, Data.clip, "Y", "Y");
        logOut();
        login(Data.user2, Data.pass2);
        checkShareRedactionWithUser("Y", "Y");
        logOut();
    }

    //===============================================================================================================================================================================================================================
    //===============================================================================================================================================================================================================================

    @After
    public void tearDown() {
        driver.quit();
    }
}
