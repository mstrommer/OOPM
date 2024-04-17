package _06_Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Example
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Box<Integer> b = new Box<>(7);

        Integer[] intArray = {3, 7, 2, 9, 5, 3};
        System.out.println(elementCount(intArray, 8));

        System.out.println("Maximum Integer: " + findMax(intArray));

        // Example with String array
        String[] stringArray = {"apple", "banana", "orange", "grape", "melon"};
        System.out.println("Maximum String: " + findMax(stringArray));

        // Example with Double array
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Maximum Double: " + findMax(doubleArray));

        List<Ant> firstants = new ArrayList<>();
        firstants.add(new Ant());
        List<Ant> secondants = new ArrayList<>();
        secondants.add(new Ant());
        List<Ant> mergedants = merge(firstants,secondants);
        for (Ant a : mergedants) {
            System.out.println(a);
        }

        /*
        String s1 = "Birke";
        String s2 = "Tanne";
        StringBuilder sb = new StringBuilder("Ahorn");
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        // list.add(sb); Fehler
        for(String s : list){
            System.out.println(s);
        }
        */
    }

    // AUFGABE 1
    // Schreibe eine generische Methode "merge" die zwei Listen von Ant Objekten
    // entgegennimmt und eine Liste zurückgibt die alle Elemente enthält.
    public static <T> List<T> merge(List<T> firstelements, List<T> secondelements){
        List<T> merged = new ArrayList<>();
        merged.addAll(firstelements);
        merged.addAll(secondelements);
        return merged;
    }

    // AUFGABE 2
    // Schreibe eine generische Methode, um das Vorkommen eines Elements
    // (String, Integer,...) in einem Array zu zählen
    public static <T> int elementCount(T [] elements, T element){
        int count = 0;
        for (T tmp : elements) {
            if(tmp.equals(element)){
                count++;
            }
        }
        return count;
    }

}
