package dev.poria.FactoryDesignPattern;

public class ScoreFactory {
    public Score getScore(String type) {
        Score score = null;

        switch (type.toLowerCase()) {
            case "math":
                score = new Math();
                break;

            case "history":
                score = new History();
                break;

            case "science":
                score = new Science();
                break;

            default:
                System.out.println("Invalid lesson type");
        }
        return score;
    }
}
