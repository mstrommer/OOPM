package _06_Generics;

public class Box<T> {
    private final T element;
    public Box(T element){
        this.element = element;
    }
    public T getElement(){
        return this.element;
    }
}
