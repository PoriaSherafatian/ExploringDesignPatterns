package dev.poria.AbstractFactoryDesignPattern;

public class SpecializedClassFactory extends AbstractClassFactory {

    @Override
    public Class getTime(String time) {

        Class clas = null;
        switch (time.toLowerCase()) {
            case "math":
                clas = new SpecializedMath();
                break;
            case "history":
                clas = new SpecializedHistory();
                break;
            default:
                System.out.println("Invalid class format");
        }
        return clas;
    }
}
