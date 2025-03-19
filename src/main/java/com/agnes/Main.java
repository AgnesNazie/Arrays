package com.agnes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }
// exercise 1
    public static void exercise1() {
        System.out.println("EXERCISE 1");
        int[] numbers = {11, 23, 39};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
    }
    // exercise 2. indexOf method
    public static void exercise2 () {
        System.out.println("EXERCISE 2");
        int [] numbers = { 1, 3, 5, 7, 9};
        int index = indexOf(numbers, 5);
        System.out.println("index position of numbers 5 is : " + index);
    }
    // create a method to find the indexOf
    public static int indexOf(int[] array , int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void exercise3() {
        System.out.println("EXERCISE 3");

        String[] cities = {"Paris", "London", "New York", "Stockholm"};
        System.out.println("STRING ARRAY: " + Arrays.toString(cities));

        System.out.println("========================");

        Arrays.sort(cities);
        System.out.println("SORTED STRING ARRAY:" + Arrays.toString(cities));
    }
    public static void exercise4() {
        System.out.println("EXERCISE 4: ");
        int [] firstNumbers = {1, 15, 20 };
        int [] secondNumbers = new int [firstNumbers.length];
        for (int i = 0; i <firstNumbers.length; i++) {
            secondNumbers[i] = firstNumbers[i];
        }
        System.out.println("Elements from first Numbers: ");
        for(int num : firstNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nElements from second Numbers: ");
        for(int num : secondNumbers) {
            System.out.print(num + " ");
        }
        // exercise 5. String Array
    }
}