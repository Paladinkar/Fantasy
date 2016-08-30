/**
 * Created by Karl on 8/28/2016.
 */
public class Roster {

    private Owner o;

    private Player[] roster = new Player[14];

    /*
    [0] = QB
    [1] = Rb1
    [2] = Rb2
    [3] = Wr1
    [4] = Wr2
    [5] = Flex
    [6] = TE
    [7] = D/St
    [8] = K
    [9] = BE
    [10] = BE
    [11] = BE
    [12] = BE
    [13] = BE
     */

    public int openBench = 9;

    public void add(Player p){
        if(p.getPos().equals("QB")){
            if(roster[0] == null) {
                roster[0] = p;
            }
            else{
                if(openBench == 14){
                    System.out.println("Roster is too full at QB");
                    return;
                }
                roster[openBench] = p;
                openBench++;
            }
        }
        else if(p.getPos().equals("RB")){
            if(roster[1] == null) {
                roster[1] = p;
            }
            else if(roster[2] == null) {
                roster[2] = p;
            }
            else if(roster[5] == null) {
                roster[5] = p;
            }
            else{
                if(openBench == 14){
                    System.out.println("Roster is too full at RB");
                    return;
                }
                roster[openBench] = p;
                openBench++;
            }
        }
        else if(p.getPos().equals("WR")){
            if(roster[3] == null) {
                roster[3] = p;
            }
            else if(roster[4] == null) {
                roster[4] = p;
            }
            else if(roster[5] == null) {
                roster[5] = p;
            }
            else{
                if(openBench == 14){
                    System.out.println("Roster is too full at WR");
                    return;
                }
                roster[openBench] = p;
                openBench++;
            }
        }
        else if(p.getPos().equals("TE")){
            if(roster[6] == null) {
                roster[6] = p;
            }
            else if(roster[5] == null) {
                roster[5] = p;
            }
            else{
                if(openBench == 14){
                    System.out.println("Roster is too full at TE");
                    return;
                }
                roster[openBench] = p;
                openBench++;
            }
        }
        else if(p.getPos().equals("DST")){
            if(roster[7] == null) {
                roster[7] = p;
            }
            else{
                if(openBench == 14){
                    System.out.println("Roster is too full at DST");
                    return;
                }
                roster[openBench] = p;
                openBench++;
            }
        }
        else if(p.getPos().equals("K")){
            if(roster[8] == null) {
                roster[8] = p;
            }
            else{
                if(openBench == 14 ){
                    System.out.println("Roster is too full at K");
                    return;
                }
                roster[openBench] = p;
                openBench++;
            }
        }
    }

    public void getRoster(){
        System.out.println("QB: " + checkNull(0));
        System.out.println("RB 1: " + checkNull(1));
        System.out.println("RB 2: " + checkNull(2));
        System.out.println("WR 1: " + checkNull(3));
        System.out.println("WR 2: " + checkNull(4));
        System.out.println("Flex: " + checkNull(5));
        System.out.println("TE: " + checkNull(6));
        System.out.println("DST: " + checkNull(7));
        System.out.println("K: " + checkNull(8));
        for(int i = 9; i < openBench; i++){
            System.out.println("BE " + (i-8) + ": " + roster[i] + ", " + roster[i].getPos());
        }
        for(int i = openBench; i < 14; i++){
            System.out.println("BE " + (i-8) + ":");
        }
    }

    public void getPos(String pos){
        switch(pos){
            case "QB":
                System.out.print("QBs: " + checkNull(0));
                getBench("QB");
                break;
            case "RB":
                System.out.print("RBs: " + checkNull(1));
                if(roster[2] != null) {
                    System.out.print(", " + roster[2]);
                    if(roster[5].getPos().equals("RB"))
                        System.out.print(", " + roster[5]);
                    getBench("RB");
                }
                break;
            case "WR":
                System.out.print("WRs: " + checkNull(3));
                if(roster[4] != null) {
                    System.out.print(", " + roster[4]);
                    if(roster[5].getPos().equals("WR"))
                        System.out.print(", " + roster[5]);
                    getBench("WR");
                }
                break;
             case "TE":
                System.out.print("TEs: " + checkNull(6));
                if(roster[5].getPos().equals("TE"))
                    System.out.print(", " + roster[5]);
                getBench("TE");
                break;
            case "DST":
                System.out.print("DSTs: " + checkNull(7));
                getBench("DST");
                break;
            case "K":
                System.out.print("Ks: " + checkNull(8));
                getBench("K");
                break;
        }
    }

    //helper method to getPos()
    private void getBench(String pos){
        for(int i = 9; i < openBench; i++){
            if(roster[i].getPos().equals(pos))
                System.out.print(", " + roster[i]);
        }
    }

    //helper method to getRoster()
    private String checkNull(int curretnPos){
        if(roster[curretnPos]!= null){
            return roster[curretnPos].toString();
        }
        return "";
    }


}
