public class Toon {
    private int laff;
    private int timesPlayedGame;

    //constructor
    public Toon(){
        timesPlayedGame=0;
    }
    public Toon(int la){
        laff = la;
    }

    public int getLaff(){
        return laff;
    }
    public void setLaff(int la){
        laff = la;
    }
    public void addOneGameplay(){
        timesPlayedGame++;
    }

}
