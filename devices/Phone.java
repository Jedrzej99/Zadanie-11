package devices;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.List;

public class Phone extends Device  {
    public Phone(String model, String producer, double year) {
        super(model, producer, year);
    }


    @Override
    public void turnOn() {
        System.out.println("Telefon został włączony");
    }

    static final String DEFAULT_SERVER = "https://java.com";
    static final String DEFAULT_PROTOCOL = "https";
    static final String DEFAULT_VERSION = "1.0";


    void installApp(String appName) {

    }
    void installApp(String appName, String appVersion) {

    }
    void installApp(String appName, String appVersion, String server) {

    }
    void installApp(List<String> appName) {

    }
    void installApp(URL appURL) {

    }

}
