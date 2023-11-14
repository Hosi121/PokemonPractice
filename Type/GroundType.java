public class GroundType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof ElectricType) {
            return 2.0;
        }
        return 1.0;
    }

    @Override
    public String getTypeName() {
        return "Ground";
    }
}