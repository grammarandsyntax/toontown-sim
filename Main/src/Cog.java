public class Cog {
    //instance variables
    private String name;
    private int level;
    private int hp;
    private String[] cogNames = {"Flunky","Bottom Feeder","Short Change","Cold Caller","Pencil Pusher","Bloodsucker","Penny Pincher","Telemarketer","Yesman","Double Talker","Tightwad","Name Dropper","Micromanager","Ambulance Chaser","Bean Counter","Glad Hander","Downsizer","Back Stabber","Number Cruncher","Mover & Shaker","Head Hunter","Spin Doctor","Money Bags","Two-Face","Corporate Raider","Legal Eagle","Loan Shark","Mingler","The Big Cheese","Big Wig","Robber Baron","Mr. Hollywood"};
    final private int minIndex;
    final private int maxIndex;

    static int clamp(int x, int min, int max){
      return Math.max(min, Math.min(max, x));
    }
    
    public Cog (){
      level = (int)(Math.random()*(11)+1)+1;
      hp = (level+1)*(level+2);
      //THANKS ASHER
      minIndex = clamp(((level*4)-20),0,31);
      maxIndex = clamp(((level*4)-1),0,31);
      name = cogNames[(int)(Math.random()*(maxIndex-minIndex+1))+minIndex];
    }

    //get + set
    public int getMinIndex(){
      return minIndex;
    }
    public int getMaxIndex(){
      return maxIndex;
    }
    public String getName(){
      return name;
    }
    public void setName(String name){
      this.name=name;
    }
    public int getLevel(){
      return level;
    }
    public void setLevel(int level){
      this.level=level;
    }
    public int getHp(){
      return hp;
    }
}
