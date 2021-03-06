package automatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO {

    @FindBy(id = "email")
    public WebElement inputEmail; // Mapeando todos os elementos da tela

    @FindBy(id = "senha")
    public WebElement inputSenha;

    @FindBy(id = "btn-entrar")
    public WebElement buttonEntrar;

    
    @FindBy(id = "mensagem")
    public WebElement spantMensagem;
    
    /**
     * Construtor padrão para criação de uma nova instancia da pagina de login.
     * @param driver Driver da pagina de login.
     */
    public LoginPO(WebDriver driver) {
        super(driver); 
    }

    public void escrever(WebElement input, String texto){ // Criando metodo escrever
        input.clear();
        input.sendKeys(texto + Keys.TAB);
    }

    public String obterMensagem() {
        return this.spantMensagem.getText();
    }

    public void executarAcaoDeLogar(String string, String string2) {
    }
}
