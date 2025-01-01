package dev.poria.Singleton.Lazy;

public class LazySingleObject {

    private static LazySingleObject instance;

    private LazySingleObject() {
    }

    public static LazySingleObject getInstance() {
        if (instance == null) {
            instance = new LazySingleObject();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World by Lazy Single Object");

    }
}
