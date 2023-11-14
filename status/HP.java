public class HP {
    private int hp;

    public int getValue() {
        return this.hp;
    }

    public HP(final int value) {
        if (value < 0) {
            throw new IllegalArgumentException("HP must be positive.");
        }
        this.hp = value;
    }

    public HP lose(final Damage damage) {
        int damageValue = (int) damage.getValue();

        int newHpValue = this.hp - damageValue;
        if (newHpValue < 0) {
            newHpValue = 0;
        }

        return new HP(newHpValue);
    }
}
