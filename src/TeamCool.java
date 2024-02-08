package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;
import Project00.TeamMember;


public class TeamCool extends Team
{
    public TeamCool(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("Yousuf Kanan"));
        members.add(new TeamMember("Jack Drabic"));
        members.add(new TeamMember("Louis Spann"));
        members.add(new TeamMember("Michael Romero"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
