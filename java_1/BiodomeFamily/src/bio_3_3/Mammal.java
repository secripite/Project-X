public class Mammal extends Animal {
    private boolean warmBlood;

    public Mammal(String n, String specie, String habit, String vore, String prey, boolean warmBlooded) {
        super(n, specie, habit, vore, prey);
        this.warmBlood = warmBlooded;
    }

    public void giveBirth() {
        System.out.print(name + "(Àº)´Â ");
        if(warmBlood){
            System.out.print("¿ÂÇ÷");
        }
        else {
            System.out.print("³ÃÇ÷");
        }
        System.out.println(" Æ÷À¯ µ¿¹°·Î ÅÂ¾î³µÀ½.");
    }
}
