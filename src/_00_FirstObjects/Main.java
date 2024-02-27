package _00_FirstObjects;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.fn = "Michael";
        p.ln = "Schuhmacher"; // Strings
        p.sex = 'm'; // chars
        p.birthday = "24.12.1970";
        System.out.println(p.fn + " " + p.ln);
    }
}
