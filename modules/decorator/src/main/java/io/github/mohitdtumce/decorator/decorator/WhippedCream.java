package io.github.mohitdtumce.decorator.decorator;

import io.github.mohitdtumce.decorator.domain.Beverage;

public class WhippedCream extends ToppingsDecorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Whipped Cream";
    }

    public double getCost() {
        return this.beverage.getCost() + 0.30;
    }
}
