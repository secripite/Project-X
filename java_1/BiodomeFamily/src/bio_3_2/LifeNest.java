package bio_3_2;

public class LifeNest {

    public static Organism organismList[] = new Organism[1];
    public static int memo[] = new int[1];

    public static void push(String n, String specie, String habit,String character,String life, int i){
        organismList = increaseSize(organismList);
        memo = increaseSize_int(memo);
        organismList[i] = new Organism();
        memo[i] = 1;
        Organism.name_setter(organismList[i], n);
        Organism.species_setter(organismList[i], specie);
        Organism.habitat_setter(organismList[i], habit);
        Organism.characteristic_setter(organismList[i], character);
        Organism.lifeSpan_setter(organismList[i], life);
        System.out.println("[LifeNest] "+Organism.name_getter(organismList[i])+"이/가 추가되었습니다.");
    }

    public static void pop(int i) {
        memo[i] = 0;
        System.out.println("[LifeNest] "+Organism.name_getter(organismList[i])+"이/가 삭제되었습니다.");
    }

    public static void change_habitat(int i,String new_habitat){
        Organism.habitat_setter(organismList[i], new_habitat);
        System.out.println("[LifeNest] " + Organism.name_getter(organismList[i]) + "의 서식지가 변경되었습니다.");
    }

    public static void change_charater(int i,String new_charater){
        Organism.characteristic_setter(organismList[i], new_charater);
        System.out.println("[LifeNest] " + Organism.name_getter(organismList[i]) + "의 특징이 변경되었습니다.");
    }

    public static void searchOrganismByName(String name){
        int flag = 0;
        for(int i = 0; i<organismList.length - 1;i++){
            if(Organism.name_getter(organismList[i]).equals(name)) {
                flag = 1;
                System.out.println(Organism.name_getter(organismList[i])+"은/는 "+Organism.species_getter(organismList[i])+"이며 "+Organism.habitat_getter(organismList[i])+"에 서식합니다.");
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