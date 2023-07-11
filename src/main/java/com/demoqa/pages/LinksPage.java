package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.List;

public class LinksPage extends BasePage {
    public LinksPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(tagName = "a")
    List<WebElement> allLinks;

    public LinksPage getAllLinks() {

        System.out.println("Total links on the page: " + allLinks.size());

        String url;

        Iterator<WebElement> iterator = allLinks.iterator();
        while (iterator.hasNext()){
            url = iterator.next().getText();
            System.out.println(url);
        }
        return this;
    }
}