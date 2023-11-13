public class FlyingType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof FightingType) {
            return 2.0;
        }
        return 1.0;
    }
}