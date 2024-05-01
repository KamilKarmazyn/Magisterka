import Metody.Metody;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.edge.EdgeDriver;

import static Metody.Metody.driver;

public class DodawanieProduktow {
    public static Metody met;
    @BeforeEach
    public void Start() {
        driver = new EdgeDriver();
        driver.get("https://skleptest.pl");
        driver.manage().window().maximize();
    }
    @Test
    @DisplayName("Dodawanie produktu do koszyka")
    public void Dodawanieproduktu() throws InterruptedException {
        met.DodanieProduktowDoKoszyka("Black Top",1);
        met.WypelnienieZamowienia("Test1","Test2","Test","Test","80/2","90-700","Test","123456789","tet@gmail.com");
        driver.quit();
    }
}
