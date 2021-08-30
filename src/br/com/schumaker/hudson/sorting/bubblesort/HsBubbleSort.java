package br.com.schumaker.hudson.sorting.bubblesort;

import java.util.List;

/**
 *
 * @author Hudson Schumaker
 */
public final class HsBubbleSort {

    public HsBubbleSort() {
    }

    public void bubbleSort(int[] list) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < list.length - j; i++) {
                if (list[i] > list[i + 1]) {
                    tmp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    public void bubbleSort(List<Integer> list) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < list.size() - j; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    tmp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, tmp);
                    swapped = true;
                }
            }
        }
    }
}
