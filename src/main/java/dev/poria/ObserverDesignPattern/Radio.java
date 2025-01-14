package dev.poria.ObserverDesignPattern;

public class Radio implements Channel {
    @Override
    public void update(String news) {
        System.out.println("Radio shows : " + news);
    }
}
