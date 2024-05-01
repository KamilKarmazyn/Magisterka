import Metody.Metody;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.edge.EdgeDriver;

import static Metody.Metody.driver;

public class WyszukiwanieProduktu {
    public static Metody met;
    @BeforeEach
    public void Start() {
        driver = new EdgeDriver();
        driver.get("https://skleptest.pl");
        driver.manage().window().maximize();
    }
    @Test
    @DisplayName("Wyszukiwanie ogólne")
    public void Wyszukiwanieogolne() throws InterruptedException {
        met.WyszukiwanieProduktow("Top");
        driver.quit();
    }
    @Test
    @DisplayName("Wyszukiwanie szczegółowe")
    public void Wyszukiwanieszczegolowe() throws InterruptedException {
        met.WyszukiwanieProduktow("Black Top");
        driver.quit();
    }
}
