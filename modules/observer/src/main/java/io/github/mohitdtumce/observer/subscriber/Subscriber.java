package io.github.mohitdtumce.observer.subscriber;

import io.github.mohitdtumce.observer.domain.WeatherData;
import io.github.mohitdtumce.observer.publisher.Publisher;

public interface Subscriber {
    public void subscribe(Publisher publisher);
    public void unsubscribe();
    public void update(WeatherData weatherData);
}
