package Project00;

import Project00.Team;
import Project00.TeamMember;

import java.util.*;


public class TeamOne extends Team
{
    public TeamOne(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("Megan Curtis"));
        members.add(new TeamMember("Janice Jones"));
        members.add(new TeamMember("Harold Hero"));
        members.add(new TeamMember("Ali Mohammed"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
