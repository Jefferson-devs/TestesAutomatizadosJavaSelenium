package automatizado.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest { //Encapsulamento em POO

    protected static WebDriver driver;  //Esse private vai saber iniciar o nosso navegador
    private static final String URL_BASE = "file:///C:/Users/Jefferson%20Soares/Documents/Automa%C3%A7%C3%A3o%20arquivos/controle-de-produtos/sistema/login.html" ;  //URL_base, site que eu quero que abra com a automação
    private static final String CAMINHO_DRIVER = "src/test/java/automatizado/resource/chromedriver-v1010495141.exe";  //Adicionar o caminho de onde está o driver 

    @BeforeClass // Essa classe (metodo) vai ser chamada antes de qualquer outra classe (Antes)
    public static void iniciar(){  //Inicia o driver e navega até a url antes mesmo de fazer o CT.
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);  
         driver = new ChromeDriver(); // Instanciando o driver par abrir o navegador
         driver.manage().window().maximize();
         driver.get(URL_BASE); // Quero que esta URL navegue até a url base
    } 

    @AfterClass //Este metodo só roda no final depois que todos os CT.s (as classes) terminar (Depois)
    public static void finalizar(){
        driver.quit();
    }
}


