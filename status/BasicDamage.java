package Status;

public class BasicDamage implements Damage {
    private double damage;

    public BasicDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public double calculateDamage(Pokemon attacker, Pokemon defender, Move move) {
        return damage;
    }

    @Override
    public double getValue() {
        return this.damage;
    }
}
