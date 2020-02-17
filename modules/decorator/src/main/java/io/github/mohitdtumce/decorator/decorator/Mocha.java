package io.github.mohitdtumce.decorator.decorator;

import io.github.mohitdtumce.decorator.domain.Beverage;

public class Mocha extends ToppingsDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    public double getCost() {
        return this.beverage.getCost() + 0.25;
    }
}
