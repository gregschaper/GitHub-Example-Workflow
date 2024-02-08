package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;
import Project00.TeamMember;


public class Team7 extends Team
{
    public Team7(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("Jalil Rodriguez"));
	members.add(new TeamMember("Jeffery Eisenhardt"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
