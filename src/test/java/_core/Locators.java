package _core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators extends BasePage {

    @FindBy(id = "search-open")
    public WebElement btnLupa;

    @FindBy(xpath = "//div[@class='desktop-search']//input[@class='search-field']")
    public WebElement inputPesquisar;

    @FindBy(xpath = "//div[@class='desktop-search']//input[@class='search-submit']")
    public WebElement btnPesquisar;

    @FindBy(xpath ="//h1[@class='entry-title']")
    public WebElement tituloEntrada;

    @FindBy(xpath = "//h1[@class='archive-title']")
    public WebElement tituloArquivo;

}
