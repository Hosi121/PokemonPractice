public interface Pokemon {
    void attack(Pokemon opponent);
    void defend();
    void useSpecialMove();
    Status getStatus();
}