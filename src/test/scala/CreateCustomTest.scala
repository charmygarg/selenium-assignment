import java.util.concurrent.TimeUnit
import org.openqa.selenium.By
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.ExpectedConditions
import org.scalatest.FlatSpec
import org.openqa.selenium.support.ui.Select

class CreateCustomTest extends FlatSpec with TestSetUp {

  "A user" should "visit on myntra.com" in {

    driver.manage().window().maximize()
    driver.get(BASE_URL)
    val title = driver.getTitle()
    val page_source = driver.getPageSource().length
    if (driver.getCurrentUrl == BASE_URL) {
      println("WELCOME TO MYNTRA.COM with title : " + title)
      println("the length of the pagesource is: " + page_source)
    } else {
      println("something went wrong")
    }
  }

  "user" should "logged " in {

    val dropDown = driver.findElementByCssSelector("div.desktop-user")
    val mouseHover = new Actions(driver)
    mouseHover.moveToElement(dropDown)
    mouseHover.build().perform()

    driver.findElementByCssSelector("div.desktop-getUserInLinks.desktop-getInLinks a:nth-child(2)").click()
    driver.findElementByCssSelector("input.login-user-input-email.login-user-input").sendKeys(EMAIl)
    driver.findElementByCssSelector("input.login-user-input-password.login-user-input").sendKeys(password)
    driver.findElementByCssSelector("button.login-login-button").click()
  }

//
//  "user" should "select a category from the list" in{
//
//    driver.manage().window().maximize()
//    driver.get(BASE_URL)
//    val dropDown = new Select(driver.findElementByCssSelector("#navbar #nav-belt .nav-fill #nav-search .nav-searchbar .nav-left .nav-search-scope.nav-sprite #searchDropdownBox"))
//    dropDown.selectByVisibleText("Clothing & Accessories")
//    driver.close()
//  }
}