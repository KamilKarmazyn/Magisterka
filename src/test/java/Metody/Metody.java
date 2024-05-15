package Metody;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.*;


import javax.enterprise.inject.New;
import java.util.List;

import static Zmienne.Zmienne.*;


public class Metody {
    public static WebDriverWait wait;
    public static EdgeDriver driver;


    public static void ScrollToElement(String element) {
        WebElement Scelement = driver.findElement(By.xpath(element));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Scelement);
    }

    public static void WejscieBlog() {
        driver.findElement(By.xpath(IconBlog)).click();
    }


    public static void SprawdzenieElementowBlogu() throws InterruptedException {
        driver.findElement(By.xpath(TextCategories));
        ScrollToElement(TextCategories);
        value = driver.findElement(By.xpath(TextCatFashion)).getText();
        driver.findElement(By.xpath("//*[contains(text(),'" + value + "')]"));
        driver.findElement(By.xpath(TextArchives));
        value = driver.findElement(By.xpath(ButtonArchivesEle)).getText();
        driver.findElement(By.xpath("//*[contains(text(),'" + value + "')]"));
        driver.findElement(By.xpath(TextMeta));
        value = driver.findElement(By.xpath(ButtonMetaEle)).getText();
        driver.findElement(By.xpath("//*[contains(text(),'" + value + "')]"));
        driver.findElement(By.xpath(TextRecentPosts));
        value = driver.findElement(By.xpath(ButtonRecentPosts)).getText();
        driver.findElement(By.xpath("//*[contains(text(),'" + value + "')]"));
        driver.findElement(By.xpath(TextRecentComments));
        value = driver.findElement(By.xpath(ButtonRecentComments)).getText();
        driver.findElement(By.xpath("//*[contains(text(),'" + value + "')]"));
    }

    public static void WyszukiwanieArtykulowBloga(String Wyszukiwanie) throws InterruptedException {
        driver.findElement(By.xpath(InputSearchArticle)).sendKeys(Wyszukiwanie);
        driver.findElement(By.xpath(ButtonSearchArticle)).click();
    }

    public static void SprawdzanieNewslettera(String name, String email) {
        driver.findElement(By.xpath(TextBoxName)).sendKeys(name);
        driver.findElement(By.xpath(TextBoxEmail)).sendKeys(email);
        driver.findElement(By.xpath(ButtonSubscribe)).click();
    }

    public static void SprawdzanieTags() throws InterruptedException {
        driver.findElement(By.xpath(ButtonTagsAutumn)).click();
        value = driver.findElement(By.xpath(TextTags)).getText();
        driver.findElement(By.xpath("//*[contains(text(),'" + value + "')]"));
    }
    public static void RejestracjaUzytkownika(String email,String password){
        driver.findElement(By.xpath(ButtonAccount)).click();
        driver.findElement(By.xpath(TextBoxREmail)).sendKeys(email);
        driver.findElement(By.xpath(TextBoxRPassword)).sendKeys(password);
        if (driver.findElement(By.xpath(ButtonRegistery)).isDisplayed()){
            driver.findElement(By.xpath(ButtonRegistery)).click();
        }else
            driver.findElement(By.xpath("//input[@name='register' and @disabled='disabled']"));
    }
    public static void RejestracjaUzytkownikaSlabeHaslo(String email,String password) throws InterruptedException {
        driver.findElement(By.xpath(ButtonAccount)).click();
        driver.findElement(By.xpath(TextBoxREmail)).sendKeys(email);
        driver.findElement(By.xpath(TextBoxRPassword)).sendKeys(password);
        if (driver.findElement(By.xpath(ButtonRegistery)).isDisplayed()) {
            Thread.sleep(1000);
            driver.findElement(By.xpath(ButtonRegistery)).click();
            driver.findElement(By.xpath(TextWeakPassword));
        }
    }

    public static void Logowanieuzytkownika(String email,String password) {
        driver.findElement(By.xpath(ButtonAccount)).click();
        boolean isLogoutButtonPresent = driver.findElements(By.xpath(ButtonLogout)).size() > 0;

        if (isLogoutButtonPresent && driver.findElement(By.xpath(ButtonLogout)).isDisplayed()) {
            driver.findElement(By.xpath(ButtonLogout)).click();
        }
        driver.findElement(By.xpath(TextBoxLEmail)).sendKeys(email);
        driver.findElement(By.xpath(TextBoxLPassword)).sendKeys(password);
        driver.findElement(By.xpath(ButtonLogin)).click();
        List<WebElement> errorElements = driver.findElements(By.xpath("//ul[@class='woocommerce-error']"));
        if (!errorElements.isEmpty() && errorElements.get(0).isDisplayed()) {
            driver.close();
        } else {
            driver.findElement(By.xpath(ButtonLogout)).click();
        }
    }
    public static void DodanieProduktowDoKoszyka(String product,int number) throws InterruptedException {
        driver.findElement(By.xpath(ButtonMainMenu)).click();
        driver.findElement(By.xpath(TextFieldSearch)).sendKeys(product);
        driver.findElement(By.xpath(ButtonSearch)).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[contains(normalize-space(), '" + product + "')]")).click();
        driver.findElement(By.xpath(TextBoxProductNumber)).clear();
        driver.findElement(By.xpath(TextBoxProductNumber)).sendKeys(String.valueOf(number));
        driver.findElement(By.xpath(ButtonAddToCart)).click();
        driver.findElement(By.xpath(ButtonCart)).click();
        driver.findElement(By.xpath(ButtonPurchase)).click();
    }
    public static void WypelnienieZamowienia(String Name, String LastName, String Company, String Street, String Street2, String ZIP, String Town, String Phone, String Email) throws InterruptedException {
        WebElement lastNameField = driver.findElement(By.xpath(TextBoxLastNameBiling));
        if (lastNameField.getText().isEmpty()) {
            lastNameField.sendKeys(LastName);
        }

        driver.findElement(By.xpath(TextboxNameBiling)).sendKeys(Name);
        Thread.sleep(500);
        driver.findElement(By.xpath(TextBoxLastNameBiling)).sendKeys(LastName);
        driver.findElement(By.xpath(TextBoxCompanyBiling)).sendKeys(Company);
        driver.findElement(By.xpath(TextBoxStreetAdressBiling)).sendKeys(Street);
        driver.findElement(By.xpath(TextBoxStreetAdressBiling2)).sendKeys(Street2);
        driver.findElement(By.xpath(TextBoxZIPBiling)).sendKeys(ZIP);
        driver.findElement(By.xpath(TextBoxTownBiling)).sendKeys(Town);
        driver.findElement(By.xpath(TextBoxPhoneBiling)).sendKeys(Phone);
        driver.findElement(By.xpath(TextBoxEmailBiling)).sendKeys(Email);
        Thread.sleep(500);
        driver.findElement(By.xpath(TextBoxBilingPlaceOrder)).click();
        Thread.sleep(1000);

        try {
            // Sprawdzamy, czy element błędu istnieje
            WebElement errorElement = null;
            try {
                errorElement = driver.findElement(By.xpath("//div[contains(@class,'error')]"));
            } catch (NoSuchElementException ex) {
                // Jeśli element nie istnieje, nic nie robimy
            }

            // Jeśli element błędu istnieje i jest widoczny, wykonujemy odpowiednie działania
            if (errorElement != null && errorElement.isDisplayed()) {
                driver.findElement(By.xpath(TextBoxBilingPlaceOrder)).click();
                Thread.sleep(1000);
            } else {
                WebElement thanksElement = null;
                try {
                    thanksElement = driver.findElement(By.xpath(LabelThanksForPurhase));
                } catch (NoSuchElementException ex) {
                }
                if (thanksElement != null && thanksElement.isDisplayed()) {
                }
            }
        } catch (ElementNotInteractableException e) {
        }
    }




    public static void WyszukiwanieProduktow(String product) throws InterruptedException {
        driver.findElement(By.xpath(ButtonMainMenu)).click();
        driver.findElement(By.xpath(TextFieldSearch)).sendKeys(product);
        driver.findElement(By.xpath(ButtonSearch)).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[contains(normalize-space(),'"+product+"')]")).click();
    }
    public static void SprawdzenieKomunikatu(String komunikat){
        driver.findElement(By.xpath(ButtonRegistery)).click();
        driver.findElement(By.xpath(PopupWrongEmailR));
    }
}
