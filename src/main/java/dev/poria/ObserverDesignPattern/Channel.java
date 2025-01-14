package dev.poria.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private String notification;
    public List<Subscriber> subscribers = new ArrayList<>();

    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void detach(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void setNotification(String notification) {
        this.notification = notification;
        notifySubscriber();
    }

    public void notifySubscriber() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this.notification);
        }
    }
}
