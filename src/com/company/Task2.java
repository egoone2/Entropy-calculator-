package com.company;


import java.util.*;


public class Task2 {
    private final String line;
    private List<String> listOfChars = new ArrayList<>();
    private Map<String, Double> map = new HashMap<>();

    public Task2(String line) {
        this.line = line;

        for (char i : line.toCharArray()) {
            listOfChars.add(Character.toString(i));
        }
    }

    public void doTask() {

        map = Utils.getMap(listOfChars);
        showAns();

    }


    public void showAns() {
        map.forEach((key, value) -> System.out.printf("%s - %.3f\n", key, value));
    }

    public List<String> getListOfChars() {
        return listOfChars;
    }

    public Map<String, Double> getMap() {
        return map;
    }
}
