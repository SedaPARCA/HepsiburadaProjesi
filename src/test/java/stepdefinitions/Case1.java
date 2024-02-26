package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pageobjectmodels.Elements;
import utilities.DriverManager;
import utilities.Events;

public class Case1 {
    Elements elements = new Elements();

    @Given("Visit the hepsiburada.com")
    public void visitTheHepsiburadaCom() {
        DriverManager.get().navigate().to("https://www.hepsiburada.com");
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        Events.jsClick(elements.loginHref);
    }

    @And("Enter username and click login button")
    public void enterUsernameAndClickLoginButton() {
        Events.sendKeys(elements.usernameField, "sedaparca.93@gmail.com");
        Events.click(elements.btnLogin);
    }

    @And("Enter password and click login button")
    public void enterPasswordAndClickLoginButton() {
        Events.sendKeys(elements.passwordField, "Dene123dene");
        Events.click(elements.secondBtnLogin);
    }

    @When("I should see the my name on homepage")
    public void iShouldSeeTheMyNameOnHomepage() {
        Events.verifyContainsText(elements.myAccountTxt, "SEDA PARÇA");
    }

    @Given("Search a product and click search button")
    public void searchAProductAndClickSearchButton() throws InterruptedException {
        Events.click(elements.searchField);

        Events.sendKeys(elements.searchInput, "mandal");
        Events.click(elements.searchBtn);

       // Thread.sleep(5000);

        Events.click(elements.acceptCookieBtn);

      //  Thread.sleep(5000);
    }

    @And("I click the sort button")
    public void iClickTheSortButton() throws InterruptedException {
        Events.click(elements.sortBtn);
      //  Thread.sleep(3000);
    }

    @And("I click the order by asc button")
    public void iClickTheOrderByAscButton() {
        Events.click(elements.sortByPriceAsc);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("I click the add to cart button")
    public void iClickTheAddToCartButton() throws InterruptedException {
      //  Thread.sleep(3000);

        Events.scrollToElement(elements.firstItem);

        Actions actions = new Actions(DriverManager.get());
        actions.moveToElement(elements.firstItem).build().perform();

      //  Thread.sleep(3000);

        Events.click(elements.addToBasketBtn);

       // Thread.sleep(2000);
    }

    @And("I click the basket button")
    public void iClickTheBasketButton() {
        Events.click(elements.basketBtn);
    }

    @When("I should see the cargo status message")
    public void iShouldSeeTheCargoStatusMessage() {
        Events.verifyContainsText(elements.cargoStatusMsg, "Kargonuzun bedava olması için");
    }

    @And("Delete the item from the basket")
    public void deleteTheItemFromTheBasket() {
        Events.click(elements.deleteProductBtn);
    }

    @And("Search another product and click search button")
    public void searchAnotherProductAndClickSearchButton() throws InterruptedException {
        Events.click(elements.searchField);

        Events.sendKeys(elements.searchInput, "parfüm");
        Events.click(elements.searchBtn);

        //Thread.sleep(5000);

        Events.click(elements.acceptCookieBtn);

       // Thread.sleep(5000);
    }

    @When("I should see the cargo free message")
    public void iShouldSeeTheCargoFreeMessage() {
        Events.verifyContainsText(elements.cargoFreeMsg, "Kargo bedava");
    }

    @And("I click two add to cart button")
    public void iClickTwoAddToCartButton() throws InterruptedException {
      //  Thread.sleep(3000);

        Events.scrollToElement(elements.firstItem);

        Actions actions = new Actions(DriverManager.get());
        actions.moveToElement(elements.firstItem).build().perform();

       // Thread.sleep(3000);

        Events.click(elements.getAddToBasketBtn2);

       // Thread.sleep(2000);
    }
}
