public class Mammal extends Animal {
    private boolean warmBlood;

    public Mammal(String n, String specie, String habit, String vore, String prey, boolean warmBlooded) {
        super(n, specie, habit, vore, prey);
        this.warmBlood = warmBlooded;
    }

    public void giveBirth() {
        System.out.print(name + "(은)는 ");
        if(warmBlood){
            System.out.print("온혈");
        }
        else {
            System.out.print("냉혈");
        }
        System.out.println(" 포유 동물로 태어났음.");
    }
}
