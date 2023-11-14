public class PoisonType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof GrassType) {
            return 2.0;
        }
        return 1.0;
    }

    @Override
    public String getTypeName() {
        return "Poison";
    }
}