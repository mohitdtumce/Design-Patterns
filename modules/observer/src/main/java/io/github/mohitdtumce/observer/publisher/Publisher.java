package io.github.mohitdtumce.observer.publisher;

import io.github.mohitdtumce.observer.subscriber.Subscriber;

public interface Publisher {
    public void addSubscriber(Subscriber subscriber);

    public void removeSubscriber(Subscriber subscriber);

    public void notifySubscribers();
}
