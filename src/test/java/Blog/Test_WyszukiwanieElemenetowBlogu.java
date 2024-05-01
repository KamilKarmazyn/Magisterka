import Metody.Metody;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.edge.EdgeDriver;

import static Metody.Metody.driver;

public class Test_WyszukiwanieElemenetowBlogu {
    public static Metody met;

    @BeforeEach
    public void Start() {
        driver = new EdgeDriver();
        driver.get("https://skleptest.pl");
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Wyszukiwanie ogólne blogu")
    public void BWyszukiwanieOgolnePoBlogu() throws InterruptedException {
        met.WejscieBlog();
        met.WyszukiwanieArtykulowBloga("dress");
        driver.quit();
    }

    @Test
    @DisplayName("Elementy Blogu")
    public void AElementyBlogu() throws InterruptedException {
        Metody.WejscieBlog();
        Metody.SprawdzenieElementowBlogu();
        driver.quit();
    }
}
