package practice4.task5.services;

import practice4.task5.models.Sortable;

public class CountingSort implements Sortable {
    @Override
    public int[] sort(int[] array) {
        int[] count = new int[11];
        for (int i = 0; i < array.length; ++i) {
            count[array[i]]++; // коунттың индексі бізге керек сан, соның мәнін алып арттырып отырамыз, частота
        }
        int[] res = new int[array.length];
//  0 0 1 1 2
        int idx = 0;
        for (int i = 0; i < count.length; ++i) {
            for (int j = 0; j < count[i]; ++j) {
                res[idx] = i;
                idx++;
            }
        }

        return res;
    }

}
