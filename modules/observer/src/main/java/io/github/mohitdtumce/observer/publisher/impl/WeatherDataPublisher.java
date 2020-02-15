package io.github.mohitdtumce.observer.publisher.impl;

import io.github.mohitdtumce.observer.domain.WeatherData;
import io.github.mohitdtumce.observer.publisher.Publisher;
import io.github.mohitdtumce.observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataPublisher implements Publisher {
    private List<Subscriber> subscribers;
    private WeatherData weatherData;

    public WeatherDataPublisher() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        int index = this.subscribers.indexOf(subscriber);
        if (index >= 0) {
            System.out.println("Unsubscribed " + subscriber.getClass().toString());
            this.subscribers.remove(index);
        } else {
            System.out.println("Couldn't Unsubscribe");
        }

    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : this.subscribers)
            subscriber.update(this.weatherData);
    }

    public void dataChanged(WeatherData weatherData) {
        this.weatherData = weatherData;
        notifySubscribers();
    }
}
