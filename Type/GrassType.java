public class GrassType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof FireType) {
            return 0.5;
        }
        return 1.0;
    }
}