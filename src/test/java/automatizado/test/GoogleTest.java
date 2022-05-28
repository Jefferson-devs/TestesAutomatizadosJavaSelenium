package automatizado.test;

import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatizado.page.GooglePO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // Executar os testes de forma crescente.
public class GoogleTest extends BaseTest { //Tudo que estiver em BaseTest será acessivel pelo GoogleTest

    private static GooglePO googlePage;
    @BeforeClass
    public static void prepararTestes(){
        driver.get("https://www.google.com.br/");
        googlePage = new GooglePO(driver); //Objeto encapsulado do PO
    }

    @Test //Indica que é um caso de teste
    public void CT001_deveSerPossivelPesquisarNoGoogleOTextoBatataFrita(){ //Criando um metodo (Caso de teste CT)

        googlePage.pesquisar("Batata frita"); //Irá escrever no navegador

        String  resultado = googlePage.obterResultadoDaPesquisa(); //Retorna o texto de um elemento getText

        assertTrue(resultado, resultado.contains("Aproximadamente")); //Testa para mim se é verdade se dentro de resultado..

    }

    @Test //Indica que é um caso de teste
    public void CT002_deveSerPossivelPesquisarNoGoogleOTextoNutella(){ //Criando um metodo (Caso de teste CT)

        googlePage.pesquisar("Nutella"); //Irá escrever no navegador

        String  resultado = googlePage.obterResultadoDaPesquisa();//Retorna o texto de um elemento getText

        assertTrue(resultado, resultado.contains("resultados")); //Testa para mim se é verdade se dentro de resultado..

    }
}   