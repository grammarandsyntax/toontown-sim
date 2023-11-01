public class Cog {
    //instance variables
    private String name;
    private int level;
    private int hp;
    

    public Cog (String n, int l){
        name = n;
        level = l;
        hp = (level+1)*(level+2);
    }
    public Cog (int l){
      level = l;
      hp = (level+1)*(level+2);
    }

    //get
    public String getName(){
      return name;
    }
    public int getLevel(){
        return level;
    }
    public int getHp(){
        return hp;
    }
}
