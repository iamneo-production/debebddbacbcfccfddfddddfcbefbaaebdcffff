import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
  private WebDriver driver;
  private App app;

  @BeforeTest
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    driver = new ChromeDriver();
    app = new App(driver);
  }

  @Test
  public void testCountLinks() {
    app.navigateTo("https://flipkart.com");
    int count = app.countLinks();
    System.out.println("Number of links: " + count);
  }

  @Test
  public void testPrintLinks() {
    app.navigateTo("https://flipkart.com");
    app.printLinks();
  }

  @AfterTest
  public void tearDown() {
    driver.quit();
  }
}