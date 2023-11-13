public class ElectricType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof WaterType) {
            return 2.0;
        }
        return 1.0;
    }
}