package br.batedor.de.ponto;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FabricaDeWebDriver {

	public WebDriver construir() {
		Boolean windows = System.getProperty("os.name").contains("Windows");
		Boolean linux = System.getProperty("os.name").equals("Linux");
		if (windows) {
			new File("driver/chrome-driver-windows.exe").setExecutable(true);
			System.setProperty("webdriver.chrome.driver", "driver/chrome-driver-windows.exe");
		} else if (linux) {
			new File("driver/chrome-driver-linux").setExecutable(true);
			System.setProperty("webdriver.chrome.driver", "driver/chrome-driver-linux");
		}
		return new ChromeDriver();
	}

}
