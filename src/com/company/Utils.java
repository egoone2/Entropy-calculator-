package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class Utils {

    public static double getLog(double num) {
        return Math.log(num) * 1.0 / Math.log(2);
    }

    public static double getEntropy(Map<String, Double> map) {
        double entropy = 0.0;
        for (double pos : map.values()) {
            entropy += pos * Utils.getLog(pos) * 1.0;
        }
        return -entropy;
    }

    public static Map<String, Double> getMap(List<String> list) {
        Map<String, Double> map = new HashMap<>();
        for (String sym : new HashSet<>(list)) {
            int count = (int) list
                    .stream()
                    .filter(s -> s.equals(sym))
                    .count();
            double posibility = 1.0 * count / list.size();
            map.put(sym, posibility);
        }
        return map;
    }

    public static Map<String, Double> getBigrammMap(List<String> bigrList) {
        Map<String, Double> map = new HashMap<>();
        for (String bi : bigrList) {
            int count = (int) bigrList
                    .stream()
                    .filter(b -> b.equals(bi))
                    .count();
            double posibility = 1.0 * count / bigrList.size();
            map.put(bi, posibility);
        }
        return map;
    }

    public static int getPower(List<String> listOfChars) {
        return (int) listOfChars
                .stream()
                .distinct()
                .count();

    }
}
