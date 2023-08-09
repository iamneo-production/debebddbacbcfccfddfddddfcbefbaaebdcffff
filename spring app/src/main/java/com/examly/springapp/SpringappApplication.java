import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class App {
  private WebDriver driver;

  public App(WebDriver driver) {
    this.driver = driver;
  }

  public void navigateTo(String url) {
    driver.get(url);
  }

  public int countLinks() {
    List<WebElement> links = driver.findElements(By.tagName("a"));
    return links.size();
  }

  public void printLinks() {
    List<WebElement> links = driver.findElements(By.tagName("a"));
    for (WebElement link : links) {
      System.out.println("Link text: " + link.getText());
      System.out.println("Link URL: " + link.getAttribute("href"));
    }
  }
}