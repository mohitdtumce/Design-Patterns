package io.github.mohitdtumce.decorator.decorator;

import io.github.mohitdtumce.decorator.domain.Beverage;

public class Milk extends ToppingsDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }

    public double getCost() {
        return this.beverage.getCost() + 0.20;
    }
}
