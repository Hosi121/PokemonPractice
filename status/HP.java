public class HP {
    private int hp;

    public HP(final int value)
    {
        if(value < 0)
        {
            throw new IllegalArgumentException("HP must be positive.");
        }
        this.hp = value;
    }

    public HP lose(final Damage damage)
    {
        return new HP(this.hp - damage.getValue());
    }
}