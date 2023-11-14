public class Status {
    private ID ID;
    private Name name;
    private Level level;
    private HP hp;
    private AttackPoint attackPoint;
    private DefencePoint defencePoint;
    private SpecialAttackPoint specialAttackPoint;
    private SpecialDefencePoint specialDefencePoint;
    private Speed speed;
    private Type type;

    public ID getID() {
        return ID;
    }

    public Name getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    public HP getHp() {
        return hp;
    }

    public AttackPoint getAttackPoint() {
        return attackPoint;
    }

    public DefencePoint getDefencePoint() {
        return defencePoint;
    }

    public SpecialAttackPoint getSpecialAttackPoint() {
        return specialAttackPoint;
    }

    public SpecialDefencePoint getSpecialDefencePoint() {
        return specialDefencePoint;
    }

    public Speed getSpeed() {
        return speed;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Status{" +
                "name=" + name +
                ", level=" + level +
                ", hp=" + hp +
                ", attackPoint=" + attackPoint +
                ", defencePoint=" + defencePoint +
                '}';
    }

    public Status(Name name, Level level, HP hp, AttackPoint attackPoint, DefencePoint defencePoint, Type type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attackPoint = attackPoint;
        this.defencePoint = defencePoint;
        this.type = type;
    }

    public void loseHP(int value) {
        this.hp = this.hp.lose(value);
    }
}