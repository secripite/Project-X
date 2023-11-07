public class Fish extends Animal {
    private int finsCount;

    public Fish(String n, String specie, String habit, String method, String prey, int fin_num) {
        super(n, specie, habit, method, prey);
        this.finsCount = fin_num;
    }

    public void swim() {
        System.out.println(name + "(은)는 " + finsCount + "개의 지느러미로 헤엄침.");
    }
}
