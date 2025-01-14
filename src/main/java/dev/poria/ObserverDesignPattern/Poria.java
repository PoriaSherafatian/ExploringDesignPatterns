package dev.poria.ObserverDesignPattern;

public class Poria implements Subscriber {
    @Override
    public void update(String notification) {
        System.out.println("Poria : " + notification );
    }
}
