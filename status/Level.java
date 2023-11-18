package Status;

public class Level{
    private int level;
    public Level(int value) {
       this.level = value;
    }
    public int gainLevel(int value) {
        this.level += value;
        return this.level;
    }

    public int getValue() {
        return this.level;
    }
}