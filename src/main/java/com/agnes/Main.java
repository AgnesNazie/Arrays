package com.agnes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        multiplicationTable();
        exercise11();
        exercise12();
        exercise13();
    }

    // exercise 1
    public static void exercise1() {
        System.out.println("EXERCISE 1");
        int[] numbers = {11, 23, 39};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n");
    }

    // exercise 2. indexOf method
    public static void exercise2() {
        System.out.println("EXERCISE 2");
        int[] numbers = {1, 3, 5, 7, 9};
        int index = indexOf(numbers, 5);
        System.out.println("index position of numbers 5 is : " + index);
    }

    // create a method to find the indexOf
    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    // sort

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
        int[] firstNumbers = {1, 15, 20};
        int[] secondNumbers = new int[firstNumbers.length];
        System.arraycopy(firstNumbers, 0, secondNumbers, 0, firstNumbers.length);
        System.out.println("Elements from first Numbers: ");
        for (int num : firstNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nElements from second Numbers: ");
        for (int num : secondNumbers) {
            System.out.print(num + " ");
        }
    }
    // exercise 5. String Array

    public static void exercise5() {
        System.out.println("\nEXERCISE 5: ");
        String[][] countryCities = {{"France", "Paris"}, {"Sweden", "Stockholm"}};
        for (String[] countryCity : countryCities) {
            System.out.println(countryCity[0] + " " + countryCity[1]);
        }
    }

    //exercise 6.find average of 6 numbers
    public static void exercise6() {
        System.out.println("\nEXERCISE 6: ");
        int[] numbers = {43, 5, 23, 17, 2, 14};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average is: " + average);
    }

    // exercise 7. find odd numbers from array of numbers
    public static void exercise7() {
        System.out.println("\n EXERCISE 7: ");
        int[] numbers = {1, 2, 4, 7, 9, 12};
        System.out.print("ARRAY: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.print("\n ODD NUMBERS: ");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void exercise8() {
        System.out.println("\nEXERCISE 8: ");
        int[] numbers = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        System.out.print("ARRAY: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        Set<Integer> unique = new LinkedHashSet<>();
        for (int i : numbers) {
            unique.add(i);
        }
        System.out.print("\nARRAY WITHOUT DUPLICATE NUMBERS: ");
        for (int i : unique) {
            System.out.print(i + " ");
        }
    }

    // exercise 9.expand an array
    public static void exercise9() {
        int[] original = {1, 2, 3};
        System.out.println("\nEXERCISE 9 : ");
        System.out.println("Original Array:" + Arrays.toString(original));

        // add new element
        int[] newElement = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            newElement[i] = original[i];
        }
        newElement[newElement.length - 1] = 4;

        System.out.println("Expanded Array:");
        System.out.println(Arrays.toString(newElement));

    }

    // exercise 10. multiplication table stored in multi arrays
    public static void multiplicationTable() {
        System.out.println("Multiplication Table");
        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // exercise 11 user input and store data in reverse order
    public static void exercise11() {
        // import scanner
        Scanner scanner = new Scanner(System.in);
        List<Integer> userInputList = new ArrayList<>();
        // declare and initialise target value to stop loop
        int target = 5;
        System.out.println("Enter integers.Type " + target);

        while (true) {
            System.out.println("Enter number: ");
            int input = scanner.nextInt();
            userInputList.add(input);
            if (input == target) break;
        }
        //convert to array
        int[] inputArray = new int[userInputList.size()];
        for (int i = 0; i < userInputList.size(); i++) {
            inputArray[i] = userInputList.get(i);
        }
        System.out.println("OriginalArray:" + Arrays.toString(inputArray));
        // reverse array
        for (int i = 0; i < inputArray.length / 2; i++) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - 1 - i];
            inputArray[inputArray.length - 1 - i] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(inputArray) + "\n");
    }

    public static void exercise12() {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};

        int[] rowPositions = {0, 1, 2};
        int[] colPositions = {0, 0, 2};

        System.out.println("Diagonal elements:");
        for (int i = 0; i < rowPositions.length; i++) {
            int row = rowPositions[i];
            int col = colPositions[i];
            System.out.print(numbers[row][col] + " ");

        }
        System.out.println("\n");
    }

    public static void exercise13() {
        //set arbitrary size
        int size = 10;
        // create 2 arrays
        int[] randomNumbers = new int[size];
        int[] sortedNumbers = new int[size];
        //import java utils
        Random random = new Random();
        // fill with numbers and set boundaries (1-100)
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("Original Array: " + Arrays.toString(randomNumbers));
        // split to left and right
        int left = 0;
        int right = size - 1;
        for (int num : randomNumbers) {
            if (num % 2 != 0) {
                sortedNumbers[left++] = num;
            } else {
                sortedNumbers[right--] = num;
            }

        }
        System.out.println("Odd Front/ Even Rear: " + Arrays.toString(sortedNumbers));

    }
}




