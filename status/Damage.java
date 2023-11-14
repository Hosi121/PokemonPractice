interface Damage {
    double calculateDamage(Pokemon attacker, Pokemon defender, Move move);
}

class DamageCalculator implements Damage {
    @Override
    public double calculateDamage(Pokemon attacker, Pokemon defender, Move move) {
        double damage = 0.0;
        double modifier = modifier();
        double attack = attacker.getAttack();
        double defense = defender.getDefense();
        double level = attacker.getLevel();
        double basePower = move.getBasePower();
        double STAB = attacker.getType().contains(move.getType()) ? 1.5 : 1.0;
        double type = move.getType().getEffectiveness(defender.getType1(), defender.getType2());
        double critical = Math.random() < 0.0625 ? 1.5 : 1.0;
        double random = Math.random() * (1.0 - 0.85) + 0.85;
        double modifier2 = modifier * STAB * type * critical * random;
        damage = (((2 * level + 10) / 250) * (attack / defense) * basePower + 2) * modifier2;
        return damage;
    }

    private double modifier() {
        Random random = new Random();
        double modifier = random.nextDouble() * 0.15 + 0.85;
        return modifier;
    }
}