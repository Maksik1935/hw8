package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        task1(2020);
        task2(0, 1853);
        task3(65);
        task4("aabccddefgghiijjkk");
        int[] arr = {5, 4, 7, 8, 0 ,9};
        task5(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void task1(int year) {
        boolean leap = (year % 4 == 0 && year % 100 !=0) || year % 400 ==0;
        if (leap) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + "  - не високосный год");
        }
    }

    static void task2 (int clientOS, int clientDeviceYear) {
        int currentYear = 2022;
        if(clientOS == 0) {
            if(clientDeviceYear < currentYear) {
                System.out.println("Вариант 1");
            } else {
                System.out.println("Вариант 2");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Вариант 3");
            } else {
                System.out.println("Вариант 4");
            }
        } else {
            System.out.println("Вариант ошибки");
        }
    }

    static int task3(int deliveryDistance) {
        int deliveryTime = 0;
        if(deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
        }
        return deliveryTime;
        }

    static void task4(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                System.out.println("Дублирован символ " + str.charAt(i));
                return;
            }
            System.out.println("В строке нет дублей");
        }
    }
    static void task5(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }
        Collections.reverse(arrList);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrList.get(i);
        }

    }

}
