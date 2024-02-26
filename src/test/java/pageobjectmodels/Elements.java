package pageobjectmodels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    public Elements() {
        PageFactory.initElements(DriverManager.get(), this);
    }

    @FindBy(xpath = "//button[text()='Kabul et']")
    public WebElement acceptCookieBtn;

    @FindBy(id = "login")
    public WebElement loginHref;

    @FindBy(id = "txtUserName")
    public WebElement usernameField;

    @FindBy(id = "txtPassword")
    public WebElement passwordField;

    @FindBy(id = "btnLogin")
    public WebElement btnLogin;

    @FindBy(id = "btnEmailSelect")
    public WebElement secondBtnLogin;

    @FindBy(xpath = "//span[text()='SEDA PARÇA']")
    public WebElement myAccountTxt;

    @FindBy(className = "searchBoxOld-uKvVtLzPNdHp38hj3B13")
    public WebElement searchField;

    @FindBy(css = "input[type='text']")
    public WebElement searchInput;

    @FindBy(xpath = "//div[text()='ARA']")
    public WebElement searchBtn;

    @FindBy(className = "moria-Dropdown-bZkvzv")
    public WebElement sortBtn;

    @FindBy(className = "horizontalSortingBar-PkoDOH7UsCwBrQaQx9bn")
    public WebElement sortByPriceAsc;

    @FindBy(xpath = "//div[text()='En yüksek fiyat']")
    public WebElement sortByPriceDesc;

    @FindBy(xpath = "//div[text()='Sepete ekle']")
    public WebElement addToBasketBtn;

    @FindBy(className = "moria-ProductCard-fJNuEt")
    public WebElement getAddToBasketBtn2;

    @FindBy(className = "moria-ProductCard-iymOAa")
    public WebElement firstItem;

    @FindBy(xpath = "//span[text()='Sepetim']")
    public WebElement basketBtn;

    @FindBy(css = ".cargo_free_prom_message_1_Ng1 span")
    public WebElement cargoStatusMsg;

    @FindBy(className = "merchant_shipping_2bjR-")
    public WebElement cargoFreeMsg;

    @FindBy(css = "a[aria-label='Sepetten Çıkar']")
    public WebElement deleteProductBtn;

}
