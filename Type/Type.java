public interface Type {
    double calculateEffectiveness(Type opponentType);
}

public class FairyType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof FightingType) {
            return 0.5;
        }
        return 1.0;
    }
}