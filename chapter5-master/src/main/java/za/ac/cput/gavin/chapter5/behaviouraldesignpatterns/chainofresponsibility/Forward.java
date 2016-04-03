package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.chainofresponsibility;


public class Forward extends Team {

    @Override
    public String team(FootballPositions position) {
        String str = null;

        if(position == FootballPositions.FORWARD) {
            return "Forward ";
        } else {
            if(team != null) {
                str = team.team(position);
            }
            return "Not Forward " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
