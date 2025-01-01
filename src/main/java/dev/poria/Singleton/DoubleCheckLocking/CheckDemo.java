package dev.poria.Singleton.DoubleCheckLocking;


public class CheckDemo {
    public static void main(String[] args) {

        CheckSingleObject singleObject = CheckSingleObject.getInstance();
        singleObject.showMessage();

    }
}
