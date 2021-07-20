package Observer.Observers;

import Observer.Subjects.Subject;

public class AllConditionsDisplay implements DisplayElement, Observer{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public AllConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("All Conditions : " + temperature
                + "F degrees and " + humidity + "% humidity" + "pressure : " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
