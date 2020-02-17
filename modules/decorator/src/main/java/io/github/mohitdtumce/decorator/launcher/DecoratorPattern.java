package io.github.mohitdtumce.decorator.launcher;

import io.github.mohitdtumce.decorator.decorator.Milk;
import io.github.mohitdtumce.decorator.decorator.Mocha;
import io.github.mohitdtumce.decorator.decorator.WhippedCream;
import io.github.mohitdtumce.decorator.domain.Beverage;
import io.github.mohitdtumce.decorator.domain.impl.DarkRoast;
import io.github.mohitdtumce.decorator.domain.impl.Decaf;

public class DecoratorPattern {
    public static void execute() {
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Milk(beverage1);
        beverage1 = new WhippedCream(beverage1);

        System.out.println(beverage1.getDescription() + "/" + beverage1.getCost());

        Beverage beverage2 = new Decaf();

        System.out.println(beverage2.getDescription() + "/" + beverage2.getCost());
    }
}
