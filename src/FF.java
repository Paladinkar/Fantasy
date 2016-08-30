import java.util.Scanner;

/**
 * Created by Karl on 8/28/2016.
 */
public class FF {

    private Owner[] draftOrder = new Owner[14];

    private int current = 1;

    public void addOwner(int pos, Owner o){
        draftOrder[pos] = o;
    }

    public void setup(){
        /*int owners = 0;
        System.out.println("Add next owner. Enter position, hit enter, then enter name");
        while(owners < 14){
            Scanner s = new Scanner(System.in);
            int pos = s.nextInt();
            String name = s.next();
            addOwner(pos - 1, new Owner(name));
            System.out.println("Owner added");
            owners++;
        }
        System.out.println("All owners sucessfully added");
        */
        addOwner(new Owner("Jane"), 1);
        addOwner(new Owner("Mike"), 2);
        addOwner(new Owner("Chris"), 3);
        addOwner(new Owner("Jacob"), 4);
        addOwner(new Owner("Paul"), 5);
        addOwner(new Owner("Connor"), 6);
        addOwner(new Owner("Phil"), 7);
        addOwner(new Owner("Amy"), 8);
        addOwner(new Owner("Ian"), 9);
        addOwner(new Owner("Fred"), 10);
        addOwner(new Owner("Jason"), 11);
        addOwner(new Owner("Thad"), 12);
        addOwner(new Owner("Karl"), 13);
        addOwner(new Owner("Aidan"), 14);
    }

    public void getDraftOrder(){
        for(int i = 0; i < draftOrder.length; i++){
            System.out.println(i+1 + ": " + draftOrder[i].getPlayerName());
        }
    }

    public void addOwner(Owner o, int pos){
        draftOrder[pos-1] = o;
    }

    public void draftPick(){
        String currentOwner = draftOrder[current-1].getPlayerName();
        System.out.println("Who did " + currentOwner + " select?");
        System.out.println("Enter position (QB, RB, WR, TE, DST, K), and enter and then the player's anem and enter again");
        Scanner s = new Scanner(System.in);
        String pos = s.nextLine().trim();
        String name = s.nextLine();
        Player p = new Player(pos.toUpperCase(), name);
        draftOrder[current-1].getRoster().add(p);
        System.out.println(currentOwner + " selected " + pos.toUpperCase() + ", " + name);
        if(current == 14)
            current = 1;
        else
            current++;
}
    public Owner getOwner(String name){
        for(int i = 0; i < draftOrder.length; i++){
            if(draftOrder[i].getPlayerName().equals(name))
                return draftOrder[i];
        }
        System.out.println("Owner not found as entered, please try again");
        return null;
    }

    //this method returns every owner's roster at the given position
    public void getPos(String pos){
        for(int i =0; i < draftOrder.length; i++){
            Owner current = draftOrder[i];
            System.out.print(current + "'s ");
            current.getRoster().getPos(pos.toUpperCase());
            System.out.println();
        }
    }

    /*ideas:
    ownersMissing(String pos), will list owners missing a certain position in pick order

    ownersAroundMe(), this will require the user to identify which pick they are,
        and then will do ***SOMETHING with the pickers directly ahead or behind the user

        how to quickly start drafts:
            -pick number of teams
            -identify user's spot
            -fill in the rest with pick numbers
            -allow quickly change the team name by selecting a text box and replaing
                default text
            -pick roster size
            -pick starter layout (qb, 2 rb, 2wr, te, (super)flex, dst, k)
            -pick number of bench spots this should have real time feed back based
                on roster size

     */




}
