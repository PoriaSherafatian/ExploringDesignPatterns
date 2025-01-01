package dev.poria.AbstractFactoryDesignPattern;

public class ClassFactoryProducer {
    public AbstractClassFactory getClassFactory(boolean specialized) {
        if (specialized) {
            return new SpecializedClassFactory();
        }
        else return new ClassFactory();
    }
}
