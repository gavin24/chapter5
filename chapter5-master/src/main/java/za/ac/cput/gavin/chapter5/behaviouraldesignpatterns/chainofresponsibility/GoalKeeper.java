package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.chainofresponsibility;


public class GoalKeeper extends Team {

    @Override
    public String team(FootballPositions position) {
        String str = null;

        if(position == FootballPositions.GOALKEEPER) {
            return "Goalkeeper ";
        } else {
            if(team != null) {
                str = team.team(position);
            }
            return "Not GoalKeeper " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
