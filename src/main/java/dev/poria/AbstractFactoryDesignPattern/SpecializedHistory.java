package dev.poria.AbstractFactoryDesignPattern;

public class SpecializedHistory implements Class {
    @Override
    public void time() {
        System.out.println("SpecializedHistory time : 15:30 Monday");
    }
}
