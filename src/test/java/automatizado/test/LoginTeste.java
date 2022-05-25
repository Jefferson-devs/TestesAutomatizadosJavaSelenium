package automatizado.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.page.LoginPO;

public class LoginTeste extends BaseTest {
    
    private static LoginPO loginPage;

    @BeforeClass
    public static void prepararTestes(){
        loginPage = new LoginPO(driver);
    }

    @Test
    public void CT001_naoDeveLogarNoSistemaComEmailESenhaVazios(){ //Criando um metodo (Caso de teste CT)

        loginPage.inputEmail.sendKeys("");
        loginPage.inputEmail.sendKeys("");

        loginPage.buttonEntrar.click();
        String mensagem = loginPage.obterMensagem(); //Encapsulando a regra de obter mensagem

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos."); //Verifica se os objetos são iguais

    }
}
