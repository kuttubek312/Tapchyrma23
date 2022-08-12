package com.peacksoft;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++){
            arrayList.add(random.nextInt(50));
        }

        for (int i:arrayList) {
            System.out.print(i + " ");
        }



        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);


        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(1.1);
        list2.add(1.2);
        list2.add(1.3);
        list2.add(1.4);
        list2.add(1.5);
        list2.add(1.6);
        list2.add(1.7);
        list2.add(1.8);
        list2.add(1.9);
        list2.add(1.10);

        System.out.println(list2);

    }
}