package dev.poria.Singleton.ThradSafe;

public class ThreadDemo {
    public static void main(String[] args) {

        ThreadSingleObject singleObject = ThreadSingleObject.getInstance();
        singleObject.showMessage();

    }
}
