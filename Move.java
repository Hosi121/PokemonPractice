import Status.Name;
import Type.Type;

public class Move {
    private Name name;
    private Type type;
    private int power;

    public Move(Name name, Type type, int power) {
        this.name = name;
        this.type = type;
        this.power = power;
    }

    public Name getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getPower() {
        return power;
    }
}