public class Team4 extends Team{
    public Team4(String name)
    {
        super(name);
        createTeamMembers();
    }  



    public void createTeamMembers()
    {
        members.add(new TeamMember("Saul Sanchez"));
        members.add(new TeamMember("Nathan Hajel"));
        members.add(new TeamMember("Austin Leibensperger"));
        
    }
    
}
