package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.chainofresponsibility;


public class Defender extends Team {

    @Override
    public String team(FootballPositions position) {
        String str = null;

        if(position == FootballPositions.DEFENDER) {
            return "Defender ";
        } else {
            if(team != null) {
                str = team.team(position);
            }
            return "Not Defender " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
