package lesson2;

public class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

    private Singleton() {
    }

    public void print(){
        System.out.println("singleton hello");
    }
}
