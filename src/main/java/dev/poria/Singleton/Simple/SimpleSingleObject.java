package dev.poria.Singleton.Simple;

    public class SimpleSingleObject {

    private static SimpleSingleObject instance = new SimpleSingleObject();
    private SimpleSingleObject() {    }

    public static SimpleSingleObject getInstance() {
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello World by Simple Single Object");
    }
}