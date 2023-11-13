public class Conversion {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 100, 50, 70);
        Pokemon charmander = new Pokemon("Charmander", 80, 70, 30);
        Battle battle = new Battle(pikachu, charmander);
        battle.start();
    }
}
