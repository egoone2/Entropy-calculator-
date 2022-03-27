package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Task5 {
    private final String line;
    private List<String> listOfChars = new ArrayList<>();
    private double entropy = 0.0;

    public Task5(String line) {
        this.line = line;
        for (char i : line.toCharArray()) {
            listOfChars.add(Character.toString(i));
        }
    }

    public double getEntropy() {
        return entropy;
    }

    public void doTask() {
        List<String> bigrammList = new ArrayList<>();

        for (int i = 0; i < listOfChars.size() - 1; i++) {
            bigrammList.add(listOfChars.get(i).concat(listOfChars.get(i + 1)));
        }

        Map<String, Double> bigrammMap = Utils.getBigrammMap(bigrammList);
        Map<String, Double> map = Utils.getMap(listOfChars);

        for (String let : map.keySet()) {
            double sum = 0.0;
            List<String> listOfBigr = bigrammMap
                    .keySet()
                    .stream()
                    .filter(bi -> bi.startsWith(let))
                    .collect(Collectors.toList());
            for (String bi : listOfBigr) {
                sum += bigrammMap.get(bi) * Utils.getLog(bigrammMap.get(bi));
            }
            map.put(let, map.get(let) * sum);
        }


        for (double i : map.values()) {
            entropy += i;
        }
        entropy *= -1;
    }

}
