package steps;

import java.util.Arrays;

import io.cucumber.java.en.*;
import pages.CheckoutPage;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaPrincipal;
import java.util.List;
import org.testng.asserts.SoftAssert;

public class FreeRangeSteps {

    SoftAssert softAssert = new SoftAssert();

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();
    CheckoutPage checkoutPage = new CheckoutPage();
    
    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section){
        landingPage.clickOnSectionNavigation(section);
    }

    @Then("I select Introduccion al Testing")
    public void navigateToIntro(){
        cursosPage.clickFundamentoTestingLink();
        fundamentosPage.clickIntroduccionLink();    
    }

    @When("I select Elegir Plan")
    public void navigateElegirPlan(){
        landingPage.clickOnPlanSelectorBtn();
    }

    @Then("I can validate options in the checkout page")
    public void validateOptions(){
        List<String> list = checkoutPage.returnPlanDropdownValues();
        List<String> expectedList = Arrays.asList("Academia: $16.99 / mes • 12 productos", 
            "Academia: $176 / año • 12 productos", "Free: Gratis • 3 productos");

        softAssert.assertEquals(list, expectedList);
    }
}
