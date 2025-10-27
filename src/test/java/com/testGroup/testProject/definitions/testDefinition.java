package com.testGroup.testProject.definitions;

import com.testGroup.testProject.myHooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDefinition {

    WebDriver driver = Hooks.driver;

    @Given("abro el navegador")
    public void abro_el_navegador() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @When("navego en la pagina {string}")
    public void navego_en_la_pagina(String url) throws InterruptedException {
        driver.get(url);
    }
    @When("selecciono el combobox")
    public void selecciono_el_combobox() throws InterruptedException {
        WebElement comboBox = driver.findElement(By.xpath("//*[@id=\"fruit\"]"));
        comboBox.click();
    }
    @Then("selecciono la fruta {string}")
    public void selecciono_la_fruta(String string) {
        WebElement fruta = driver.findElement(By.xpath("//*[@id=\"fruit--list--option-0\"]"));
        fruta.click();
        driver.quit();
    }
    @When("navego en google {string}")
    public void navego_en_google(String string) {
        System.out.println("Hola Mundo 02");
    }
    @And("ingreso los datos para sumar {string}")
    public void ingreso_los_datos_para_sumar(String string) {
        System.out.println("Hola Mundo 03");
    }
    @And("busco el resultado")
    public void busco_el_resultado() {
        System.out.println("Hola Mundo 04");
    }
    @Then("valido que el resultado sea correcto\"{int}\"")
    public void valido_que_el_resultado_sea_correcto(Integer int1) {
        System.out.println("Hola Mundo 05");
    }
}
