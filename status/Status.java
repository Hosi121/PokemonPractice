public class Status {
    private Name name;
    private Level level;
    private HP hp;
    private AttackPoint attackPoint;
    private DefencePoint defensePoint;

    public Status(Name name, Level level, HP hp, AttackPoint attackPoint, DefencePoint defencePoint) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attackPoint = attackPoint;
        this.defensePoint = defencePoint;
    }

    private void loseHP(int value) {
        this.hp = this.hp.lose(value);
    }
}