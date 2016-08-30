/**
 * Created by Karl on 8/29/2016.
 */
public class Player {

    private String name;
    private String pos;

    public Player(String pos, String name){
        this.name = name;
        this.pos = pos;
    }

    public String getPos(){
       return pos;
    }

    @Override
    public String toString(){
        return name;
    }
}
