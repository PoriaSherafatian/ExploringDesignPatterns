package dev.poria.ObserverDesignPattern;

public class Tv implements Channel {
    @Override
    public void update(String news) {
        System.out.println("Tv shows : " + news);
    }
}
