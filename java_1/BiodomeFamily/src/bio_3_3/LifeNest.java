import java.util.ArrayList;
import java.util.List;

public class LifeNest {
    private List<Organism> organismList = new ArrayList<>();

    public void push(Organism organism) {
        organismList.add(organism);
        System.out.println("[LifeNest] " + organism.getName() + "(이)가 추가되었습니다.");
    }

    public void pop(Organism organism) {
        organismList.remove(organism);
        System.out.println("[LifeNest] " + organism.getName() + "(이)가 삭제되었습니다.");
    }

    public void print_all() {
        int i = 1;
        System.out.println("\n전체 동식물 목록 출력:");
        for (Organism organism : organismList) {
            System.out.print(i++ + ". ");
            organism.displayInfo();
        }
        System.out.println();
    }
}
