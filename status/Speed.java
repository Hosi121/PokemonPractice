package Status;

public class Speed{
    private int Speed;
    public Speed(int value) {
       this.Speed = value;
    }
    public int gainSpeed(int value) {
        this.Speed += value;
        return this.Speed;
    }
    public int loseSpeed(int value) {
        this.Speed -= value;
        return this.Speed;
    }

    public int getValue() {
        return this.Speed;
    }
}