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
        members.add(new TeamMember("JP Appel"));
        members.add(new TeamMember("Zachery Bingaman"));
    }
}
