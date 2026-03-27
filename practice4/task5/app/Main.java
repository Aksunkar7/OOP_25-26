package practice4.task5.app;

import practice4.task5.services.CountingSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 1, 1, 3, 5, 0, 0, 10};
        CountingSort s = new CountingSort();
        int[] sorted = s.sort(array);
        for (int i: sorted) {
            System.out.print(i + " ");
        }
    }
}
