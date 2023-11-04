package bio_3_1;

public class LifeNest {

    public static Organism organismList[] = new Organism[1];
    public static int memo[] = new int[1];
    public static void push(String n, String specie, String habit,int i){
        organismList = increaseSize(organismList);
        memo = increaseSize_int(memo);
        organismList[i] = new Organism();
        memo[i] = 1;
        organismList[i].name = n;
        organismList[i].species = specie;
        organismList[i].habitat = habit;
        System.out.println("[LifeNest] "+organismList[i].name+"이/가 추가되었습니다.");
    }

    public static void pop(int i) {
        memo[i] = 0;
        System.out.println("[LifeNest] "+organismList[i].name+"이/가 삭제되었습니다.");
    }

    public static void change(int i,String new_habitat){
        organismList[i].habitat = new_habitat;
        System.out.println("[LifeNest] "+organismList[i].name+"의 서식지가 변경되었습니다.");
    }

    public static void searchOrganismByName(String name){
        int flag = 0;
        for(int i = 0; i<organismList.length - 1;i++){
            if(LifeNest.organismList[i].name.equals(name)) {
                flag = 1;
                System.out.println(organismList[i].name+"은/는 "+organismList[i].species+"이며 "+organismList[i].habitat+"에 서식합니다.");
            }
        }
        if(flag == 0){
            System.out.println("존재하지 않는 동물입니다. 다시 입력해 주십세요");
        }
    }

    public static Organism[] increaseSize(Organism[] arr) {
        Organism[] newArr = new Organism[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public static int[] increaseSize_int(int[] arr) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}