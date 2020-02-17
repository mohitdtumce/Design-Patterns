package io.github.mohitdtumce.decorator.decorator;

import io.github.mohitdtumce.decorator.domain.Beverage;

public abstract class ToppingsDecorator extends Beverage {
    protected Beverage beverage;

    public ToppingsDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();

    public abstract double getCost();
}
