package io.github.mohitdtumce.decorator.domain.impl;

        import io.github.mohitdtumce.decorator.domain.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "DarkRoast";
    }

    public DarkRoast(String description) {
        this.description = description;
    }

    public double getCost() {
        return 1.19;
    }
}
