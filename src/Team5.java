package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;
import Project00.TeamMember;

public class Team5 extends Team
{
    public Team5(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("Rafael Garcia Jr."));
        members.add(new TeamMember("Dermot Badman"));
        members.add(new TeamMember("Francisco Figueroa"));
        members.add(new TeamMember("Nathan Bonvallet"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
