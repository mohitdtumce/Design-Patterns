package io.github.mohitdtumce.observer.subscriber.impl;

import io.github.mohitdtumce.observer.domain.WeatherData;
import io.github.mohitdtumce.observer.publisher.Publisher;
import io.github.mohitdtumce.observer.subscriber.Display;
import io.github.mohitdtumce.observer.subscriber.Subscriber;

public class DisplayStats implements Subscriber, Display {
    private Publisher publisher;
    private WeatherData weatherData;


    @Override
    public void display() {
        System.out.println(this.weatherData.toString());
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
        this.display();
    }
}
