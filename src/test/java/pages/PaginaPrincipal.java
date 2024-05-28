package pages;


public class PaginaPrincipal extends BasePage {

    private String selectorLink = "//a[@href='https://www.freerangetesters.com/%s']";
    private String planSelectorBtn = "//div[2]/a[@href='/comunidad/83037/buy']";

    public PaginaPrincipal() {
        super(driver);
    }

    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com/");
        //clickElement(searchButton);
    }

    public void clickOnSectionNavigation(String section){
        String xpathSection = String.format(selectorLink, section);
        clickElement(xpathSection);
    }

    public void clickOnPlanSelectorBtn(){
        clickElement(planSelectorBtn);
    }
    
}
