public class DragonType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof DragonType) {
            return 2.0;
        }
        return 1.0;
    }
}