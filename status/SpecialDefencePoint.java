public class SpecialDefencePoint{
    private int SpecialDefencepoint;
    public SpecialDefencePoint(int value) {
       this.SpecialDefencepoint = value;
    }
    public int gainSpecialDefencePoint(int value) {
        this.SpecialDefencepoint += value;
        return this.SpecialDefencepoint;
    }
    public int loseSpecialDefencePoint(int value) {
        this.SpecialDefencepoint -= value;
        return this.SpecialDefencepoint;
    }

    public int getValue() {
        return this.SpecialDefencepoint;
    }
}