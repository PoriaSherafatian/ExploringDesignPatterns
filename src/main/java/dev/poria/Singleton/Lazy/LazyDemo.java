package dev.poria.Singleton.Lazy;

public class LazyDemo {
    public static void main(String[] args) {

        LazySingleObject singleObject = LazySingleObject.getInstance();
        singleObject.showMessage();

    }
}
