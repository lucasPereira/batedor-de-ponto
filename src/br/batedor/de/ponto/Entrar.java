package br.batedor.de.ponto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Entrar {

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
		driver.findElement(By.id("btEntrada")).click();
	}

}
