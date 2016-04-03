package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.strategy;


public class DistinctionPass implements TestScore {

    @Override
    public boolean testScore(int score) {

        if(score >= 75) {
            return true;
        } else {
            return false;
        }
    }
}
