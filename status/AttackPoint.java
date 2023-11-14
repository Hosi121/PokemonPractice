public class AttackPoint{
    private int Attackpoint;
    public AttackPoint(int value) {
       this.Attackpoint = value;
    }
    public int gainAttackPoint(int value) {
        this.Attackpoint += value;
        return this.Attackpoint;
    }
    public int loseAttackPoint(int value) {
        this.Attackpoint -= value;
        return this.Attackpoint;
    }

    public int getValue() {
        return this.Attackpoint;
    }
}