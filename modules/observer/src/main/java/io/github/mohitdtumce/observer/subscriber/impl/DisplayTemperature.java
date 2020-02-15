package io.github.mohitdtumce.observer.subscriber.impl;

import io.github.mohitdtumce.observer.domain.WeatherData;
import io.github.mohitdtumce.observer.publisher.Publisher;
import io.github.mohitdtumce.observer.subscriber.Display;
import io.github.mohitdtumce.observer.subscriber.Subscriber;

public class DisplayTemperature implements Display, Subscriber {
    private Publisher publisher;
    private WeatherData weatherData;

    @Override
    public void display() {
        double temperature = this.weatherData.getTemperature();
        if (temperature < 20.0) {
            System.out.println("It's cold today. Get a Jacket");
        } else if (temperature < 30.0) {
            System.out.println("Temperature is going to be awesome today");
        } else {
            System.out.println("It's hot outsite. Care to take an umbrella?");
        }
    }

    @Override
    public void subscribe(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.addSubscriber(this);
    }

    @Override
    public void unsubscribe() {
        this.publisher.removeSubscriber(this);
    }

    @Override
    public void update(WeatherData weatherData) {
        this.weatherData = weatherData;
        // Perform actions based on the updated data
        this.display();

    }
}
