package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Please enter a number");
        String fizzBuzzTest = inputScanner.nextLine();
        int result = Integer.valueOf(fizzBuzzTest);
        System.out.println(fizzBuzz(result));
        System.out.println(" ");
        System.out.println("Please enter how long you would like your sequence.");
        int febl = (Integer.valueOf(inputScanner.nextLine()));
        fibseq(febl);
    }

    public static String fizzBuzz(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (number % 5 == 0) {
            return "Buzz";

        } else {
            return String.valueOf(number);
        }
    }

    public static Integer[] fibseq(int x) {
        ArrayList<Integer> fibs = new ArrayList<>();

        fibs.add(1);
        fibs.add(1);

        while (fibs.size() < x) {
            fibs.add(fibs.get(fibs.size() - 1) + fibs.get(fibs.size() - 2));
        }

        return fibs.toArray(new Integer[0]);
    }

}
