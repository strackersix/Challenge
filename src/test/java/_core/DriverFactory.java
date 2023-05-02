package _core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory implements Constantes {
	
	public static WebDriver driver;

	public DriverFactory(){

		if (driver == null) {
			inicializarDriverFactory();
		}
	}

	public static void inicializarDriverFactory() {

		System.setProperty(webDriverChromeDriver, diretorioChromeDriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void finalizarDriverFactory() {

		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}