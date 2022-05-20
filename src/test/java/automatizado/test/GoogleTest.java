package automatizado.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class GoogleTest extends BaseTest { //Tudo que estiver em BaseTest será acessivel pelo GoogleTest

    @Test //Indica que é um caso de teste
    public void devePesquisarNoGoogle(){ //Criando um metodo 

        WebElement inputPesquisa = driver.findElement(By.name("q")); //Elemento da web
        inputPesquisa.sendKeys("Batata frita" + Keys.ENTER); //Irá escrever no navegador

        String  resultado = driver.findElement(By.id("result-stats")).getText(); //Retorna o texto de um elemento getText

        assertTrue(resultado, resultado.contains("Aproximadamente")); //Testa para mim se é verdade se dentro de resultado..

    }

    @Test //Indica que é um caso de teste
    public void devePesquisarNoGoogle2(){ //Criando um metodo 

        WebElement inputPesquisa = driver.findElement(By.name("q")); //Elemento da web
        inputPesquisa.sendKeys("Batata frita" + Keys.ENTER); //Irá escrever no navegador

        String  resultado = driver.findElement(By.id("result-stats")).getText(); //Retorna o texto de um elemento getText

        assertTrue(resultado, resultado.contains("Aproximadamente")); //Testa para mim se é verdade se dentro de resultado..

    }
}   