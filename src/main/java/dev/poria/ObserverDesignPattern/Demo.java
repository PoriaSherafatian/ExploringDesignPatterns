package dev.poria.ObserverDesignPattern;

public class Demo {
    public static void main(String[] args) {

        NewsNetwork newsNetwork = new NewsNetwork();

        Channel tv = new Tv();
        Channel radio = new Radio();

        newsNetwork.attach(tv);
        newsNetwork.attach(radio);

        newsNetwork.setNews("Test 1 for attach...");

        System.out.println("-----------");

        newsNetwork.detach(radio);
        newsNetwork.setNews("Test 2 for detach...");
    }
}
