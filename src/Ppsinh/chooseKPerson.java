package Ppsinh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class chooseKPerson {
    private void pringStringArr(String[] arrStr) {
        for (String item : arrStr) {
            System.out.print(item + " ");
        }
        System.out.println(" ");
    }

    private void lk(List<String> persons, int k) {
        persons.sort(Comparator.naturalOrder());
        int len = persons.size();

        String[] arr = new String[k];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = persons.get(i);
        }
        String cur = null;
        int curidx = 0;

        int i = k - 1;
        while (true) {
            pringStringArr(arr);
            i = k - 1;
            while (i >= 0 && arr[i].equals(persons.get(len - k + i))) i--;
            if (i < 0) return;
            cur = arr[i];
            curidx = persons.indexOf(cur);
            arr[i] = persons.get(curidx + 1);
            for (int j = i + 1; j < k; j++) {
                cur = arr[j - 1];
                curidx = persons.indexOf(cur);
                arr[j] = persons.get(curidx + 1);
            }


        }
    }

    public static void main(String[] args) {
        List<String> persons = Arrays.asList("OK", "He", "Ro", "All", "Time","Best");
        chooseKPerson lk = new chooseKPerson();
        lk.lk(persons, 3);
        //All He  OK Ro Time  65 72 79 82 84

    }
}
