package pages;

public class PaginaFundamentosTesting extends BasePage {
    
    private String testingLink = "//div[@class='react-page-section']/div/section/div/div/div/div/div[2]/section//header/a[@href='/istqb-foundation-level-version-4-espanol']";

    public PaginaFundamentosTesting(){
        super(driver);
    }

    public void clickIntroduccionLink(){
        clickElement(testingLink);
    }

}

