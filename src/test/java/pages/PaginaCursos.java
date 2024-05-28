package pages;

public class PaginaCursos extends BasePage{

    private String funamentosTesting = "//a[@href='/fundamentos-del-testing']/h3[.='Fundamentos del Testing']";

    public PaginaCursos(){
        super(driver);
    }

    public void clickFundamentoTestingLink(){
        clickElement(funamentosTesting);
    }
    
}
