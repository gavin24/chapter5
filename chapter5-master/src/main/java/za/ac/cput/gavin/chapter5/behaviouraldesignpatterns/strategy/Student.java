package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.strategy;


public class Student {

    int score;
    TestScore testScore;

    public Student(int score, TestScore testScore) {
        this.score = score;
        this.testScore = testScore;
    }

    public void setTestScore(TestScore testScore) {
        this.testScore = testScore;
    }

    public int getScore() {
        return score;
    }

    public boolean result() {
        return testScore.testScore(score);
    }
}
