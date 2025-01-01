package dev.poria.Singleton.Simple;

public class SimpleDemo {
    public static void main(String[] args) {

        SimpleSingleObject singleObject = SimpleSingleObject.getInstance();

        singleObject.showMessage();

    }
}

