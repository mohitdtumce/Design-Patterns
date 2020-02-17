package io.github.mohitdtumce.decorator.decorator;

import io.github.mohitdtumce.decorator.domain.Beverage;

public class Soy extends ToppingsDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    public double getCost() {
        return this.beverage.getCost() + 0.15;
    }
}
