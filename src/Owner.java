/**
 * Created by Karl on 8/28/2016.
 */
public class Owner {

    private String playerName;
    private String teamName;
    private Roster roster;

    public Owner(String name){
        this.playerName = name;
        this.roster = new Roster();
        teamName = playerName + "'s Team";
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public String getTeamName(){
        return this.teamName;
    }
    public Roster getRoster(){
        return roster;
    }

    public void addTeamName(String s){
        teamName = s;
    }


    public void getTeam(){
        System.out.println(playerName + "\t" + teamName + "\n");
        roster.getRoster();
    }

    @Override
    public String toString(){
        return playerName;
    }
}
