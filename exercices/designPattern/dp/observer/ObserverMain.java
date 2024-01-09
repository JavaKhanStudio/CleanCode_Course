package dp.observer;

public class ObserverMain {

	public static void main(String[] args) {
		// Le code c'est ici !
		
		WeatherStation weatherStation = new WeatherStation();

        DisplayDevice display1 = new DisplayDevice();
        DisplayDevice display2 = new DisplayDevice();

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        weatherStation.setTemperature(25.0f);
	}
	
}
