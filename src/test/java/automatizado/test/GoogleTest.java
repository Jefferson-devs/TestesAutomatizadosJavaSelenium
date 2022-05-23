package automatizado.test;

import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;
import automatizado.page.GooglePO;


public class GoogleTest extends BaseTest { //Tudo que estiver em BaseTest será acessivel pelo GoogleTest

    private static GooglePO googlePage;
    @BeforeClass
    public static void prepararTestes(){
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