public class SpecialAttackPoint{
    private int SpecialAttackpoint;
    public SpecialAttackPoint(int value) {
       this.SpecialAttackpoint = value;
    }
    public int gainSpecialAttackPoint(int value) {
        this.SpecialAttackpoint += value;
        return this.SpecialAttackpoint;
    }
    public int loseSpecialAttackPoint(int value) {
        this.SpecialAttackpoint -= value;
        return this.SpecialAttackpoint;
    }

    public int getValue() {
        return this.SpecialAttackpoint;
    }
}