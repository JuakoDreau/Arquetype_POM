package com.testGroup.testProject.pom.pages;

import com.testGroup.testProject.pom.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestPage extends Base {

    public TestPage(WebDriver driver){super(driver);}

    WebElement inputGoogle = findElement(By.xpath("//textarea[@id='APjFqb']"));


    public void setText(String text){
        type(text, (By) inputGoogle);
    }

    public void searchButtom(){
        enter((By) inputGoogle);
    }

}
