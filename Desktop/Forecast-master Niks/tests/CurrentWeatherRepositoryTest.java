import com.weather.WeatherRequest;
import com.weather.reports.CurrentWeatherReport;
import com.weather.repositories.CurrentWeatherRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrentWeatherRepositoryTest {
    @Test
    void checkCurrentWeatherResponse() {
        try {
            WeatherRequest request = new WeatherRequest("Tallinn", "EE", "metric");
            com.weather.repositories.CurrentWeatherRepository repository = new com.weather.repositories.CurrentWeatherRepository();

            CurrentWeatherReport report = repository.getCurrentWeather(request);

            assertEquals(request.getCity(), report.getCity());
            assertEquals(request.getCode(), report.getCode());
            assertNotNull(report.getCurrentTemperature());
            assertNotNull(report.getMaximumTemperature());
            assertNotNull(report.getMinimalTemperature());
        } catch (Exception e) {
            fail("Failure cause: " + e.getMessage());
        }
    }
}