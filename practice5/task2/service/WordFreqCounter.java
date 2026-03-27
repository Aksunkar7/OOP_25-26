package practice5.task2.service;

import java.util.*;

public class WordFreqCounter {
    public static void countWords(String line, Map<String, Integer> map) {
        String[] words = line.toLowerCase()
                .replaceAll("[^a-z0-9\\s]", "")
                .split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
    }
}
