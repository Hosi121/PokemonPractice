import java.util.Set;
import java.util.HashSet;

public class Waza {
    private Set<String> skills;

    public Waza() {
        this.skills = new HashSet<String>();
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public void removeSkill(String skill) {
        this.skills.remove(skill);
    }

    public Set<String> getSkills() {
        return this.skills;
    }
}
