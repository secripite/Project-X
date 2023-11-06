public class Mammal extends Animal {
    private boolean warmBlood;

    public Mammal(String n, String specie, String habit, String vore, String prey, boolean warmBlooded) {
        super(n, specie, habit, vore, prey);
        this.warmBlood = warmBlooded;
    }

    public void giveBirth() {
        System.out.print(name + "(��)�� ");
        if(warmBlood){
            System.out.print("����");
        }
        else {
            System.out.print("����");
        }
        System.out.println(" ���� ������ �¾��.");
    }
}
