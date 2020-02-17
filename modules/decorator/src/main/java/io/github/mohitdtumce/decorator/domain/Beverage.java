package io.github.mohitdtumce.decorator.domain;

public abstract class Beverage {
    protected String description = "UnknownBeverage";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
