package Project00;

public class Team6 extends Team
{
    public Team6(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("Trevor Gray"));
        members.add(new TeamMember("Janice Jones"));
        members.add(new TeamMember("Harold Hero"));
        members.add(new TeamMember("Ali Mohammed"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
