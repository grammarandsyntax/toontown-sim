public class Toon {
    private int laff;
    private boolean alreadyPlayed = false;

    //constructor
    public Toon(int la){
        laff = la;
    }

    public int getLaff(){
        return laff;
    }
    public void playerPlayedOnce(){
        alreadyPlayed=true;
    }

}
