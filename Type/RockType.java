public class RockType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof FireType) {
            return 2.0;
        }
        return 1.0;
    }
}