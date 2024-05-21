package _07_Exceptions;

import java.util.Scanner;

public class SimpleExceptions {
    public static void main(String[] args) {
        //System.out.println("Ergebnis Division: " + divide());
        try {
            createAndAccessArray();
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Programm läuft weiter...");
    }
    // 1. Divide by Zero Exception Handling:
    // Write a Java program that takes two
    // numbers as input from the user and divides
    // the first number by the second number.
    // Implement exception handling to catch
    // any ArithmeticException that may occur
    // if the user tries to divide by zero.

    public static int divide(){
        Scanner scan = new Scanner(System.in);
        System.out.print("x: ");
        int x = scan.nextInt();
        do {
            System.out.print("y: ");
            int y = scan.nextInt();
            try {
                return x / y;
            }catch(ArithmeticException ae){
                ae.printStackTrace();
            }
        }while(true);
    }

    // 2. Array Index Out of Bounds Exception Handling:
    // Write a Java program that creates an array of
    // integers. Prompt the user to enter an index to
    // retrieve the value from the array. Implement
    // exception handling to catch ArrayIndexOutOfBoundsException
    // if the user enters an index that is out of the array's bounds.
    public static void createAndAccessArray() throws Exception, MyException{
        Scanner scan = new Scanner(System.in);
        int[] numbers = {4,5,1,6,9,10};
        int index = scan.nextInt();
        // ArrayIndexOutOfBounds possible
        try {
            System.out.println(numbers[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            throw new Exception(e);
        }
    }
}
