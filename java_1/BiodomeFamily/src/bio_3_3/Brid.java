public class Bird extends Animal {
    private double wingSpan;

    public Bird(String n, String specie, String habitat, String method, String prey, double wingW) {
        super(n, specie, habitat, method, prey);
        this.wingSpan = wingW;
    }

    public void fly() {
        System.out.println(name + "(은)는 " + wingSpan + "cm의 날개로 날 수 있음.");
    }
}
