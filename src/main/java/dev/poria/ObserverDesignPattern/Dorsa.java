package dev.poria.ObserverDesignPattern;

public class Dorsa implements Subscriber {
    @Override
    public void update(String notification) {
        System.out.println("Dorsa : " + notification );
    }
}
