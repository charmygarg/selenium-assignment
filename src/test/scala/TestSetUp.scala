
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait

trait TestSetUp {

  val BASE_URL = "http://www.myntra.com/"
  val EMAIl = "charmiigarg@gmail.com"
  val InvalidEMAIl = "charmygarg@gmail.com"
  val password = "123456"
  System.setProperty("webdriver.chrome.driver", "/home/knodus/Documents/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
  val driver = new ChromeDriver(capabilities)
  val webdriverwait = new WebDriverWait(driver, 10)
}