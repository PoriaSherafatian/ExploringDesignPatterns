package dev.poria.AbstractFactoryDesignPattern;

public class ClassFactory extends AbstractClassFactory {
    @Override
    public Class getTime(String time) {

        Class clas = null;
        switch (time.toLowerCase()) {
            case "history":
                clas = new HistoryClass();
                break;
            case "math":
                clas = new MathClass();
                break;
            default:
                System.out.println("Invalid class format");
        }
        return clas;
    }
}
