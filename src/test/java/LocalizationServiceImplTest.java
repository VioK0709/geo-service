import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

public class LocalizationServiceImplTest {

    @Test
    void testLocale() {
        System.out.println("test locale");
        LocalizationService localizationService = new LocalizationServiceImpl();
        String original = localizationService.locale(Country.RUSSIA);
        String expected = "Добро пожаловать";
        assertEquals(expected, original);

    }
}
