package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Wendy S.";
    }

    public static String getGithubId() {
        return "Wendy192837";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-11");
        team.addMember("Wendy S.");
        team.addMember("Jonah S.");
        team.addMember("Luis M.");
        team.addMember("Shuang L.");
        team.addMember("Tristan R.");
        team.addMember("Saul D.");
        return team;
    }
}
