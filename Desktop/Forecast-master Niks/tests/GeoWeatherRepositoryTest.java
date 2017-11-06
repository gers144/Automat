import com.weather.WeatherRequest;
import com.weather.reports.GeoWeatherReport;
import com.weather.repositories.GeoWeatherRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoWeatherRepositoryTest {
    @Test
    void checkGeoWeatherResponse() {
        try {
            WeatherRequest request = new WeatherRequest("Tallinn", "EE", "metric");
            GeoWeatherRepository repository = new GeoWeatherRepository();

            GeoWeatherReport report = repository.getGeoWeather(request);

            fail("Not implimented");
        } catch (Exception e) {
            fail("Failure cause: " + e.getMessage());
        }
    }
}