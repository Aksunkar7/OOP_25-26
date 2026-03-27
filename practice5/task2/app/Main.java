package practice5.task2.app;

import practice5.task2.service.WordFreqCounter;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("in.txt"), "UTF-8"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                WordFreqCounter.countWords(line, mp);
                }

            } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        List<Map.Entry<String, Integer >> sorted = new ArrayList<>(mp.entrySet());
        sorted.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Writing result
        try (PrintWriter writer = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream("out.txt"), "UTF-8"))) {

            writer.println("Word Frequency Report");
            writer.println("=====================");
            for (Map.Entry<String, Integer> entry : sorted) {
                writer.printf("%-20s %d%n", entry.getKey(), entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
            return;
        }

        System.out.println("Done! Results written to out.txt");
    }
}

