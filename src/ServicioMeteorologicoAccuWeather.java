import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico {
    private AccuWeatherAPI accuWeatherAPI = new AccuWeatherAPI();
    private List<Map<String, Object>> condicionesClimaticas = accuWeatherAPI.getWeather("Buenos Aires, Argentina");

    @Override
    public double temperaturaActual() {
        HashMap temperatura = (HashMap)condicionesClimaticas.get(0).get("Temperature");
        return deFarenheitACelsius((double)temperatura.get("Value"));
    }

    private double deFarenheitACelsius(double temperaturaF){
        return (temperaturaF - 32)/1.8 ;
    }


}
