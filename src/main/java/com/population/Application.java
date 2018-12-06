package com.population;

import static com.population.PopulationCounter.getPopulation;

final class Application {

    public static void main(String...args) throws Exception {
        String num = getPopulation(args[0]);
        System.out.printf("World population is: %s\n", num);
    }
}
