package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void testSameObject() {
        assertEquals(team, team);
    }

    @Test
    public void testDiffClass() {
        String s = "";
        assertEquals(false, team.equals(s));
    }

    @Test
    public void testEquals_name_members_equal() {
        Team t1 = new Team("test-team");
        t1.addMember("Wendy S.");
        t1.addMember("Chris G.");
        Team t2 = new Team("test-team");
        t2.addMember("Wendy S.");
        t2.addMember("Chris G.");
        assertEquals(t1, t2);
    }

    @Test
    public void testEquals_members_not_equal() {
        Team t1 = new Team("test-team");
        t1.addMember("Wendy S.");
        t1.addMember("Chris G.");
        Team t2 = new Team("test-team");
        t2.addMember("Wendy S.");
        assertEquals(false, t1.equals(t2));
    }

    @Test 
    public void testEquals_names_not_equal() {
        Team t1 = new Team("team1");
        t1.addMember("Wendy S.");
        t1.addMember("Chris G.");
        Team t2 = new Team("team2");
        t2.addMember("Wendy S.");
        t2.addMember("Chris G.");
        assertEquals(false, t1.equals(t2));
    }

    @Test
    public void testHashCode_name_members_equal() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void testHashCode_name_not_equal() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        Team t2 = new Team();
        t2.setName("barfoo");
        t2.addMember("bar");

        assertEquals(false, t1.hashCode()==t2.hashCode());
    }

    @Test
    public void testHashCode_members_not_equal() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("barfoo");

        assertEquals(false, t1.hashCode()==t2.hashCode());
    }

    @Test
    public void testHashCode_equiv() {
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }
}
