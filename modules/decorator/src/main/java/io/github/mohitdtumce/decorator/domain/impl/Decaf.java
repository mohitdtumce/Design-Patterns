package io.github.mohitdtumce.decorator.domain.impl;

        import io.github.mohitdtumce.decorator.domain.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf";
    }

    public Decaf(String description) {
        this.description = description;
    }

    public double getCost() {
        return 0.99;
    }
}
