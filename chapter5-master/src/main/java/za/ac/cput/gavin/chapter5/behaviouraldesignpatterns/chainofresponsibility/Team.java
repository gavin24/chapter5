package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.chainofresponsibility;


public abstract class Team {

    Team team;

    public void setTeam(Team team) {
        this.team = team;
    }

    public abstract String team(FootballPositions position);
}
