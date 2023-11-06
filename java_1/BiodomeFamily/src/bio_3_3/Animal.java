public class Animal extends Organism {
    private String extinguishing_method;
    private String prey;

    public Animal(String n, String specie, String habit, String method, String prey) {
        super(n, specie, habit);
        this.extinguishing_method = method;
        this.prey = prey;
    }

    public void displayInfo() {
        System.out.println(name + ", " + species + ", " + habitat + ", " + extinguishing_method + ", " + prey);
    }
}
