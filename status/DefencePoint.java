public class DefencePoint{
    private int Defencepoint;
    public DefencePoint(int value) {
       this.Defencepoint = value;
    }
    public int gainDefencePoint(int value) {
        this.Defencepoint += value;
        return this.Defencepoint;
    }
    public int loseDefencePoint(int value) {
        this.Defencepoint -= value;
        return this.Defencepoint;
    }
}