package dev.poria.Singleton.ThradSafe;

public class ThreadSingleObject  {

    private static ThreadSingleObject instance = new ThreadSingleObject();
    private ThreadSingleObject() {    }

    public static synchronized ThreadSingleObject getInstance() {
        if (instance == null) {
            instance = new ThreadSingleObject();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello World by ThreadSafe Single Object");
    }
}
