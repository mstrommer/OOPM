package _06_Generics;

public class Ant extends Animal {
    private static int counter = 0;
    private final int antNumber;
    public Ant(){
        antNumber = counter;
        counter++;
    }
    @Override
    public String toString(){
        return super.toString() + " Ant " + antNumber;
    }
}
