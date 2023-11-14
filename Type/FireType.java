public class FireType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof GrassType || opponentType instanceof BugType) {
            return 2.0;
        }
        if (opponentType instanceof WaterType) {
            return 0.5;
        }
        return 1.0;
    }

    @Override
    public String getTypeName() {
        return "Fire";
    }
}