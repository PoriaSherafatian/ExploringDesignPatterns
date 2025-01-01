package dev.poria.Singleton.DoubleCheckLocking;

public class CheckSingleObject {
    private static CheckSingleObject instance = new CheckSingleObject();
    private CheckSingleObject() {    }

    public static CheckSingleObject getInstance() {
        if (instance == null) {
            synchronized (CheckSingleObject.class) {
                if (instance == null) {
                    instance = new CheckSingleObject();
                }
            }
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello World by DoubleCheck Single Object");
    }
}
