package automatizado.test;



import static org.junit.Assert.assertEquals;


import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatizado.page.ControleDeProdutoPO;
import automatizado.page.LoginPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // Executar os testes de forma crescente.
public class ControleDeProdutoTest extends BaseTest {
    
    private static LoginPO loginPage;
    private static ControleDeProdutoPO controleProdutoPage;

    @BeforeClass
    public static void prepararTestes(){
        loginPage = new LoginPO(driver); // Instanciando
        loginPage.executarAcaoDeLogar("admin@admin.com", "admin@123");

        controleProdutoPage = new ControleDeProdutoPO(driver); // Instanciando
        assertEquals(controleProdutoPage.obterTituloPagina(), "Controle de produtos");
    }

    @Test
    public void CT001_deveAbrirModalParaCadastroAoClicarNoBotaoCriar(){
        controleProdutoPage.buttonAdicionar.click(); // Clica no botão adicionar
        //TODO: Remover esse clique assim que o sistema for corrigido.
        controleProdutoPage.buttonAdicionar.click(); // Clica no botão adicionar

        String titulo = controleProdutoPage.tituloModal.getText();
        assertEquals("Produtoooos", titulo);
    }
}
