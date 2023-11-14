interface Damage {
    double damage = 0.0;
    double calculateDamage(Pokemon attacker, Pokemon defender, Move move);
    double getValue();
}