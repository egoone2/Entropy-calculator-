package com.company;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    private final String line;
    private List<String> listOfChars = new ArrayList<>();
    private double hMax;
    private double h;

    public Task4(String line) {
        this.line = line;
        for (char i : line.toCharArray()) {
            listOfChars.add(Character.toString(i));
        }
    }

    public void doTask() {
        this.hMax = Utils.getLog(Utils.getPower(listOfChars));
        this.h = Utils.getEntropy(Utils.getMap(listOfChars));
    }

    public double gethMax() {
        return hMax;
    }

    public double getH() {
        return h;
    }
}
