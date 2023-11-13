public class SteelType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof IceType) {
            return 2.0;
        }
        return 1.0;
    }
}