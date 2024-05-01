import Metody.Metody;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.edge.EdgeDriver;

import static Metody.Metody.driver;

public class TestDzialaniaTags {
    public static Metody met;
    @BeforeEach
    public void Start() {
        driver = new EdgeDriver();
        driver.get("https://skleptest.pl");
        driver.manage().window().maximize();
    }
    @Test
    @DisplayName("Zapisywanie poprawne")
    public void ZapisywaniePoprawne() throws InterruptedException {
        met.SprawdzanieTags();
        driver.quit();
    }
}
