import java.util.Random;

class DamageCalculator implements Damage {
    @Override
    public double calculateDamage(Pokemon attacker, Pokemon defender, Move move) {
        double modifier = modifier();
        Status attackerStatus = attacker.getStatus();
        Status defenderStatus = defender.getStatus();
        double attack = attackerStatus.getAttackPoint().getValue();
        double defence = defenderStatus.getDefencePoint().getValue();
        double level = attackerStatus.getLevel().getValue();
        double critical = Math.random() < 0.0625 ? 1.5 : 1.0;
        double random = Math.random() * (1.0 - 0.85) + 0.85;
        double damage = (((2 * level + 10) / 250) * (attack / defence) + 2);
        
        return damage;
    }

    private double modifier() {
        Random random = new Random();
        double modifier = random.nextDouble() * 0.15 + 0.85;
        return modifier;
    }

    public double getValue() {
        return this.damage;
    }
}