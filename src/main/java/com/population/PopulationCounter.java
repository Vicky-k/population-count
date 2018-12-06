package com.population;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class PopulationCounter {


    static String getPopulation(String arg) throws IOException {
        long sum = 0;
        //List<String> lines = Files.readAllLines(Paths.get(arg), StandardCharsets.ISO_8859_1);
        List<String> lines = UserFileReader.readFile(arg);

        for(int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] terms = line.split(",");
            String popText = terms[4];
            if(popText.length() != 0) {
                long population = Integer.parseInt(popText);
                sum += population;
            }
        }
        //String num = NumberFormat.getInstance(Locale.getDefault()).format(sum);
        //System.out.printf("World population is: %s\n", num);
        return "World population is: "+NumberFormat.getInstance(Locale.getDefault()).format(sum)
        +"\n";

    }
}
