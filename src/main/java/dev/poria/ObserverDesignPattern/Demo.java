package dev.poria.ObserverDesignPattern;

public class Demo {
    public static void main(String[] args) {

        Channel channel = new Channel();

        Subscriber poria = new Poria();
        Subscriber dorsa =  new Dorsa();

        channel.attach(poria);
        channel.attach(dorsa);

        channel.setNotification("Test1 for attach...");

        System.out.println("----------------------------");

        channel.detach(poria);
        channel.setNotification("Test2 for detach...");




    }
}
