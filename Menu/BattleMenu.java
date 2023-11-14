import java.util.List;

public class BattleMenu implements Menu {
    private List<String> actions;
    private int selectedIndex; 

    public BattleMenu(List<String> actions) {
        this.actions = actions;
        this.selectedIndex = 0;
    }

    @Override
    public void displayMenu() {
        System.out.println("Battle Actions:");
        for (int i = 0; i < actions.size(); i++) {
            if (i == selectedIndex) {
                System.out.println("> " + actions.get(i));
            } else {
                System.out.println("  " + actions.get(i));
            }
        }
    }

    @Override
    public void next() {
        selectedIndex = (selectedIndex + 1) % actions.size();
    }

    @Override
    public void previous() {
        selectedIndex = (selectedIndex - 1 + actions.size()) % actions.size();
    }

    @Override
    public String getSelectedItem() {
        return actions.get(selectedIndex);
    }
}
