public class PsychicType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof PoisonType) {
            return 2.0;
        }
        return 1.0;
    }
}