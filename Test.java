package com.webautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;

public class Test extends ScreenCaptureHtmlUnitDriver {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ScreenCaptureHtmlUnitDriver(BrowserVersion.FIREFOX);
        //driver.get("https://www.google.com/");
        driver.get("https://pub.boa.exacttarget.com/3ozdpgqs00g/");
        try{
        	byte[] zipFileBytes = ((ScreenCaptureHtmlUnitDriver) driver).getScreenshotAs(OutputType.BYTES);
        	FileUtils.writeByteArrayToFile(new File("C:\\Users\\RC\\eclipse2020\\snapshot\\error.zip"), zipFileBytes);
        //File scrFile = ((ScreenCaptureHtmlUnitDriver) driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile, new File("C:\\TEMP.PNG"));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}