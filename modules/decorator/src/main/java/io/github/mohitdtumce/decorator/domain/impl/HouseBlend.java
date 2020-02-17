package io.github.mohitdtumce.decorator.domain.impl;

import io.github.mohitdtumce.decorator.domain.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    public HouseBlend(String description) {
        this.description = "HouseBlend";
    }

    public double getCost() {
        return 1.59;
    }
}
