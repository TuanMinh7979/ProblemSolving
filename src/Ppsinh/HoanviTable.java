package Ppsinh;


import common.arrayUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HoanviTable {


    private void lk(List<String> persons) {
        arrayUtils ar= new arrayUtils();
        int len = persons.size();
        persons.sort(Comparator.naturalOrder());
        String[] arr = new String[len];

        for(int i=0; i< arr.length; i++){
            arr[i]=persons.get(i);
        }
         int count=0;
        while(true){
            count++;
            ar.printStringArr(arr);
           int i= ar.FirstIofLastDesArr(arr, persons);
           if(i<0) {
               System.out.println("So hoan vi la "+count);
               return;}

            int bidx = ar.MinComIdx(arr[i], arr, i + 1, persons);
            String temp = arr[bidx];
            arr[bidx] = arr[i];
            arr[i] = temp;

            int a = i + 1, b = len - 1;
            ar.inverse(arr, a, b);


        }

    }

    public static void main(String[] args) {
        List<String> persons = Arrays.asList("OK", "He", "Ro", "All", "Time","Best");
        HoanviTable hv= new HoanviTable();
//        arrayUtils ar= new arrayUtils();
//        int len = persons.size();
//        persons.sort(Comparator.naturalOrder());
//        String[] arr = new String[len];
//
//        for(int i=0; i< arr.length; i++){
//            arr[i]=persons.get(i);
//        }
//        int i= ar.FirstIofLastDesArr(arr, persons);
//        int bidx = ar.MinComIdx(arr[i], arr, i + 1, persons);
//        System.out.println("i la "+bidx);
        hv.lk(persons);
    }
}
