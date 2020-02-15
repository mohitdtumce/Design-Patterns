package io.github.mohitdtumce.observer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherData {
    private double pressure;
    private double temperature;
    private double humidity;

    public void setData(double pressure, double temperature, double humidity) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "[Pressure: " + this.pressure + ", Temperature: " + this.temperature + ", Humidity: " + this.humidity + "]";
    }
}
