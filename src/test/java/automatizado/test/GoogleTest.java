package automatizado.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

    private WebDriver driver;  //Esse private vai saber iniciar o nosso navegador
    private final String URL_BASE = "https://www.google.com.br/" ;  //URL_base, site que eu quero que abra com a automação
    private final String CAMINHO_DRIVER = "src/test/java/automatizado/resource/chromedriver-v1010495141.exe";  //Adicionar o caminho de onde está o driver


    private void iniciar(){  //Inicia o driver e navega até a url antes mesmo de fazer o CT.
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);  
         driver = new ChromeDriver();  //Instanciando o driver par abrir o navegador
         driver.manage().window().maximize();
         driver.get(URL_BASE); // Quero que esta URL navegue até a url base
    } 

    @Test //Indica que é um caso de teste
    public void devePesquisarNoGoogle(){ //Criando um metodo 
        iniciar();

        WebElement inputPesquisa = driver.findElement(By.name("q")); //Elemento da web
        inputPesquisa.sendKeys("Batata frita" + Keys.ENTER); //Irá escrever no navegador

        String  resultado = driver.findElement(By.id("result-stats")).getText(); //Retorna o texto de um elemento getText

        assertTrue(resultado, resultado.contains("Aproximadamente")); //Testa para mim se é verdade se dentro de resultado..

        driver.quit();
    }
}   