package dev.poria.FactoryDesignPattern;

public class Demo {
    public static void main(String[] args) {

        ScoreFactory scoreFactory = new ScoreFactory();

        Score score1 = scoreFactory.getScore("history");
        score1.teacher();

        Score score2 = scoreFactory.getScore("math");
        score2.teacher();

        Score score3 = scoreFactory.getScore("science");
        score3.teacher();

    }
}
