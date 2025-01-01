package dev.poria.AbstractFactoryDesignPattern;

public class AbstractFactoryDemo {
    public static void main(String[] args) {


        ClassFactoryProducer cfp = new ClassFactoryProducer();

        AbstractClassFactory acf = cfp.getClassFactory(false);
        Class c1 = acf.getTime("math");
        c1.time();

        Class c2 = acf.getTime("history");
        c2.time();

        AbstractClassFactory specializedACF = cfp.getClassFactory(true);
        Class c3 = specializedACF.getTime("math");
        c3.time();

        Class c4 = specializedACF.getTime("history");
        c4.time();


    }
}
