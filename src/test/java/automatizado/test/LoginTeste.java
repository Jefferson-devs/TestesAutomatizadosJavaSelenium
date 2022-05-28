package automatizado.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.page.LoginPO;

public class LoginTeste extends BaseTest {
    
    private static LoginPO loginPage;

    private void executarAcaoDeLogar(String email, String senha){
        loginPage.escrever(loginPage.inputEmail, email);  
        loginPage.escrever(loginPage.inputSenha, senha); 
        
        loginPage.buttonEntrar.click();
    }

    @BeforeClass
    public static void prepararTestes(){
        loginPage = new LoginPO(driver);
    }

    @Test
    public void CT001_naoDeveLogarNoSistemaComEmailESenhaVazios(){ //Criando um metodo (Caso de teste CT)

        executarAcaoDeLogar("", "");

        String mensagem = loginPage.obterMensagem(); //Encapsulando a regra de obter mensagem

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos."); //Verifica se os objetos são iguais
    }

    @Test
    public void CT002_naoDeveLogarNoSistemaComEmailIncorretoESenhaVazia(){ //Criando um metodo (Caso de teste CT)

        executarAcaoDeLogar("teste", "");

        String mensagem = loginPage.obterMensagem(); //Encapsulando a regra de obter mensagem

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos."); //Verifica se os objetos são iguais
    }

    @Test
    public void CT003_naoDeveLogarNoSistemaComEmailVazioESenhaIncorreta(){ //Criando um metodo (Caso de teste CT)

        executarAcaoDeLogar("", "teste");

        String mensagem = loginPage.obterMensagem(); //Encapsulando a regra de obter mensagem

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos."); //Verifica se os objetos são iguais
    }
}
