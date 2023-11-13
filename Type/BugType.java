public class BugType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof GrassType) {
            return 2.0;
        }
        return 1.0;
    }
}