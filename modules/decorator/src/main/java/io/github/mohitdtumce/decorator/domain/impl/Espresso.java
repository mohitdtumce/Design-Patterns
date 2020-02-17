package io.github.mohitdtumce.decorator.domain.impl;

import io.github.mohitdtumce.decorator.domain.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    public Espresso(String description) {
        this.description = description;
    }

    public double getCost() {
        return 1.99;
    }
}
