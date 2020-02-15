package io.github.mohitdtumce.observer.launcher;

import io.github.mohitdtumce.observer.domain.WeatherData;
import io.github.mohitdtumce.observer.publisher.impl.WeatherDataPublisher;
import io.github.mohitdtumce.observer.subscriber.Subscriber;
import io.github.mohitdtumce.observer.subscriber.impl.DisplayStats;
import io.github.mohitdtumce.observer.subscriber.impl.DisplayTemperature;

public class ObserverPattern {
    public static void execute() {
        WeatherDataPublisher publisher = new WeatherDataPublisher();
        Subscriber displayStats = new DisplayStats();
        displayStats.subscribe(publisher);
        Subscriber displayTemperature = new DisplayTemperature();
        displayTemperature.subscribe(publisher);
        WeatherData weatherData = new WeatherData();
        double[] pressure = {760, 774, 750, 810};
        double[] temperature = {24, 30, 36, 18};
        double[] humidity = {11, 12, 13, 14};
        for (int i = 0; i < 4; i++) {
            weatherData.setData(pressure[i], temperature[i], humidity[i]);
            publisher.dataChanged(weatherData);
            if (i == 2) {
                displayStats.unsubscribe();
            }
        }
    }
}
