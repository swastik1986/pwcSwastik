package uTestMavenWebProject5555;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class mainDriverClass {

	public static void main(String[] args) {
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		System.setProperty("webdriver.ie.driver","C:\\Users\\swastikbvst\\Desktop\\New folder\\Selenium\\IEDriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(capabilities);		
		driver.get("http://localhost:80/");
		System.out.println("Navigate to Url method executed");
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);

	}

}
