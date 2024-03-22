package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new LinkedList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                list.add(entry.getKey());
            }
        }
        if (!list.isEmpty()) {
            list.sort((o1, o2) -> {
                if (o1.length() == o2.length()) {
                    return -o1.compareToIgnoreCase(o2);
                }
                return o2.length() - o1.length();
            });
        }
        return list;
    }
}
