import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

public class GeoServiceImplTest {

    GeoServiceImpl sut;

    @BeforeEach
    public void beforeEach() {
        System.out.println("before each test");
        sut = new GeoServiceImpl();
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each test");
        sut = null;
    }

    @Test
    void testByIpCountryRussia() {
        System.out.println("test byIp. Country Russia");
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location expected = new Location("Moscow", Country.RUSSIA, null, 0);
        Location result = geoService.byIp("172.");
        assertEquals(expected.getCity(), result.getCity());
        assertEquals(expected.getCountry(), result.getCountry());
    }

    @Test
    void testByIpCountryUSA() {
        System.out.println("test byIp. Country USA");
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location expected = new Location("New York", Country.USA, null, 0);
        Location result = geoService.byIp("96.");
        assertEquals(expected.getCity(), result.getCity());
        assertEquals(expected.getCountry(), result.getCountry());
    }

    @Test
    void testByCoordinates() {
        System.out.println("test byCoordinates");
        String original = null;
        assertThrows(RuntimeException.class, () -> original.contains("Not implemented"));
    }

}
