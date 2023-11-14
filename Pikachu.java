import java.util.Map;

public class Pikachu implements Pokemon {
    private Status status;

    public Pikachu(String csvFilePath) {
        Map<String, String> pikachuData = CsvReader.readPokemonData(csvFilePath, "Pikachu");
        
        this.status = new Status(
            new Name(pikachuData.get("Name")),
            new Level(5),
            new HP(Integer.parseInt(pikachuData.get("HP"))),
            new AttackPoint(Integer.parseInt(pikachuData.get("Attack"))),
            new DefencePoint(Integer.parseInt(pikachuData.get("Defense"))),
        );
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
