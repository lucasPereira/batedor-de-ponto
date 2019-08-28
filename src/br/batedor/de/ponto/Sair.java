package br.batedor.de.ponto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Sair {

	public static void main(String[] args) {
		Credenciais credenciais = new CarregadorDeCredenciais().carregar();
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ponto.homologacao.ufsc.br");
		credenciais.aplicar((String usuario, String senha) -> {
			driver.findElement(By.id("usuario")).sendKeys(usuario);
			driver.findElement(By.id("senha")).sendKeys(senha);
		});
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.id("btSaida")).click();
		FluentWait<WebDriver> driverFluente = new FluentWait<WebDriver>(driver);
		driverFluente.ignoring(NoSuchElementException.class).pollingEvery(Duration.ofSeconds(1)).withTimeout(Duration.ofSeconds(5)).until((driverDeEspera) -> {
			System.out.println("Tentativa");
			return driverDeEspera.findElement(By.id("usuario"));
		});
		driver.quit();
	}

}
