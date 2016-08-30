/**
 * Created by Karl on 8/28/2016.
 */
public class Main {

    public static void main(String[] args){
        FF f = new FF();
        f.setup();
        // f.getDraftOrder(); This is currently hardcoded in FF.setup();
        f.draftPick();
        //f.getOwner("Jane").getTeam();
        f.getPos("RB");
        f.getPos("QB");


        /*
        Early testing
        //Owner Thad = new Owner("Thad");
        //f.addOwner(0, Thad);
        Player aRodg = new Player("QB","Aaron Rodgers");
        Player bBort = new Player("QB", "Blake Bortles");

        Player lev = new Player("RB", "Le'Veon Bell");
        Player davidJohn = new Player("RB", "David Johnson");
        Player jChar = new Player("RB", "Jamaal Charles");
        Player AD = new Player("RB", "Adrian Peterson");
        Player Gurley = new Player("RB", "Todd Gurley");

        Player AB = new Player("WR", "Antonio Brown");
        Player ODB = new Player("WR", "Odell Beckham Jr.");
        Player julio = new Player("WR", "Julio Jones");
        Player aRob = new Player("WR", "Allen Robinson");
        Player hop = new Player("WR", "DeAndre Hopkins");

        Player gronk = new Player("TE", "Rob Gronkowski");
        Player jReed = new Player("TE", "Jordan Reed");

        Thad.getRoster().add(aRodg);
        Thad.getRoster().add(bBort);

        Thad.getRoster().add(davidJohn);
        Thad.getRoster().add(lev);
        Thad.getRoster().add(AD);
        Thad.getRoster().add(jChar);
        Thad.getRoster().add(Gurley);

        Thad.getRoster().add(AB);
        Thad.getRoster().add(ODB);
        Thad.getRoster().add(julio);
        Thad.getRoster().add(aRob);
        //Thad.getRoster().add(hop);

        Thad.addTeamName("'s Wenches");
        //Thad.getTeam();
        //Thad.getRoster().getPos("QB");
        //Thad.getRoster().getPos("RB");
        //Thad.getRoster().getPos("WR");



        Thad.getRoster().getPos("TE");
        Thad.getRoster().add(gronk);
        Thad.getRoster().add(jReed);
        Thad.getTeam();
        */
    }
}
