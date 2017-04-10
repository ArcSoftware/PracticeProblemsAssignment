package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
	    System.out.println("Please enter a number");
        String fizzBuzzTest = inputScanner.nextLine();
        int result = Integer.valueOf(fizzBuzzTest);
	    fizzBuzz(result);
	    System.out.println(" ");
	    System.out.println("Please enter how long you would like your sequence.");
	    int febl = (Integer.valueOf(inputScanner.nextLine()));
	    fibseq(febl);
    }

    public static void fizzBuzz(int number) {
        if (number % 3 == 0) {
            System.out.print("Fizz");
        }
        if (number % 5 == 0) {
            System.out.print("Buzz");
        } else if (number % 3 != 0 && number % 5 != 0){
            System.out.println(number);
        }
    }

    public static void fibseq(int x) {
        ArrayList<Integer> fibs = new ArrayList<>();

        fibs.add(1);
        fibs.add(1);

        for (int i = 0; i < x; i++) {
            fibs.add(fibs.get(fibs.size()-1) + fibs.get(fibs.size()-2));
        }

        System.out.println(fibs);
    }


}
