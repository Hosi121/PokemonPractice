public class WaterType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof FireType) {
            return 2.0;
        }
        if (opponentType instanceof ElectricType) {
            return 0.5;
        }
        return 1.0;
    }

    @Override
    public String getTypeName() {
        return "Water";
    }
}