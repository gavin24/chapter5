package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.chainofresponsibility.*;

public class TestChainOfResponsibility {

    private Team team;
    private Team goalKeeper = null;
    private Team defender = null;
    private Team midfielder = null;
    private Team forward = null;


    @Before
    public void setUp() {
        goalKeeper = new GoalKeeper();
        defender = new Defender();
        midfielder = new Midfielder();
        forward = new Forward();

        goalKeeper.setTeam(defender);
        defender.setTeam(midfielder);
        midfielder.setTeam(forward);

        team = goalKeeper;
    }

    @Test
    public void testGoalKeeper() {
        Assert.assertEquals(true, team.team(FootballPositions.GOALKEEPER).equalsIgnoreCase("GoalKeeper "));
    }

    @Test
    public void testDefender() {
        Assert.assertEquals(true, team.team(FootballPositions.DEFENDER).equalsIgnoreCase("Not GoalKeeper Defender "));
    }

    @Test
    public void testMidfielder() {
        Assert.assertEquals(true, team.team(FootballPositions.MIDFIELDER).equalsIgnoreCase("Not GoalKeeper Not Defender Midfielder "));
    }

    @Test
    public void testForward() {
        Assert.assertEquals(true, team.team(FootballPositions.FORWARD).equalsIgnoreCase("Not GoalKeeper Not Defender Not Midfielder Forward "));
    }
}
