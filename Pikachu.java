public class Pikachu implements Pokemon {
    private Status status;

    public Pikachu(Status status) {
        this.status = status;
    }

    @Override
    public void attack(Pokemon opponent) {
        System.out.println("Pikachu attacks!");
        opponent.defend();
    }

    @Override
    public void defend() {
        System.out.println("Pikachu defends!");
    }

    @Override
    public void useSpecialMove() {
        System.out.println("Pikachu uses Thunderbolt!");
    }

    @Override
    public Status getStatus() {
        return status;
    }
}
