import java.util.ArrayList;

public class Guests {

    private String name;
    private ArrayList<Guests> guest;

    public Guests(String name){
        this.name = name;
        this.guest = new ArrayList<Guests>();
    }

    public String getName(){
        return this.name;
    }

}
