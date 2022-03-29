package Ppsinh;

import common.arrayUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lkTHcon {

    private void lktapcon(List<String> persons) {
        persons.sort(Comparator.naturalOrder());
        arrayUtils ar = new arrayUtils();
        int len = persons.size();

        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = "";
        }
//        arr[len - 1] = persons.get(0);


        String cur = null;
        int curidx = 1;

        int i = len - 1;
        int count = 0;
        while (true) {
            ar.printStringArr(arr);
            count++;
            i = len - 1;
            while (i >= 0 && arr[i].equals(persons.get(i))) i--;
            if (i < 0) {
                System.out.println("Tong so co " + count + " tap hop");
                return;
            }
            cur = arr[i];
            curidx = persons.indexOf(cur);
            arr[i] = persons.get(curidx + 1);
            for (int j = i + 1; j < len; j++) {
                cur = arr[j - 1];
                curidx = persons.indexOf(cur);
                arr[j] = persons.get(curidx + 1);
            }


        }

    }

    public static void main(String[] args) {
        List<String> persons = Arrays.asList("OK", "He", "Ro", "All", "Time", "Best");
        lkTHcon lk = new lkTHcon();
        lk.lktapcon(persons);
        //All He  OK Ro Time  65 72 79 82 84

    }
}
