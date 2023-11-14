public class DarkType implements Type {
    @Override
    public double calculateEffectiveness(Type opponentType) {
        if (opponentType instanceof PsychicType) {
            return 0.5;
        }
        return 1.0;
    }

    @Override
    public String getTypeName() {
        return "Dark";
    }
}