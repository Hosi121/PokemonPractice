public class NormalType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof FightingType) {
            return 0.5;
        }
        return 1.0;
    }
}