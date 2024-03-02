package Singleton;

public class Sintleton {
    private static Sintleton instage;

    private Sintleton() {
    }

    public static Sintleton getInstance() {
        if (instage == null) {
            instage = new Sintleton();
        }
        return instage;
    }

    public void print() {
        System.out.println(this);
    }
}