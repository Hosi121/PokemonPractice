public class Test {
    public static void main(String[] args) {
        String csvFilePath = "pokemon.csv";
        Pikachu pikachu = new Pikachu(csvFilePath);
        Status pikachuStatus = pikachu.getStatus();
        System.out.println("Pikachu Status:");
        System.out.println("Name: " + pikachuStatus.getName());
        System.out.println("Level: " + pikachuStatus.getLevel());
        System.out.println("HP: " + pikachuStatus.getHp());
        System.out.println("Attack: " + pikachuStatus.getAttackPoint());
        System.out.println("Defence: " + pikachuStatus.getDefencePoint());
    }
}