public class FightingType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof IceType) {
            return 2.0;
        }
        return 1.0;
    }

    @Override
    public String getTypeName() {
        return "Fighting";
    }
}