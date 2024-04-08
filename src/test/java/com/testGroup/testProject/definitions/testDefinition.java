package com.testGroup.testProject.definitions;

import com.testGroup.testProject.myHooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class testDefinition {

    WebDriver driver = Hooks.driver;

    @Given("abro el navegador")
    public void abro_el_navegador() {
        System.out.println("Hola Mundo 01");
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
