import Metody.Metody;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.edge.EdgeDriver;

import static Metody.Metody.driver;

public class LogowanieUzytkownika {
    public static Metody met;
    @BeforeEach
    public void Start() {
        driver = new EdgeDriver();
        driver.get("https://skleptest.pl");
        driver.manage().window().maximize();
    }
    @Test
    @DisplayName("Poprawne dane")
    public void PoprawneDane() throws InterruptedException {
        met.Logowanieuzytkownika("Test@intreria.pl","Test01234567890.");
        driver.quit();
    }
    @Test
    @DisplayName("Niepoprawne dane")
    public void NiePoprawneDane() throws InterruptedException {
        met.Logowanieuzytkownika("Testintreria.pl","Test01234");
        driver.quit();
    }
}
