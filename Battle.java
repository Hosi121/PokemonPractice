import java.util.Random;

public class Battle {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 100, 50, 70, 30);
        Pokemon charmander = new Pokemon("Charmander", 80, 70, 30, 70);
        Random random = new Random();
        boolean pokemon1First = random.nextBoolean();

        while (pikachu.getHp() > 0 && charmander.getHp() > 0) {
            Pokemon attacker;
            Pokemon defender;
            if (pokemon1First) {
                attacker = pikachu;
                defender = charmander;
            } else {
                attacker = charmander;
                defender = pikachu;
            }

            int damage = attacker.attack();
            defender.takeDamage(damage);

            System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + damage + " damage!");

            pokemon1First = !pokemon1First;
        }

        Pokemon winner;
        if (pikachu.getHp() > 0) {
            winner = pikachu;
        } else {
            winner = charmander;
        }

        System.out.println(winner.getName() + " wins the battle!");
    }
}
