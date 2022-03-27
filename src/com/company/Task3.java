package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Task3 {
    private final String line;
    private List<String> listOfChars = new ArrayList<>();
    private final Map<String, Double> map;
    private double entropy;

    public Task3(String line) {
        this.line = line;
        for (char i : line.toCharArray()) {
            listOfChars.add(Character.toString(i));
        }
        map = Utils.getMap(listOfChars);
    }

    public void doTask() {
        this.entropy = Utils.getEntropy(map);
    }

    public double getEntropy() {
        return entropy;
    }
}
