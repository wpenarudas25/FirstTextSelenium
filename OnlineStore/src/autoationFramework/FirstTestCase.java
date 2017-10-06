package autoationFramework;

import java.awt.image.CropImageFilter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class FirstTestCase {
 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\wpena\\OneDrive\\Documentos\\semestre 8\\Calidad de Software\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\wpena\\OneDrive\\Documentos\\semestre 8\\Calidad de Software\\IEDriverServer_x64_3.6.0\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wpena\\OneDrive\\Documentos\\semestre 8\\Calidad de Software\\chromedriver_win32\\chromedriver.exe");
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new ChromeDriver();//SE cambiar el driver por el driver del navegador correspondiente
		
        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
		//Wait for 5 Sec
		Thread.sleep(5000);
		
        // Close the driver
        driver.quit();
    }
}