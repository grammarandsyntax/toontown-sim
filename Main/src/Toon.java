public class Toon {
    private int laff;
    private int timesPlayedGame;
    private boolean alreadyOpened=false;

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
    public int getTimesPlayedGame(){
        return timesPlayedGame;
    }
    public void addOneGameplay(){
        timesPlayedGame++;
    }
    public void setAsOpened(){
        alreadyOpened=true;
    }
    public boolean getAlreadyOpened(){
        return alreadyOpened;
    }

}
